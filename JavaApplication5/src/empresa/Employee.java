/*
 * Tenim una empresa amb 10 empleats, dels quals volem saber el seu nom i sou.
*El sou d'aquests empleats dependrà d'un sou base que serà de 800€ més els complements.
*Realitzeu un programa que guarde el empleats i el seu sou. Per a donar d'alta un empleat
*posarem el seu nom i el diners que rep com a complement (ja que el sou base ja el sabem)
*i quant ens mostre el llistat d'empleats veurem per cada un el nom i el sou.
 */
package empresa;

/**
 *
 * @author Marc bas
 */
public class Employee {
    //Attributes
    
    private String name;
    private int salary_complement;
    //it is a final var because is constant.
    private static final double sal_fix = 800;
    
    
    //constructor

    public Employee(String name, int salary_complement) {
        this.name = name;
        this.salary_complement = salary_complement;
    }

    Employee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //accessors

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary_complement() {
        return salary_complement;
    }

    public void setSalary_complement(int salary_complement) {
        this.salary_complement = salary_complement;
    }
    
    
    
    
    
    
}
