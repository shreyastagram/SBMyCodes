import java.util.ArrayList;
import java.util.Scanner;
public class ArraysList {
    public static void main (String[] args) {
        //making typesafe <>
        ArrayList<Student> studentList=new ArrayList<Student>();

        studentList.add(new Student("Shreyash",4,1222222));
        //in the below line we have set the index of Suresh to 0th index in the arraylist.
        studentList.add(new Student("Suresh",5,1222222));
        studentList.add(new Student("Rekha",6,1222222));
        studentList.add(new Student("Hari",1,122222));
        studentList.add(new Student("Shivam",1,122222));

        printStudentList(studentList);
        //remove element method on arrays below
        studentList.remove(3);
        //below array after removing the element using .remove() method
        printStudentList(studentList);
        //This removes all the element of the array.
        studentList.clear();
    }
                                         //students--->studentList
    public static void printStudentList(ArrayList<Student> students){
        //below line means that elements of students is stored in variable s of type Student.
        for(Student s: students){
//            Student s=(Student) o;
            System.out.println(s.getDetails());
        }
    }
}
class Student {
    private final String name;
    private final int rollNumber;
    private final int Salary;

    public Student(String name, int rollNumber,int Salary) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.Salary=Salary;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +

                        "roll number = " + this.rollNumber + '\n'+

                        "Salary is:- "+Salary;
    }
}