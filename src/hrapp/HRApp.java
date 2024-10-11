/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hrapp;

/**
 *
 * @author Sumit
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HRapp Start");
        
        Employee e1=new Employee(207,"Sumit",50000);
        Employee e2=new Employee(208,"Shelke",60000);
        Employee e3=new Employee(209,"Krushna",70000);
       
        
        Department dept=new Department("Education");
        
        dept.addEmp(e1);
        dept.addEmp(e2);
        dept.addEmp(e3);
        
        Employee[] emps=dept.getEmployee();
        
        for(Employee emp:emps){
            System.out.println("Emp :"+emp);
            
        }
        System.out.println("Total :"+dept.getTotalSalary());
        System.out.println("Avg :"+dept.getAvgSalary());
        
        
        
    }
    
}
