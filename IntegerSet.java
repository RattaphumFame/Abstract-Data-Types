import java.util.ArrayList;

/**ADT ที่เก็บ Number  แบบไม่ซ้ำกันและเรียงลำดับจากน้อยไปมาก
 */
public class IntegerSet {
    ArrayList<Integer> Numbers;

     // Rep Invariant (RI):
    //  - Number ห้ามเป็น null
    //  - Number ห้ามซ้ำกัน
   
    // Abstraction Function (AF):
    //  - AF(Number) = the set of Integer in the Integer Number
    public IntegerSet(){
        Numbers = new ArrayList<>();
        CheckRep();
    }


    private void CheckRep(){
         if (Numbers == null) {
           throw new RuntimeException("null");
        }
        if (Numbers.size() > 1) {
            for (int i = 0; i < Numbers.size() - 1; i++) {
      
                if (Numbers.get(i).equals(Numbers.get(i+1))) {
                    throw new RuntimeException(" number");
                }else if (Numbers.get(i) > Numbers.get(i+1)) {
                    throw new RuntimeException(" sort");
                 }
       }
        }
     
    }


    public void add(Integer x ){
        Numbers.add(x);
        CheckRep();
    }
    
    /**
     * 
     * @param x 
     */
    public void remove(Integer x ){
        
        for (int i = 0; i < Numbers.size(); i++) {
              
             
            if (x == Numbers.get(i)) {

                  Numbers.remove(x);

            }
        }
      
         CheckRep();
    }


    public String toString(){
        return Numbers.toString();
    }

}
