/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class student {
     String name;
    String section;
    String motto;
    
  public String getName(){
      return name;
  }
  public void setName(String name){
      this.name=name;
      
  }
    public String getSection(){
      return section;
  }
    public void setSection(String section){
    this.section=section;
    }
    public String getMotto(){
    return motto;
    }
  public void setMotto(String motto){
  this.motto=motto;
  }
  }

class main {
    
public static void main(String[] args){

    student s = new student();
    
s.setName("Jay Lourd E. Vicelles");
s.setSection("IT24C");
s.setMotto("God is always good");
System.out.println("Name: " + s.getName());
System.out.println("Section: " + s.getSection());
System.out.println("Motto: " + s.getMotto());
}
}
