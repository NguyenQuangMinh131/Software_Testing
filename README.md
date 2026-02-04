<img width="1528" height="857" alt="ketquatest" src="https://github.com/user-attachments/assets/a6b3287c-8888-4e91-b0ec-4c69833d0ea0" /># 🎨 Báo cáo Thực hành Kiểm thử Giao diện (UI Testing)

> **Chủ đề:** Rèn luyện tư duy thiết kế và kiểm thử giao diện người dùng qua "Can't Unsee".
> **Công cụ thực hiện:** [Can't Unsee](https://cantunsee.space/)
> **Trạng thái:** ✅ Đã hoàn thành

## 🏆 Kết quả đạt được

Hệ thống đã ghi nhận kết quả hoàn thành bài thi với các chỉ số chi tiết như sau:

* **Tổng điểm (Score):** `6430`
* **Thời gian hoàn thành:** `00:15:58`


<img width="1045" height="464" alt="image" src="https://github.com/user-attachments/assets/54ff866d-b693-440f-986a-c4ffc2a2fe0d" />

---
*Bài tập thực hành môn Kiểm thử phần mềm - 2026*
# Bài tập Kiểm thử Đơn vị (Unit Test) - StudentAnalyzer

## 1. Thông tin sinh viên
- **Họ tên:** Nguyễn Quang Minh
- **Mã sinh viên:** BCS230057
- **Môn học:** Kiểm thử phần mềm

## 2. Mô tả chức năng
Dự án xây dựng lớp `StudentAnalyzer` để xử lý điểm số học sinh:
- **countExcellentStudents:** Đếm số học sinh Giỏi (điểm >= 8.0). Tự động loại bỏ điểm sai (<0 hoặc >10).
- **calculateValidAverage:** Tính điểm trung bình cộng của các điểm hợp lệ.

## 3. Danh sách ca kiểm thử (Test Cases)
Đã thực hiện kiểm thử tự động với JUnit 5 bao gồm các trường hợp:
1. **Normal Case:** Danh sách có cả điểm hợp lệ, không hợp lệ, điểm giỏi và không giỏi.
2. **Boundary Case:** Danh sách rỗng, danh sách null.
3. **Edge Case:** Danh sách chứa điểm biên (0.0, 10.0).

## 4. Hướng dẫn chạy
1. Mở dự án bằng VS Code hoặc IntelliJ.
2. Đảm bảo đã cài đặt thư viện JUnit 5.
3. Chạy file  `test/StudentAnalyzerTest.java`.

<img width="417" height="550" alt="c61eee1a-8ac0-4075-97e7-910923cbfb56" src="https://github.com/user-attachments/assets/2afd1779-21a7-4fb1-8431-1ed232ff104f" />


---
# Báo cáo Bài tập: Kiểm thử hiệu năng với JMeter

**Sinh viên:** Nguyễn Quang Minh - BCS230057
**Website kiểm thử:** Wikipedia (https://www.wikipedia.org)

## 1. Thiết lập kịch bản (Test Plan)
Tôi đã thiết lập 3 kịch bản kiểm thử (Thread Groups) theo yêu cầu:
1.  **Basic Test:** 10 Users, lặp 5 lần. Kiểm tra truy cập trang chủ.
2.  **Heavy Load:** 20 Users, Ramp-up 30s. Kiểm tra khả năng chịu tải khi truy cập trang chủ và trang tìm kiếm.
3.  **Duration Test:** 20 Users, chạy liên tục trong 60 giây. Kiểm tra độ ổn định theo thời gian.

*Kỹ thuật áp dụng:* Sử dụng **HTTP Header Manager** để giả lập trình duyệt Chrome (User-Agent), giúp vượt qua cơ chế chặn bot của Wikipedia.

## 2. Kết quả thực nghiệm
- **Tổng số mẫu thử (Samples):** 137 requests.
- **Tỷ lệ lỗi (Error Rate):** 0.00% (Thành công tuyệt đối).
- **Thông lượng (Throughput):** ~1.7 requests/giây.
- **Thời gian phản hồi trung bình:** ~8 giây (Do kết nối đến máy chủ quốc tế).

## 3. Minh chứng
Dưới đây là ảnh chụp màn hình kết quả chạy thực tế trên JMeter:

![Ket qua test](<img width="1528" height="857" alt="ketquatest" src="https://github.com/user-attachments/assets/dd1c268e-e23a-40e7-a099-89eaa3b7bbf8" />
)

