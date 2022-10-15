/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vta.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.vta.mathutil.core.MathUtil.getFactorial;
/**
 *
 * @author vutha
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //1. Chuẩn bị bộ data, là mảng 2 chiều, 2 cột ứng với Expected và n
    //                                        dòng ứng với các test case
    
    //mảng Object, số thì dùng wrapper class - class gói các primitive
    //Interger -> int, Long -> long 
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20, 25}; //Liệt kê các phần tử mảng cách nhau dấu phẩy
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
        
//        int c[][] = {{1, 0},
//                    {1, 1}, 
//                    {2, 2}, 
//                    {6, 3}, 
//                    {24, 4}, 
//                    {120, 5}, 
//                    {720, 6}
//                    };
        return new Integer[][] {{1, 0},
                    {1, 1}, 
                    {2, 2}, 
                    {6, 3}, 
                    {24, 4}, 
                    {120, 5}, 
                    {720, 6}
                    };
    }
    
    //Ta sẽ map/ánh xạ các cột của mỗi dòng, ví dụ dòng đầu tiên
    //có 2 cột là 1 0 -> ta sẽ ánh xạ 1 vào biến expected, 0 vào biến n 
    //tương tự cho các dòng còn lại 
    @Parameterized.Parameter(value = 0)
    public long expected;
    
    @Parameterized.Parameter(value = 1)
    public int n; //map vào cột 1 của mảng
    
    @Test //kiểm thử các test case với data được trích ra từ mảng map
          //vào 2 biến tương ứng
    public void testFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, getFactorial(n));
    }
}


//Phân tích cách ta viết code cho phần test hàm getF() hôm trước
// Assert.assertEquals(???, MathUtil.getFactorial(???)); lệnh dùng để test hàm
//Lệnh này lặp đi lặp lại cho các data ta đứa vào
//để ta kiểm tra các tình huống xìa hàm/ test case
//Lát hồi ta thay data 1 0 thành các data tương ứng khác 
//Ví dụ
//Expected  n!
//1         0 -> có ổn không
//1         1
//2         2
//6         3
//24        4
//...

// Assert.assertEquals(???, MathUtil.getFactorial(???));
//Nếu TA CÓ ĐƯỢC CÁCH NÀO ĐÓ. MÀ TÁCH ĐÁM DATA RA RIÊNG 1 CHỖ
//SAU ĐÓ TỪ TỪ NHỒI/MÓM DATA NÀY VÀO CÂU LỆNH TEST HÀM Ở TRÊN
//COI NHƯ CHỈ CẦN 1 LỆNH GỌI TEST HÀM, DÂT CỨ THỂ TUẦN TỰ ĐẨY VÀO
//KĨ THUẬT TÁCH DATA RA KHỎI CÁC CÂU LỆNH TEST, SAU ĐÓ NHỒI NÓ VÔ
//CÁC CÂU LỆNH TEST, GIÚP RÚT GỌN SỐ CÂU LỆNH TEST, GIÚP DỄ DÀNG
//KIỂM TRA TÍNH THIẾU ĐỦ CỦA CÁC TEST CASE
//KĨ THUẬT NÀY GỌI TÊN LÀ DDT - DATA DRIVEN TESTING
//Viết code kiểm thử hướng theo tách data
//CÒN GỌI 1 TÊN KHÁC LÀ: KIỂM THỬ THEO KIỂU THAM SỐ HÓA - PARAMETERIZE
//Dấu ??? ở câu lệnh gọi hàm chính là tên biến sẽ dùng để nhận 
//data từ 1 tập data đã tách ra - CONVERT DATA THÀNH BIẾN

//Chơi với DDT ta cần
//Bộ data test - tách riêng
//Các tham số ứng với bộ data - chính là các biến dùng trích data ra
//Gọi hàm kiểm thử xài các tham số

//TOÀN BỘ CODE TRONG CLASS NÀY ĐƯỢC VIẾT RA DÙNG ĐỂ TEST CODE CHÍNH Ở 
//BÊN SRC PACKAGES
//CODE ĐƯỢC VIẾT RA DÙNG ĐỂ ĐI TEST CODE KHÁC
//THÌ CODE NÀY ĐƯỢC GỌI LÀ TEST SCRIPT
//1 TEST SCRIPT SẼ CHỨA NHIỀU CODE ĐỂ TEST HÀM CHÍNH
//1 TEST SCRIPT SẼ CHỨA NHIỀU TEST CASE
//                            TEST CASE: CÁC TÌNH HUỐNG XÀI HÀM
//1 TEST SCRIPT CÓ THỂ XÀI DDT ĐỂ DỄ BẢO TRÌ CODE TEST 
//VIẾC VIẾT CODE CHÍNH CÓ THỂ XÀI TDD






















