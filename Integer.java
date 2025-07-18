public class Integer {
    public static void main(String[] args) {
        integerset x = new integerset();
        x.add(50);
        x.add(70);
        String s = "(50 , 70)" ;
       if (x.toString().equals(s)) {
        System.out.println("pass");
       }else{
        System.out.println("Fail");
       }
    }
    
   
    
}


