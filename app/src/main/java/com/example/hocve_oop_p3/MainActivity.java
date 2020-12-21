package com.example.hocve_oop_p3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends BaseActivity {


        // Non access modifier : thay đổi tính chất của biến , đối tượng , phương thức
        //final: Thay đổi biến thành hằng số và không được gán lại
        // static: Giá trị hiển nhiên không phải khởi tạo ra object để gọi được giá trị này
        // overload: phương thức nạp chồng :1 : Tên phương thức giống nhau
                                           // 2 : Giá trị truyền vào khác nhau
                                          //  3 : Phạm vi cùng 1 class

    //override: phương thức ghi đè: 1 : Phương thức ghi đè nằm 2 nơi khác , không cùng 1 class
                                   // 2 : Chỉ thay đổi thân hàm
                                //    3 : Đặc điểm nhận biết có anotation @Override


    @Override
    int getLayout() {
        return 0;
    }

    @Override
    int showtoast() {
        return 0;
    }

    @Override
    int showerror() {
        return 0;
    }

    @Override
    int loading() {
        return 0;
    }


}
