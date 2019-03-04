

//main()berada satu class khusus yg akan
//guna class yg lain
public class App {
    
    //psvm ni pintu masuk @ method -blh ada lbh tp bila nak run program 
    //dia panggil satu shj
    //tipsnya dlm app shj ada void main
    public static void main (String[] args){
        //create object
        Car ferrari = new Car();
        ferrari.numofDoors = 2;
        ferrari.color = "red"; //mesti "" x boleh ''
        //'' ni hanya utk datatype dia char shj
        ferrari.print();
        ferrari.startEngine();
        Car porsche = new Car();
    }
}
