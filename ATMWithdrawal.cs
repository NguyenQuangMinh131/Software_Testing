using System;

public class ATMWithdrawal {
    public static void Main(string[] args) {
        // (1) Định nghĩa số dư
        int balance = 100;     
        
        // (2) Định nghĩa số tiền rút
        int withdraw = 80;      

        // (3) KIỂM TRA ĐIỀU KIỆN
        if (withdraw <= balance) {  
            // (4) CẬP NHẬT DỮ LIỆU
            balance = balance - withdraw; 
        }

        // (5) XUẤT KẾT QUẢ
        Console.WriteLine(balance);         
    }
}
