package Polymorphism;
import java.util.ArrayList;

public class CollegeArrayList {
    public static void main(String[]args){
    ArrayList collegeList=new ArrayList();
    collegeList.add(new classes(13,14,3));
    collegeList.add(new classes(12,23,4));
    collegeList.add(new classes(23,34,1));
    collegeList.add(new classes(22,12,5));


    printcollegedetails(collegeList);
}
public static void printcollegedetails(ArrayList details) {
    //what does below code mean
        for (Object o : details) {
        classes c = (classes) o;
        System.out.println(c.getDetails());
    }
}
}

class classes{
    private int numberoflights;
    private int numberofbenches;
    private int classno;
    public classes(int numberoflights,int numberofbenches,int classno){
        this.numberoflights=numberoflights;
        this.numberofbenches=numberofbenches;
        this.classno=classno;
    }
    public String getDetails(){
        return "The class number is:- "+classno+"\n"+
                "Number of Benches and lights respectively are "+numberoflights+","+numberofbenches;
    }
}
