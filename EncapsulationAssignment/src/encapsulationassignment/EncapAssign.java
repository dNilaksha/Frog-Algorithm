/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encapsulationassignment;

/**
 *
 * @author user
 */
public class EncapAssign {
    private int id;
    private String name;
    //private int age;

//    public EncapAssign(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
    
   //2nd level encapsulation 
     class Inner{
        private int age;
    
    public int getAge(){
                 System.out.println("Class within a class");
                 return age;
      }
    public void setAge(int age){
    
    this.age=age;
    }
 }
    //3rd level encapsulation 
     public void courseSub(){
     class Course{
         private String sub;
     private void print(){
         System.out.println("Class inside a Method");         
     }
     public void setSub(String sub){
     this.sub=sub;
     }
     public String getSub(){
     return sub;
     }
     
     }
     Course c=new Course();
     c.print();
     c.setSub("Maths");
         System.out.println( c.getSub());
       
     }
     
     //4th level encapsulation
     public void getMarks(){
         System.out.println("annonymus class");         
    new Object(){
             //private int marks;
    private void studentMarks(int m){
        if(m<50)
            System.out.println("Pass");
        else 
            System.out.println("Fail");
    //this.marks=marks;
        //System.out.println("hello");        
    }
    }.studentMarks(45);
    }
      
     
     
    
    
    //1st level encapsulation
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
