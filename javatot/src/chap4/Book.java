
package chap4;
/*
discuss on "static" keyword
-apply to variable dan method
-shared -dikongsi 
*/
public class Book {
    public static int bil = 0; //share by all and own by class
    String title;
    
    public void info(){
        
    }
    
    public static void cetak(){
        System.out.println("Jumlah Buku = " + Book.bil); 
    }
    
    Book(){    //Book ni adlh constructor -class.nama var/method cth Book.bil
        Book.bil = Book.bil + 1;
        System.out.println("Bil Buku = " + Book.bil);
        
    }
    //var yg blh share oleh semua
    //public apply utk var, tak letak public pun boleh
    public static void main(String[] args){
        Book b1 = new Book(); //obj
        Book b2 = new Book(); //obj
        Book.cetak();
        //cetak()- function static blh panggil class static juga
        //info(); // x blh camni sebab error sebab satu static satu public
    }
}
