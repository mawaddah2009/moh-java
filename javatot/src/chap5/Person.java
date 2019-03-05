
package chap5;

public class Person {
    //set property dulu
    public String name;
    public int age;
    public String gender;
    //encapsulation
    private String statusKahwin;
    
    //public interface
    public String getStatusKahwin(String jenisOrang){
        if (jenisOrang.equals("kanak2")){
            return " Muda LAgi";}
        else if(jenisOrang.equals("tansri")){
            return "Janda";}
        else {
            return "Bujang";}
        //return this.statusKahwin;
    }
    //method seseorang manusia-walk, eat, talk
    public void walk(){
        
    }
    public void talk(){
        
    }
    public void sing(){
        
    }
    
}
