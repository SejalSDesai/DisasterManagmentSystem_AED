/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;
import java.util.ArrayList;

/**
 *
 * @author sej
 */
public class EmployeeDirectory {
    private ArrayList<Employee> Emplist;
    
public EmployeeDirectory(){
    Emplist=new ArrayList<>();
}

public ArrayList<Employee> getEmplist() {
    return Emplist;
}
//create a new employee using this method
public Employee createEmployee(String name){
    Employee emp= new Employee();
    emp.setempName(name);
    Emplist.add(emp);
    return emp;
}
}
