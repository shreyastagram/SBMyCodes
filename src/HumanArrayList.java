import java.util.ArrayList;
public class HumanArrayList {
    public static void main(String[] args) {
        ArrayList<man> manList = new ArrayList<man>();
        man m1=new man("Shreyash",1);
        man m2=new man("Suresh",2);
        man m3=new man("Rekha",3);
        man m4=new man("Pooja",4);
        man m5=new man("Sneha",5);
        man m6=new man("Prachi",6);

        manList.add(m1);
        manList.add(m2);
        manList.add(m3);
        manList.add(m4);
        manList.add(m5);
        //way of searching a particular element in a given array.
        System.out.println(manList.contains(m1));
        System.out.println(manList.contains(m6));
        printManList(manList);
    }
    public static void printManList(ArrayList<man> manLists) {
        for (man m : manLists) {
            System.out.println(m.getDetails());
        }
    }
}
class man{
    private final String name;
    private final int rollNo;
    public man(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public String getDetails(){
        return "Name of the Person is "+name+"\n"+
                "His/Her Rollno Number is "+rollNo;
    }
}

