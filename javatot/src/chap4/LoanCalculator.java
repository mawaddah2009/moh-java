package chap4;
/*
this utk set/get a property OR call /run function/method
i.e this.jumlah= 100;

*/


//ctrl + space = show auto suggesstion
//psvm tab = auto gen pub static void main()
public class LoanCalculator extends Calculator{
    //ini override cetak() dalam parent
     int jumlah = 0; //variable /property
     final String tajuk = "LOAN CALCULATOR";
     //ini over ride cetak() dlm parent
    public void cetak(){
        System.out.println("Cetak LoanCalculator");
    }
    /*public void info(){
    } ini tak boleh , sebab parent info() dah set final*/
   
    public static void main (String[] args){
        LoanCalculator cal = new LoanCalculator();
        cal.cetak();
       // this.tajuk = "abc"  -cannot assign a value to final variable tajuk
       //dah final tak boleh tukar
        LoanCalculator cal2 = new LoanCalculator(1);
        
        //shift +ctrl +anak panah ke bawah utk copy line atas ke bwh
    }

    
    //mesti return int, kalau void - no return
    //constructor - method dia sama dgn nama class - tiada return apa2
    //dalam satu class boleh ada beberapa constructer
    //auto run/call bila create new object
    public LoanCalculator(){
        //boleh juga takletak public
        //tidak boleh private
        super();//run parent constructor
        System.out.println("i'm constructor 1");
    }
    //constructor 
    public LoanCalculator(int amount){
        this.jumlah = amount;//initialize value/property awalan
        System.out.println("i'm instructor 2");
    }
    int calcLoanPayment(int amount, int numberOfMonths, String state) {
        return 0;
       //yr code goes here
       //shift+alt+f untuk bg susun atur code auto
    }
    //method ever loading-boleh public atau private
    private int calcLoanPayment(int amount){
        return 0;
    }
}
