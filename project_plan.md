# Kế Hoạch Dự Án Quản Lý Khách Sạn

## 1. Mục Tiêu Dự Án
Dự án nhằm xây dựng một hệ thống quản lý khách sạn giúp tối ưu hóa quy trình đặt phòng, thanh toán, quản lý nhân viên và các dịch vụ khách sạn.

## 2. Thông Tin Dự Án
- **Dự án:** Quản lý khách sạn
- **Khung thời gian của dự án:** 03/03/2025 - 03/06/2025
- **Tài liệu đính kèm:**
  - Kế hoạch > Nhu cầu tài nguyên
  - Đề xuất dự án > Đối tượng mục tiêu và lợi ích
  - Phương pháp phát triển phần mềm
  - Thuật ngữ
- **Tác động của quy trình:**
  - Kế hoạch này sẽ được sử dụng để đánh giá và quản lý dự án.
  - Các giả định chính ảnh hưởng đến kế hoạch phải được ghi lại.
  - Kế hoạch dự án sẽ được cập nhật trong suốt vòng đời của dự án.

## 3. Tóm Tắt Dự Án
### Các Thành Phần Chính:
- Quản lý đặt phòng
- Quản lý khách hàng
- Quản lý dịch vụ
- Hệ thống thanh toán
- Báo cáo và phân tích
- Quản lý nhân viên

### Công Nghệ Sử Dụng:
- **Ngôn ngữ lập trình:** Java
- **Cơ sở dữ liệu:** MySQL, PostgreSQL
- **Framework:** Spring Boot

## 4. Tóm Tắt Phương Pháp Luận

### Phương Pháp Phát Triển: **Agile Scrum**
### Nhân Sự:
- **Quản lý dự án:** 1 người
- **Lập trình viên:** 3 người
- **Kiểm thử viên:** 1 người

### Tổ chức nhóm dự án:
- **Nhóm phát triển:** Gồm lập trình viên backend, frontend, tester
- **Ban kiểm soát thay đổi:** Quản lý dự án, trưởng nhóm kỹ thuật, đại diện khách hàng

### Công Cụ Sử Dụng:
- Trang web dự án
- Công cụ CI/CD
- Hệ thống kiểm soát phiên bản (**Git**)
- Hệ thống kiểm tra đơn vị tự động (**JUnit, Selenium**)
- Hệ thống quản lý cơ sở dữ liệu (**MySQL, PostgreSQL**)

### Phụ thuộc vào kế hoạch dự án:
-	Không có xung đột nguồn lực với các dự án khác.
-	Không có phụ thuộc vào các dự án khác.
-	Không có dự án nào khác phụ thuộc vào dự án này.

### Kiểm soát thay đổi:
- Yêu cầu thay đổi sẽ được theo dõi trong trình theo dõi lỗi.
-	Sau khi hoàn thành mốc tính năng, không bổ sung tính năng mới vào bản phát hành.

## 5. Cấu Trúc Phân Chia Công Việc (WBS) và Ước Tính
| Bước  | Mô Tả | Ước Tính (giờ) |
|---|---|---|
| 1 | Chuẩn bị |  |
| 1.1 | Đào tạo lập trình viên | 30 |
| 2 | Khởi đầu |  |
| 2.1 | Thu thập yêu cầu | 30 |
| 2.2 | Đặc tả yêu cầu | 20 |
| 2.3 | Xác thực yêu cầu | 10 |
| 3 | Phát triển |  |
| 3.1 | Thiết kế cấp cao | 5 |
| 3.2 | Thiết kế cấp thấp |  |
| 3.2.A | Thiết kế đối tượng | 10 |
| 3.2.B | Thiết kế giao diện | 10 |
| 3.2.C | Thiết kế cơ sở dữ liệu | 3 |
| 4 | Thi công |  |
| 4.1.A | Triển khai hệ thống |  |
| 4.1.A.1 | Triển khai đặt phòng | 25 |
| 4.1.A.2 | Triển khai quản lý khách hàng | 25 |
| 4.1.A.3 | Triển khai quản lý dịch vụ | 25 |
| 4.1.A.4 | Triển khai thanh toán | 25 |
| 4.1.B | Tài liệu kỹ thuật | 10 |
| 4.1.C | Hướng dẫn sử dụng | 10 |
| 4.1.D | Kiểm tra |  |
| 4.1.D.1 | Lập kế hoạch kiểm tra | 10 |
| 4.1.D.2 | Kiểm tra mã nguồn | 30 |
| 4.1.D.3 | Kiểm thử hệ thống | 10 |
| 5 | Chuyển giao |  |
| 5.A | Phát hành phiên bản | 3 |
| 5.B | Tài liệu cho đội vận hành | 3 |
| 6 | Phản hồi |  |
| 6.1 | Báo cáo đánh giá | 10 |
| **Tổng cộng** |  | **329** |

## 6. Các Sản Phẩm Trong Bản Phát Hành Này
| Tên Sản Phẩm | Mô Tả | Ngày Giao |
|---|---|---|
| Hệ thống đặt phòng | Quản lý phòng, khách hàng đặt chỗ | DD/MM/YYYY |
| Hệ thống quản lý dịch vụ | Quản lý dịch vụ khách sạn | DD/MM/YYYY |
| Hệ thống thanh toán | Xử lý thanh toán trực tuyến | DD/MM/YYYY |

## 7. Lịch Trình Bản Phát Hành
| Nhiệm vụ \ Tuần | W-01 | W-02 | W-03 | W-04 | W-05 | W-06 | W-07 | W-08 | W-09 | W-10 | W-11 | W-12 |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 10 | 10 | 10 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
| 2 | 15 | 15 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
| 3 | 5 | 5 | 5 | 5 | 5 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
| 4.1.A | 0 | 0 | 10 | 10 | 10 | 10 | 10 | 10 | 10 | 10 | 10 | 10 |
| 4.1.B | 0 | 0 | 10 | 10 | 10 | 0 | 10 | 0 | 10 | 0 | 10 | 10 |
| 4.2 | 0 | 0 | 10 | 10 | 10 | 0 | 10 | 0 | 10 | 0 | 10 | 10 |
| 5 | 15 | 15 | 0 | 0 | 0 | 0 | 10 | 0 | 0 | 10 | 0 | 0 |

### Ghi chú:
- Lịch trình sẽ được cập nhật khi có sự thay đổi.
- Các bước triển khai có thể thực hiện song song để tối ưu thời gian.

## 8. Quản Lý Rủi Ro
### Danh Sách Rủi Ro Chính Và Biện Pháp Giảm Thiểu:
- **Xung đột giữa giao diện chất lượng cao và khả năng tùy chỉnh**
  - Giải pháp: Thiết kế giao diện linh hoạt và tham khảo ý kiến của nhà thiết kế web có kinh nghiệm trong lĩnh vực này.
- **Khó khăn kỹ thuật**
  - Giải pháp: Xác định phạm vi dự án sao cho có đủ thời gian đào tạo và kiểm tra.
- **Lịch trình ngắn**
  - Giải pháp: Xác định lõi chức năng quan trọng trước, các tính năng khác triển khai sau.
- **Hiệu suất hệ thống ảnh hưởng bởi thiết kế cơ sở dữ liệu**
  - Giải pháp: Đánh giá với DBA giàu kinh nghiệm hoặc thuê chuyên gia tư vấn.
- **Khách hàng thay đổi yêu cầu**
  - Giải pháp: Xây dựng quy trình quản lý thay đổi, đánh giá tác động trước khi thực hiện.

## 9. Phụ Thuộc Vào Kế Hoạch Dự Án
### Xung đột hoặc cạnh tranh nguồn lực?
- Có, chúng tôi mỗi người có thể dành 3 giờ cho dự án.

### Bảo trì các phiên bản trước?
- Không, đây là bản phát hành đầu tiên.

### Dự án có phụ thuộc vào dự án khác không?
- Có, các dự án liên quan được đảm bảo sẽ hoàn thành đúng tiến độ.

### Dự án khác có phụ thuộc vào dự án này không?
- Có, cần hỗ trợ các nhóm dự án liên quan.

### Có các phụ thuộc quan trọng nào khác không?
- Không, mọi thứ đã được đề cập ở trên.

## 10. Kiểm Tra Và Cải Tiến Kế Hoạch
- Xem xét bảng đánh giá rủi ro để đảm bảo tính khả thi.
- Thảo luận với nhóm để cải thiện kế hoạch dự án.
- Đánh giá lại theo tiêu chuẩn chuyên nghiệp để đảm bảo chất lượng.
