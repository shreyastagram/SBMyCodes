package STACK;
import java.util.Stack;

public class BookRead {
    public static void main(String [] args){
        BookRead Book1=new BookRead("Harry Potter",200);
        BookRead Book2=new BookRead("Champak",100);
        BookRead Book3=new BookRead("Lord Of The Rings",300);
        BookRead Book4=new BookRead("Tinkle",100);

        Stack<BookRead> s=new Stack<>();
        s.push(Book1);
        s.push(Book2);
        s.push(Book3);
        s.push(Book4);

        while(!s.isEmpty()){
            BookRead currentBook=s.pop();
            currentBook.read100Pages();

            if(!currentBook.completed()){
                s.push(currentBook);
            }
        }


    }
    public String title;
    public int pagesLeft;
    public BookRead(String title,int pages){
        this.title=title;
        this.pagesLeft=pages;
    }
    public String getTitle(){
        return this.title;
    }
    public int getPages(){
        return this.pagesLeft;
    }
    public void read100Pages(){
        System.out.println("Reading 100 pages of "+this.title);
       this.pagesLeft-=100;
    }
    public boolean completed(){
        return this.pagesLeft<=0;
    }

}
