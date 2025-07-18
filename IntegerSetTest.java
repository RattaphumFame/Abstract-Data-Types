

public class IntegerSetTest {
    public static void main(String[] args) {
        // Test 1: การสร้าง, เพิ่มข้อมูล, และการเรียงลำดับ
        IntegerSet f = new IntegerSet();
        f.add(50);
        f.add(60);
        String Test1 = "[50, 60]";
        if (f.toString().equals(Test1)) {
            System.out.println("Pass");
        }else{
        
            System.out.println("Fail");
        }
        // Test 2:  ลบข้อมูล
        f.remove(80);
          String Test2 = "[50, 80]";
        if (f.toString().equals(Test2)) {
             System.out.println("Pass");
        }else{
        
            System.out.println("Fail");
        }
    }
}
