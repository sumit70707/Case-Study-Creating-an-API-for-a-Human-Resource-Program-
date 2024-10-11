/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;

/**
 *
 * @author Sumit
 */
public class Department {
     private String name;
     private Employee emp[]=new Employee[10];
    // private int lastAddedEmployeeIndex=-1;
     private int lastEmp=-1;
     

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addEmp(Employee anEmployee){
//        for(lastEmp=0;lastEmp<emp.length;lastEmp++){
//            emp[lastEmp]=anEmployee;
//        }
        if(lastEmp<emp.length){
            lastEmp++;
            emp[lastEmp]=anEmployee;
        }

    }
   
    public Employee[] getEmployee(){
        Employee [] actualEmp=new Employee[lastEmp+1];
        for(int j=0;j<actualEmp.length;j++){
            actualEmp[j]=emp[j];
        }
        return actualEmp;
    }
    
    public int getEmployeeCount(){
        return lastEmp;
    }
    
    public Employee getEmployeeId(int empId){
        for(Employee ep:emp){
            if(ep.getId()==(empId)){
                return ep;
            }
        }
        return null;
    }
    
    public double getTotalSalary(){
        double totalSalary=0.0;
        for(int i=0;i<=lastEmp;i++){
            totalSalary+=emp[i].getSalary();
        }
        return totalSalary;
    }
    
    public double getAvgSalary(){
        if(lastEmp>-1){
            return getTotalSalary()/(lastEmp+1);
        }
        return 0.0;
    }
    
    public String toString(){
        return name;
    }
     
    
}
