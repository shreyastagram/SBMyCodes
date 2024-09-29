package Polymorphism;

public class Interface2 {
    public static void main(String[] args) {
        professor p1 = new professor(102);
        student s1 = new student(2, 2);
        Human[] array = {p1, s1};
        printDetails(array);
    }

    public static void printDetails(Human[] humans) {
        for (Human human : humans) {
            System.out.println(human.getDetails());
            System.out.println("SALARY:="+human.computeSalary());
        }
    }
}
interface Human{
    String getDetails();
    float computeSalary();
}
class student implements Human{
    protected final int rollNo;
    protected int year;
    protected static final int annualFees=10000;
    protected static final int annualSalary=15000;
    public student(int rollNo,int year){
        this.rollNo=rollNo;
        this.year=year;
    }
    public String getDetails(){
        return "Rollno= "+rollNo+" Studying in year:= "+year+" Fees:- "+computefees();
    }

    public float computeSalary() {
        return student.annualSalary*year;
    }

    public float computefees(){
        return annualFees*this.year;
    }
}
class professor implements Human{
    private int employeeNumber;
    private static final float Salary=50000;
    public professor (int employeeNumber){
        this.employeeNumber=employeeNumber;
    }
    public String getDetails(){
        return "employee number:- "+this.employeeNumber;
    }
    public float computeSalary(){
        return Salary;
    }
}
