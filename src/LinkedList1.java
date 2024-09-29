import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<mans> manList = new LinkedList<mans>();
        mans m1 = new mans("Shreyash", 1);
        mans m2 = new mans("Suresh", 2);
        mans m3 = new mans("Rekha", 3);
        mans m4 = new mans("Pooja", 4);
        mans m5 = new mans("Sneha", 5);
        mans m6 = new mans("Prachi", 6);

        manList.add(m1);
        manList.add(m2);
        manList.add(m3);
        manList.add(m4);
        manList.add(m5);
        manList.add(m6);
        manList.remove(5);
        System.out.println(manList.get(0));

        //way of searching a particular element in a given array.
//        System.out.println(manList.contains(m1));
//        System.out.println(manList.contains(m6));
        printManList(manList);
    }

    public static void printManList(LinkedList<mans> manLists) {
        for (mans m : manLists) {
            System.out.println(m.getDetails());
        }
    }
}
class mans{
    private final String name;
    private final int rollNo;
    public mans(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public String getDetails(){
        return "Name of the Person is "+name+"\n"+
                "His/Her Rollno Number is "+rollNo;
    }
}
