import java.util.ArrayList;

/**ADT ที่เก็บ character แบบไม่ซ้ำกันและเรียงลำดับ
 */
public class integerset {
    ArrayList<Integer> Numbers;
    public  integerset(){
        Numbers = new ArrayList<>();
        CheckRep();

    }
    private void CheckRep(){
        if (Numbers == null) {
            throw new RuntimeException("Fail");
        }if (Numbers.size()> 1) {
            for (int i = 0; i < Numbers.size()-1; i++) {
                if (Numbers.get(i).equals(Numbers.get(i+1))) {
                    throw new RuntimeException("sum sum");
                }if (Numbers.get(i).equals(Numbers.size())) {
                    throw new RuntimeException("number is big");
                }
            }
        }

    }   
    private void remove(Integer s){
        if (Numbers.size() < 1) {
            remove(s);
            
        } 
    }
    public boolean contains(Integer s){
        for (int i = 0; i < Numbers.size(); i++) {
            if (s == Numbers.get(i)) {
                return true;
            }
        }
        return true;
        
    }

/**
     * 
     * @param  s 
     */
    public void add(Integer s){
        Numbers.add(s);
        CheckRep();
    }
    public String toString(){
         return Numbers.toString();
    }
    
    

    
}
