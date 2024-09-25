package Assessment1;

class Employee{
    public int Id;
    public String Name;
    public float BasicSalary;
    public float Bonus;
    public float NetSalary;

    Employee(int a, String b){
        this.Id = a;
        this.Name = b;
    }

    public void displayDetails(){
        System.out.println("Details:");
        System.out.println("Employee ID: "+Id);
        System.out.println("Employee Name: "+Name);
    }
}

class PermanentEmployee extends Employee{
    public int Pf;
    PermanentEmployee(int a, String b, float c,  int d){
        super(a,b);
        super.BasicSalary = c;
        this.Pf = d;
    }

    private float calcBonus() {
        if(Pf<1000)
            return (float) (0.1*BasicSalary);
        else if ((Pf>=1000) && (Pf<1500))
            return (float) (0.115*BasicSalary);
        else if ((Pf>=1500) && (Pf<1800))
            return (float) (0.12*BasicSalary);
        else if(Pf>=1800)
            return (float) (0.15*BasicSalary);
        else
            return 0;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Basic Salary: "+super.BasicSalary);
        System.out.println("PF: "+Pf);
        NetSalary = BasicSalary - Pf;
        Bonus = calcBonus();
        System.out.println("Bonus: "+Bonus);
        System.out.println("Net Salary: "+NetSalary);
    }
}

class TemporaryEmployee extends Employee{
    public int DailyWages;
    public int NoOfDays;
    TemporaryEmployee(int a, String b, int d, int e){
        super(a,b);
        this.DailyWages = d;
        this.NoOfDays = e;
    }

    private float calcBonus() {
        if(DailyWages<1000)
            return (float) (0.15*NetSalary);
        else if ((DailyWages>=1000) && (DailyWages<1500))
            return (float) (0.12*NetSalary);
        else if ((DailyWages>=1500) && (DailyWages<1750))
            return (float) (0.11*NetSalary);
        else if(DailyWages>=1750)
            return (float) (0.08*NetSalary);
        else return 0;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Daily Wages: "+DailyWages);
        System.out.println("No. of Days Worked: "+NoOfDays);
        NetSalary = DailyWages*NoOfDays;
        Bonus = calcBonus();
        System.out.println("Bonus: "+Bonus);
        System.out.println("Net Salary: "+NetSalary);
    }
}
public class Main {
    public static void main(String[] args) {
        PermanentEmployee E1 = new PermanentEmployee(101,"Esther",25000,1500);
        TemporaryEmployee E2 = new TemporaryEmployee(102,"Ganesh",1500,20);
        E1.displayDetails();
        System.out.println("\n-----------------------------\n");
        E2.displayDetails();
    }
}
