package Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, 5555);
        BankAccount account2 = new BankAccount(124, 6666);
        BankAccount account3 = new BankAccount(125, 7777);

        Student s1 = new Student("Karan", 2, account1);
//        System.out.println(s1.getDetails());
//        System.out.println(s1.computefees());

        //Dyanamic polymorphism in which subclass is refred with the superclass.
        Student s2 = new ResearchStudent("Shreyash", 2, "Software Engineering", account2);
//        System.out.println(s2.getDetails());
//        System.out.println(s2.computefees(2000));

        //static polymorphism
        phdStudent s3 = new phdStudent("Rekha", 3, "Software Building", "Bugs Finder",
                account3);
//        System.out.println(s3.getDetails());
        Professor p1 = new Professor("Sheryashhhhhhh", 100);

        //below this we have created an array to take the student data from the three classes(i.e. student,researchstudent,
        //phd student)
        Person[] array = {s1, s2, s3, p1};
        printDetails(array);
    }

    //we have created here a function printDetails() to print the details of the students and used a for loop for the
    //same.
//    public static void printDetails(Student[] students){
//        for(Student student:students){
//            System.out.println(student.getDetails());
//        }
//    }
    public static void printDetails(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.getDetails());
        }
    }
}

abstract class Person{
    //to make abstract method in any class we have to make the class abstract as
    //abstract class classname{}
    protected final String name;
    public Person(String name){
        this.name=name;
    }

    //Abstract method to avoid Dummy implementation of getDetails Method as
    //public abstract <datatype> <methodName>
    public abstract String getDetails();
}
//below we are on abstract classes, and so we are creating new class professor.
class Professor extends Person {
    private int employeeNumber;
    private static final int startingSalary = 50000;
    public Professor(String name, int employeeNumber) {
        super(name);
        this.employeeNumber = employeeNumber;
    }
    public String getDetails() {
        return "Name :- " + name + " ,Salary :- " + startingSalary + " ,employee number:- " + this.computeSalary();
    }
    public float computeSalary() {
        return this.startingSalary;
    }
}
class Student extends Person {
    protected int year;
    private BankAccount bankAccount;
    protected static final int annualfees=10000;

    public Student(String name, int year, BankAccount bankAccount) {
        super(name);
        this.year = year;
        this.bankAccount = bankAccount;
    }
    protected float computefees(){
        return annualfees*this.year;
    }
    //Question:how to add compute fees directly to the researchStudent class in get details if we are invoking the
    //super.getDetails method from the student class.
    public float computefees(int annualfees){
        return annualfees*this.year;
    }
    public String getDetails(){
        return "Name:- "+ name+" "+",fees:- "+ computefees();
    }
}
class ResearchStudent extends Student {
    protected String researchArea;
    private static final int annualfees = 10000;

    public ResearchStudent(String name, int year, String researchArea, BankAccount bankAccount) {
        super(name, year, bankAccount);
        this.researchArea = researchArea;
    }
    public String getDetails(){
        return super.getDetails()+" ,Research area:- "+this.researchArea;
    }
    //here we are trying to override a method in a same class computefees below from getdetails above.
    protected float computefees(){
        return Student.annualfees*year*0.9f;
    }
}
class phdStudent extends ResearchStudent{
    private String ThesisTitle;
    private static final int annualfees = 10000;

    public phdStudent(String name, int year, String researchArea, String ThesisTitle, BankAccount bankAccount) {
        super(name, year, researchArea,bankAccount);
        this.ThesisTitle = ThesisTitle;
    }
    public String getDetails(){
        return super.getDetails()+" ,Thesis Title:-"+ThesisTitle;
    }
    protected float computefees(){
        return Student.annualfees*year*0.8f;
    }
}
class BankAccount{
    int accountnumber;
    int balance;
    public BankAccount(int accountnumber,int balance){
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
}