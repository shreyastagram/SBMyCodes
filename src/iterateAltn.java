import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class iterateAltn {
    public static void main (String []args){
        List<nums> numlist=new ArrayList<nums>();
        nums n1=new nums(2f);
        nums n2=new nums(4f);
        nums n3=new nums(5f);
        nums n4=new nums(10f);
        nums n5=new nums(99.9f);
        nums n6=new nums(101f);

        numlist.add(n1);
        numlist.add(n2);
        numlist.add(n3);
        numlist.add(n4);
        numlist.add(n5);
        numlist.add(n6);
        iterateAltn(numlist);

    }
    public static void iterateAltn(List<nums> numl){
        ListIterator<nums> it=numl.listIterator();
        while(it.hasNext()){
            it.next();
            if(it.hasNext()){
                System.out.println(it.next().getDetails());
            }
        }

    }
}
class nums{
    private float num;
    public nums(float num){
        this.num=num;
    }
    public float getDetails(){
        return num;
    }

}
