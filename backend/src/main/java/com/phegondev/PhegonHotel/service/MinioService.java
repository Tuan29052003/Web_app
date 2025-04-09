package com.phegondev.PhegonHotel.service;

import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.errors.MinioException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

@Service
public class MinioService {

    @Value("${minio.endpoint}")
    private String minioEndpoint;

    @Value("${minio.access.key}")
    private String minioAccessKey;

    @Value("${minio.secret.key}")
    private String minioSecretKey;

    private final String bucketName = "phegon-hotel-mongo";

    public String saveImageToMinio(MultipartFile photo) {
        try {
            MinioClient minioClient = MinioClient.builder()
                    .endpoint(minioEndpoint)
                    .credentials(minioAccessKey, minioSecretKey)
                    .build();

            InputStream inputStream = photo.getInputStream();

            minioClient.putObject(
                    PutObjectArgs.builder()
                            .bucket(bucketName)
                            .object(photo.getOriginalFilename())
                            .stream(inputStream, photo.getSize(), -1)
                            .contentType(photo.getContentType())
                            .build()
            );

            return minioEndpoint + "/" + bucketName + "/" + photo.getOriginalFilename();

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to upload image to MinIO: " + e.getMessage());
        }
    }
}
