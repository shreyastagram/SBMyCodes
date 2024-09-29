import java.util.ListIterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class ListPolymorphism1 {
    public static void main(String[] args) {
        List<student> studentList1 = new LinkedList<student>();
        List<student> studentList2 = new ArrayList<student>();

        student s1 = new student("Sujit", 1);
        student s2 = new student("Siddharth", 2);
        student s3 = new student("Karanpreet", 3);
        student s4 = new student("Hari", 5);
        student s5 = new student("Tricha", 4);

        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);

        studentList2.add(s4);
        studentList2.add(s5);

        iterateFwd(studentList2);
        //printStudentList(studentList1);
        //printStudentList(studentList2);

    }
//        printStudentList(studentList1);
//        printStudentList(studentList2);


    public static void iterateFwd(List<student> students) {
        ListIterator<student> it = students.listIterator();
        System.out.println("Printing student details");
        while (it.hasNext()) {
            System.out.println(it.next().getDetails());
        }
    }
}


class student {
    private final String name;
    private final int rollNumber;

    public student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }
}
