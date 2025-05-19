package com.phegondev.PhegonHotel.utils;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import io.jsonwebtoken.security.Keys;
import java.util.List;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.function.Function;

@Service
public class JWTUtils {


    private static final long EXPIRATION_TIME = 1000 * 60 * 24 * 7;

    private final SecretKey Key;

    public JWTUtils() {
        String secreteString = "843567893696976453275974432697R634976R738467TR678T34865R6834R8763T478378637664538745673865783678548735687R3";
        byte[] keyBytes = Base64.getDecoder().decode(secreteString.getBytes(StandardCharsets.UTF_8));
        this.Key = new SecretKeySpec(keyBytes, "HmacSHA256");
        // this.key = Keys.hmacShaKeyFor(keyBytes);

    }

    public String generateToken(UserDetails userDetails) {
        String role = userDetails.getAuthorities().stream()
                            .findFirst()
                            .map(a -> a.getAuthority())
                            .orElse("USER");
        String tokens= Jwts.builder()
                .claim("role", role)
                .subject(userDetails.getUsername())
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(Key)
                .compact();
        System.out.println("Nhận được token:" + tokens);
        return tokens;
    }

    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    public <T> T extractClaims(String token, Function<Claims, T> claimsTFunction) {
        return claimsTFunction.apply(Jwts.parser().verifyWith(Key).build().parseSignedClaims(token).getPayload());
    }

    public boolean isValidToken(String token, UserDetails userDetails) {
        final String username = extractUsername(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }
    public Claims extractAllClaims(String token) {
        System.out.println("Token nhận được để giải mã: " + token);

        Claims claim = Jwts.parser()             
                   .verifyWith(Key)   
                   .build()             
                   .parseSignedClaims(token) 
                   .getPayload();
        String role = claim.get("role", String.class);
        System.out.println("Role trong token: " + role);        
        return claim;
    }
    
    public boolean isTokenValid(String token) {
        try {
            extractAllClaims(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public String extractRoles(String token) {
        Claims claims = extractAllClaims(token);
        System.out.println("All claims: " + claims);

        return claims.get("role", String.class); // trả về String
    }
    
    private boolean isTokenExpired(String token) {
        return extractClaim(token, Claims::getExpiration).before(new Date());
    }
}
