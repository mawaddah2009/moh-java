
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;



public class ProjectModel extends Model {
    private int id;
    private String title;
    private String description;
    
   //utk initilize value kat depan supaya tdk null
     public ProjectModel(){
        this.title = "";
        this.description = "";
     }

    
    public ProjectModel getOne(int id){
        String sql = "SELECT * FROM project WHERE id = " + id;
        ProjectModel pro = new ProjectModel();
        try {
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                   pro.id = rs.getInt("id");
                   pro.title = rs.getString("title");
                   pro.description = rs.getString("description");  
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        
        return pro;
       
    }
    
    public boolean insert(){
    String sql = "INSERT INTO project(title, description)" +
                 "VALUES('" + this.title +"', '" + this.description +"')";
try{
    Statement stmt = this.getStmt();
stmt.execute(sql);//insert,update, delete guna execute()
} catch (Exception e) {
    e.printStackTrace();//print err msg to console
    return false;
}
return true;
    }
    
    public boolean update(int id){
    String sql ="UPDATE project SET "
+ "title = '" + this.title + "', "
+ "description = '" + this.description +"' "
+ "WHERE id = " + id;
  
   try{
    Statement stmt = this.getStmt();
stmt.execute(sql);//insert,update, delete guna execute()
} catch (Exception e) {
    e.printStackTrace();//print err msg to console
    return false;
}
return true;
  }
    
  public boolean delete(int id){
   String sql = "DELETE FROM project WHERE id = " + id;
        
try{
    Statement stmt = this.getStmt();
stmt.execute(sql);//insert,update, delete guna execute()
} catch (Exception e) {
    e.printStackTrace();//print err msg to console
    return false;
}
return true;
  }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
  
    
    public ArrayList getAll(){
        ArrayList arr = new ArrayList();
        //nak query
        String sql = "SELECT * FROM project";
        try {
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                ProjectModel pro = new ProjectModel();
                pro.id = rs.getInt("id");
                   pro.title = rs.getString("title");
                   pro.description = rs.getString("description");
                   arr.add(pro);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        
        return arr;
       
    }
    public static void main(String[] args){
        ProjectModel p = new ProjectModel();
        p= p.getOne(2);
        p.setTitle("test");
        p.setDescription("bla bla....");
        p.insert();
        
        ArrayList list = p.getAll();
        for(int i =0; i<list.size(); i++){
            ProjectModel pro = (ProjectModel) list.get(i);
            System.out.println(pro.title);
        }
    
    }

    private Statement getStmt(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
