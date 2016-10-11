/*
 * Tenim una empresa amb 10 empleats, dels quals volem saber el seu nom i sou.
*El sou d'aquests empleats dependrà d'un sou base que serà de 800€ més els complements.
*Realitzeu un programa que guarde el empleats i el seu sou. Per a donar d'alta un empleat
*posarem el seu nom i el diners que rep com a complement (ja que el sou base ja el sabem)
*i quant ens mostre el llistat d'empleats veurem per cada un el nom i el sou.
 */
package empresa;

import java.util.ArrayList;

/**
 *
 * @author Marc bas
 */
public class Empresa {
    //Attributes
    private ArrayList<Employee> employeesList;
    
    
    //constructor

    public Empresa(ArrayList<Employee> employees) {
        this.employeesList = employees;
    }
    
    //accessors

    public ArrayList<Employee> getEmployees() {
        return employeesList;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employeesList = employees;
    }
    
    //method used for add employees
    public void add(){
        //Declare an ArrayList which contains string objects
      
        ArrayList<Employee> employeesList = new ArrayList<Employee>();
   
        Employee emp = new Employee();
        emp.setName("Marc");
        emp.setSalary_complement(100);
        
        emp.setName("Paco");
        emp.setSalary_complement(120);
        
        emp.setName("David");
        emp.setSalary_complement(400);
        
        emp.setName("Albert");
        emp.setSalary_complement(110);
        
        emp.setName("Javi");
        emp.setSalary_complement(20);
        
        emp.setName("Jose");
        emp.setSalary_complement(170);
        
        emp.setName("Raul");
        emp.setSalary_complement(101);
        
        emp.setName("Enric");
        emp.setSalary_complement(80);
        
        emp.setName("Javier");
        emp.setSalary_complement(10);
        
        emp.setName("Daniel");
        emp.setSalary_complement(120);
        
        
        employeesList.add(emp);
     /*     
        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.add(200,"Marc")  ArrayList<Employee> employeesList = new ArrayList<Employee>();
   ;
        employeesList.add(250,"Cristian");
        employeesList.add(100,"Paco");
        employeesList.add(400,"Roberto");
        */
    }
    
/**
 * Serializes the object into a string
 * @return a string that contains the data of this object
 */
@Override
public String toString()
{
    Employee emp = new Employee();
    
    StringBuilder sb = new StringBuilder();
    sb.append("Employee{");
    sb.append("Name=");
    sb.append(emp.getName());
    sb.append(",Salary complement=");
    sb.append(emp.getSalary_complement());
    sb.append("}");

    return sb.toString();
}
    
    //Lists the employees array
    public void listAll(){
        /*
    for(int i=0;i<employeesList.size();i++){
        System.out.println(i);
        Employee employee=(Employee)employeesList.get(i);
        System.out.print(employeesList.get(i));
        */ 
        
        
        //for used to traverse employList in order to print all employee's data
        for (int i = 0; i < employeesList.size(); i++) {
         System.out.println("Name: " + employeesList.get(i).getName()); 
         System.out.println("Salary_complement: "+employeesList.get(i).getSalary_complement()); 
            
        }
         
         
    }
} 

