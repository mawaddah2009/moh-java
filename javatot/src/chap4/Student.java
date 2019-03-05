//method set nama
//x return apa2 so kena letak void
package chap4;
//primitive + string = passing value
//object always passing by reference
public class Student {
    void setName(String name){
    System.out.println(name);
    name = name + " binti mat zan";
    }
    void changeBookTitle(Book b){
        b.title = "Java for Advaned";
    }
   
public static void main(String[] args){
    //create obj student dr class student
    Student s1 = new Student();
    //ini passing by value
    String nama = "hasnita";
    s1.setName(nama);
    System.out.println(nama);
    
    //passing var by reference
    Book b1 = new Book();
    b1.title = "Java for Beginner";
     System.out.println(b1.title);
     s1.changeBookTitle(b1);
     System.out.println(b1.title);
    }
}
//run:hasnita