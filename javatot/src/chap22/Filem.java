
package chap22;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Filem {
    //nak import class drp library
           
    protected void list(){
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        //list all film title and descr
        //handling error
        //code berada dlm try, catch bila berlaku error
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?useLegacyDatetimeCode=false&serverTimezone=America/New_York", "root", "");
            stmt = con.createStatement();
            String sql = "SELECT * FROM film";
            rs = stmt.executeQuery(sql);
            //insert, update ,delete xperlu while
            while (rs.next()){
                int id = rs.getInt("film_id");
                //int + string jadi string
                 System.out.print(id + "\t");
                 System.out.print(rs.getString("title") + "\t");
                 System.out.println(rs.getString("description"));
            }
    
        }   catch (Exception e){
            System.out.println("Berlaku Error");
            System.out.println(e.getMessage());
        }
    }
    
    public static void main (String[] args){
        Filem f = new Filem();
        f.list();
    }
}
