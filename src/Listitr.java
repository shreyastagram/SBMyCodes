import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class Listitr {
    public static void main(String[] args) {
        List<tutee> tuteelist = new ArrayList<tutee>();


        tutee t1 = new tutee("Suresh", 3);
        tutee t2 = new tutee("Rekha", 2);
        tutee t3 = new tutee("Sneha", 6);
        tutee t4 = new tutee("Pooja", 5);
        tutee t5 = new tutee("Prachi", 4);
        tutee t6 = new tutee("Shreyash", 1);

        tuteelist.add(t1);
        tuteelist.add(t2);
        tuteelist.add(t3);
        tuteelist.add(t4);
        tuteelist.add(t5);
        iterateFwd(tuteelist);
        iterateBkwd(tuteelist);
    }

    public static void iterateFwd(List<tutee> tutees){
        ListIterator<tutee> it=tutees.listIterator();
        System.out.println("Printing tutees list...");
        while(it.hasNext()){
            System.out.println(it.next().getDetails());
        }

    }
    public static void iterateBkwd(List<tutee> tutees){
        ListIterator<tutee> it=tutees.listIterator(tutees.size());
        System.out.println("Printing tutees list...");
        while(it.hasPrevious()){
            System.out.println(it.previous().getDetails());
        }

    }
}
class tutee{
    private final String name;
    private final int rollno;
    public tutee(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public String getDetails(){
        return "Name :-"+name+"\n"
                +"Roll no is:-"+rollno;
    }
}
