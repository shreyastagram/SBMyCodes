import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listIteratebkwd {
    public static void main(String[] args) {
        List<random> randomlist = new ArrayList<>();
        random r1 = new random(2f);
        random r2 = new random(4f);
        random r3 = new random(5f);
        random r4 = new random(10f);
        random r5 = new random(99.9f);
        random r6 = new random(101f);

        randomlist.add(r1);
        randomlist.add(r2);
        randomlist.add(r3);
        randomlist.add(r4);
        randomlist.add(r5);
        randomlist.add(r6);

        iterateBkwd(randomlist);
        iterateFwd(randomlist);
        iterateFwdBkwd(randomlist);
    }

    public static void iterateBkwd(List<random> randomNum) {
        ListIterator<random> it = randomNum.listIterator(randomNum.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous().getDetails());
        }
    }

    public static void iterateFwd(List<random> randomNum) {
        ListIterator<random> it = randomNum.listIterator(randomNum.size());
        while (it.hasNext()) {
            System.out.println(it.next().getDetails());
        }
    }
    public static void iterateFwdBkwd(List<random> randomNum){
        ListIterator<random> it=randomNum.listIterator();
        while(it.hasNext()){
            System.out.println(it.next().getDetails());
        }
        while(it.hasPrevious()){
            System.out.println(it.previous().getDetails());
        }
    }
}
class random{
    private final float num;
    public random(float num){
        this.num=num;
    }
    public float getDetails(){
        return num;
    }
}
