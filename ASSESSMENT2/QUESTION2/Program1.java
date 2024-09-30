package ASSESSMENT2.QUESTION2;

import java.util.Scanner;

class EmployeeNotFound extends  Exception {
    public EmployeeNotFound (String message){
        super(message);
    }
}

class Employee{
    private int id;
    private String name;
    public  Employee(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
class EmployeeManager{
    private Employee[] employees;
    public EmployeeManager(Employee[]employees){
        this.employees=employees;
    }
    public Employee findEmployeeByName(String name)throws EmployeeNotFound{
        for(Employee emp:employees){
            if (emp.getName().equals(name.toLowerCase())){
                return emp;
            }
        }
        throw new EmployeeNotFound("ERROR: Employee "+ name+ "is not Found");
    }
}
public class Program1{
    public static void main(String[] args) {
        Employee[] employees={
                new Employee(1,"abc"),new Employee(2,"def"),new Employee(3,"ghi"), new Employee(4,"jkl")
        };
        EmployeeManager manager=new EmployeeManager(employees);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name: ");
        String nm = sc.nextLine();
        try {
            Employee emp=manager.findEmployeeByName(nm);
            System.out.println("Employee found  " + emp.getName());
        }catch (EmployeeNotFound e){
            System.out.println(e.getMessage());
        }
    }
}