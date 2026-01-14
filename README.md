# Software_Testing
Bài 1: <img width="1045" height="464" alt="image" src="https://github.com/user-attachments/assets/54ff866d-b693-440f-986a-c4ffc2a2fe0d" />

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
3. Chạy file `test/StudentAnalyzerTest.java`.
