package com.vta.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;


public class MathUtilTest {
    
    //Ta đi test ngoại lệ, tức là so sánh, đo lường xem ngoại lệ
    //có xuất hiện hay không khi ta đưa data cà chớn, n < 0 || n>20
    //thay vì so sánh expected value vs. actual value
    //LÚC NÀY TA SẼ ĐI SO SÁNH/ƯỚC LƯỢNG XEM NGOẠI LỆ CÓ XUẤT HIỆN NHƯ KÌ VỌNG
    //HAY KHÔNG, NẾU CÓ XH NHƯ KÌ VỌNG, SURE, HÀM THIẾT KẾ NGON
    //NẾU NGOẠI LỆ XH NHƯ KÌ VỌNG, THÌ MÀU XANH - THẤY MÀU ĐỎ NGOẠI LỆ MỪNG 
    
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowException(){
        //Test case #3: đưa data cà chớn, n âm, n quá lớn
        //              hàm được thiết kế ném về ngoại lệ
        //Thấy ngoại lệ mừng rơi nước mắt khi đưa về -5
        //thấy ngoại lệ xuất hiện như kì vọng -> passed cái test -> màu xanh
        System.out.println("Hope to see the Exception | Illegal Argument Exception");
        MathUtil.getFactorial(-5);
        
    }
    
    @Test
        public void testFactorialGivenRightArgumentReturnsWell2(){
 
        //Test case #4: n=3, hy vọng hàm trả về 6, thực tế??
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5: n=4, hy vọng hàm trả về 24, thực tế??
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        //Test case #5: n=5, hy vọng hàm trả về 120, thực tế??
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }

    
    @Test  //coding convention - quy tắc viết code
            //tên hàm kiểm thử/tên hàm của test script
           //phải nói lên ý nghĩa của việc kiểm thử
            //tình huống này, ta muốn test hàm getF() tham số tử tế
           //n= 0..20!!!
    public void testFactorialGivenRightArgumentReturnsWell(){
        //Test case số #1: n=0, hy vọng hàm trả về 1
        //                      thực tế hàm trả về ???
        long expected = 1;
        long actual = MathUtil.getFactorial(0); //hàm chạy mới biết
                 //so sánh giữa expected vs. actual, máy tự so
                 //sout() khổ cực
        Assert.assertEquals(expected, actual);
        
        //Test case #2: n=1, hy vọng hàm trả về 1, thực tế??
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        
        //Test case #3: n=2, hy vọng hàm trả về 2, thực tế??
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        
    }
    
    //@Test ra lệnh cho thư viện JUnit đã add/import
    //tự động generate ra cái hàm public static void main()
    //biến hàm trỵUnitComparison() thành hàm main()
    //và gửi main() này cho JVM chạy - Jave Virtual Machine
    //@Test ~~~ main()
    //không @Test thì class không có main(), lấy gì mà chạy no runable method
    
    @Test
    public void tryJUnitComparison(){
        //hàm này thử nghiệm việc so sánh expected vs, actual
        //coi sai đúng ra màu thế nào
        //ta đang xài hàm của thư viện JUnit nhưng không xài bữa bãi
        //mà phải viết theo quy tắc định trước
        //quy tắc định trước hàm ở @ - annotation
        
        Assert.assertEquals(100, 100);
        
    }
    
}
 //CLASS NÀY DEV SẼ VIẾT NHỮNG CÂU LỆNH DÙNG ĐỂ TEST HÀM
//CỦA CODE CHÍNH, TÉT CÁC HÀM CỦA CLASS MATHUTILL
//Trong class này sẽ có những lời gọi hàm getFactorial()
//có những lệnh so sánh giữa EXPECTED và ACTUAL
//giống giống mình đã làm test ở bên MAIN()
//Nhưng khác ở chỗ, SAI--> Màu đỏ, ĐÚNG--> Màu xanh
//Mắt không cần nhìn các dòng output từ hàm System.out cho mất sức
//mắt giờ chỉ nhìn 2 màu xanh đỏ
//muốn có được điều này ta sẽ dùng thêm cái UNIT TESTING FRAMEWORK
//Ví dụ: JUnit, TestNG (Java)
//      xUnit, MSTest, NUnit (C#)
//      PHPUnit (PHP)
//      ...

//VIỆC VIẾT CODE ĐỂ TEST CODE GỌI LÀ UNIT TESTING 
//ĐOẠN CODE TRONG CLASS NÀY DÙNG JUNIT/UNIT TESTING FRAMEWORK
//ĐỂ KIỂM THỬ HÀM CỦA CODE CHÍNH
//ĐOẠN CODE KIỂM THỬ NÀY ĐƯỢC GỌI LÀ: TEST SCRIPT
//Code dùng để test code (chính) gọi là test script
//Test script là các đoạn code được viết ra để test code chính (DAO,
//DTO, Controller, API,..)
//Muốn test thì cần phải phác thảo các TEST CASE
//Test Script sẽ dử dụng các Test Case 
//Ví dụ: Viết code để test hàm getFactorial() với các case
//n = -5. 0, 1,...

//QUY TẮC XANH ĐỎ
//MÀU XANH KHI TẤT CẢ CÁC TEST CASE PHẢI CÙNG LÀ XANH, TỨC LÀ EXPECTED == ACTUAL
//cho tất cả các tình huống test

//*MÀU ĐỎ: CHỈ CẦN 1 TRONG NHỮNG TEST CASE, CHỈ CẦN 1 EXPECTED != ACTUAL
//KẾT LUẬN MẠNH TAY/GẮT: HÀM SAI QUÁ SAI

//Ý nghĩa của quy tắc: nếu đã test, nếu đã liệt kê các test case, thì chúng phải đúng hết
//còn chỉ cần 1 thằng sai, hàm không ổn định về việc return -> hàm sai
//ĐÚNG ĐÚNG HẾT, SAI CHỈ CẦN 1 THẰNG 

//EXPECTED == ACTUAL -> CASE ĐÚNG, TEST CASE PASSED
//EXPECTED != ACTUAL -> CASE FAILED 
        //NẾU EXPECTED LÀ CHÍNH XÁC, HÀM ĐÃ XỬ LÍ SAI, BUG
        //CŨNG CÓ KHI EXPECTED, CÁI TA KÌ VỌNG BỊ SAI!!! LỖI DO DÂN QC TÍNH TOÁN
        //BẰNG TAY BỊ SAI!!!












