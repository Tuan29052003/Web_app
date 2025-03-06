# Kế Hoạch Dự Án Quản Lý Khách Sạn

## 1. Mục Tiêu Dự Án
Dự án nhằm xây dựng một hệ thống quản lý khách sạn giúp tối ưu hóa quy trình đặt phòng, thanh toán, quản lý nhân viên và các dịch vụ khách sạn.

---

## 2. Thông Tin Dự Án
- **Dự án**: Quản lý khách sạn
- **Khung thời gian của dự án**: `NGÀY BẮT ĐẦU - NGÀY KẾT THÚC`
- **Tài liệu đính kèm**:
  - Kế hoạch > Nhu cầu tài nguyên
  - Đề xuất dự án > Đối tượng mục tiêu và lợi ích
  - Phương pháp phát triển phần mềm
  - Thuật ngữ
- **Tác động của quy trình**:
  - Kế hoạch này sẽ được sử dụng để đánh giá và quản lý dự án.
  - Các giả định chính ảnh hưởng đến kế hoạch phải được ghi lại.
  - Kế hoạch dự án sẽ được cập nhật trong suốt vòng đời của dự án.

---

## 3. Tóm Tắt Dự Án
### Các thành phần chính:
- Quản lý đặt phòng
- Quản lý khách hàng
- Quản lý dịch vụ
- Hệ thống thanh toán
- Báo cáo và phân tích
- Quản lý nhân viên

### Công nghệ sử dụng:
- **Ngôn ngữ lập trình**: Java
- **Cơ sở dữ liệu**: MySQL
- **Framework**: Spring Boot

---

## 4. Tóm Tắt Phương Pháp Luận
- **Mô hình phát triển**: MicroService
- **Phương pháp quản lý**: Scrum
  - Mỗi sprint kéo dài 2 tuần với các cuộc họp đánh giá.

### Nhân sự:
| Vị trí | Số lượng |
|--------|----------|
| Quản lý dự án | 1 |
| Lập trình viên | 3 |
| Kiểm thử viên | 1 |

### Công cụ sử dụng:
- Trang web dự án
- Hệ thống theo dõi lỗi
- Hệ thống kiểm soát phiên bản (Git)
- Hệ thống kiểm tra đơn vị tự động (JUnit, Selenium)

---

## 5. Cấu Trúc Phân Chia Công Việc (WBS) và Ước Tính
| Bước | Mô Tả | Ước Tính (giờ) |
|------|------------|----------------|
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

---

## 6. Lịch Trình Bản Phát Hành
| Nhiệm vụ \ Tuần | W-01 | W-02 | W-03 | W-04 | W-05 | W-06 | W-07 | W-08 | W-09 | W-10 | W-11 | W-12 |
|-----------------|------|------|------|------|------|------|------|------|------|------|------|------|
| 1.1 | 10 | 10 | 10 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
| 2.1 | 15 | 15 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
| 3.2 | 5 | 5 | 5 | 5 | 5 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
| 4.1.A | 0 | 0 | 10 | 10 | 10 | 10 | 10 | 10 | 10 | 10 | 10 | 10 |

---

## 7. Quản Lý Rủi Ro

### Danh sách rủi ro chính và biện pháp giảm thiểu:
- **Xung đột giữa giao diện chất lượng cao và khả năng tùy chỉnh** → Thiết kế linh hoạt.
- **Khó khăn kỹ thuật** → Đào tạo và kiểm tra thiết kế.
- **Lịch trình ngắn** → Ưu tiên lõi chức năng.
- **Hiệu suất hệ thống kém** → Đánh giá thiết kế CSDL.
- **Hiểu sai yêu cầu** → Giao tiếp thường xuyên với khách hàng.
- **Khách hàng thay đổi yêu cầu** → Xây dựng quy trình quản lý thay đổi.
- **Mất tài nguyên (thành viên nghỉ việc, v.v.)** → Nhóm dự phòng và chuyển giao công việc.

---

## 8. Kiểm Tra Và Cải Tiến Kế Hoạch
- Xem xét bảng đánh giá rủi ro.
- Thảo luận với nhóm để cải thiện kế hoạch.
- Đánh giá lại theo tiêu chuẩn chuyên nghiệp.

---

📌 *Lưu ý:* Lịch trình và kế hoạch có thể thay đổi dựa trên tình hình thực tế.
