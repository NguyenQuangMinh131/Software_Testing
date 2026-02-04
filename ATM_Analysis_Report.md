# Báo cáo Phân tích: CFG vs DFG (Ví dụ ATM)

## 1. Mở đầu: Bản đồ và Kiện hàng

Thưa thầy, để hiểu về kiểm thử cấu trúc và dữ liệu, em xin so sánh qua ví dụ ATM:
*   **CFG (Control Flow Graph)** giống như **bản đồ chỉ đường (Google Maps)**: Quan tâm xe chạy qua những con phố nào.
*   **DFG (Data Flow Graph)** giống như **ứng dụng theo dõi đơn hàng (Tracking App)**: Quan tâm kiện hàng (dữ liệu) được xử lý ra sao.

## 2. Phân tích CFG (Bản đồ chỉ đường)

**Định nghĩa:** Là đồ thị biểu diễn luồng thực thi (các con đường) mà chương trình có thể đi qua.

**Trong ví dụ ATM:**
*   **Luồng đi:** (1) -> (2) -> (3).
*   **Ngã rẽ tại (3):**
    *   *Nhánh True (Đủ tiền):* Đi qua (4) (Trừ tiền) -> (5) (In kết quả).
    *   *Nhánh False (Thiếu tiền):* Nhảy thẳng từ (3) xuống (5).

**Mục tiêu kiểm thử:**
Đảm bảo xe đi hết các ngõ ngách (Branch Coverage). Ta cần 2 test case:
1.  Rút thành công (withdraw <= balance)
2.  Rút thất bại (withdraw > balance)

## 3. Phân tích DFG (Hành trình kiện hàng)

**Định nghĩa:** Là đồ thị tập trung vào vòng đời của biến số (dữ liệu), từ lúc sinh ra đến lúc dùng.

**Hành trình của biến `balance`:**
*   **(1) Khởi tạo (Def):** `balance` được sinh ra với giá trị 100.
*   **(3) Sử dụng (P-Use):** Được mang ra so sánh trong điều kiện `if`.
*   **(4) Thay đổi (Def):** Bị gán giá trị mới (trừ đi số tiền rút).
*   **(5) Sử dụng (C-Use):** Được mang ra để in kết quả `Console.WriteLine`.

**Mục tiêu kiểm thử:**
Phát hiện lỗi logic dữ liệu. Ví dụ: Nếu tính toán xong ở (4) mà quên in ra ở (5), hoặc dùng biến chưa khởi tạo.

## 4. Kết luận

*   **CFG** giúp đảm bảo bao phủ **Cấu Trúc** (Code chạy hết các dòng).
*   **DFG** giúp đảm bảo tính đúng đắn của **Dữ Liệu** (Biến được tính toán và dùng đúng).

Hai phương pháp này bổ trợ cho nhau để đảm bảo chương trình vừa chạy đúng luồng, vừa xử lý đúng dữ liệu.
