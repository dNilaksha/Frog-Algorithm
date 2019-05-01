/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encapsulationassignment;

//import encapsulationassignment.EncapAssign.Outer;

/**
 *
 * @author user
 */
public class EncapsulationAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     EncapAssign e=new EncapAssign();
        System.out.println("Using getter setter methods" );        
     e.setId(1);
     e.setName("Nimal");
     
        System.out.println(e.getId());
        System.out.println(e.getName());
       
        EncapAssign.Inner i = e.new Inner();
        i.setAge(17);
      System.out.println(i.getAge());
      e.courseSub();
       e.getMarks();
        //System.out.println( e.toString());
       
      
      

     
    }
    
}
