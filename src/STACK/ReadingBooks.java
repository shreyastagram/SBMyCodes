package STACK;
import java.util.Scanner;
import java.util.Stack;
public class ReadingBooks {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", 200);
        Book book2 = new Book("Charles Babbage", 100);
        Book book3 = new Book("Shreyash Borkar", 300);
        Book book4=new Book("Main Hoon",100);

        Stack<Book> bookStack = new Stack<Book>();
        bookStack.push(book1);
        bookStack.push(book2);
        bookStack.push(book3);
        bookStack.push(book4);

        while (!bookStack.isEmpty()) {
            Book currentBook = bookStack.pop();
            currentBook.readingPages();

            if (!currentBook.completed()) {
                bookStack.push(currentBook);
            }
        }
    }
}

        class Book {
            public String title;
            public int pagesLeft;

            public Book(String title, int pages) {
                this.title = title;
                this.pagesLeft = pages;
            }

            public String getTitle() {
                return this.title;

            }

            public int getPages() {
                return this.pagesLeft;
            }

            public void readingPages() {
                System.out.println("Reading 100 pages of " + this.title);
                this.pagesLeft -=100;
            }

            public boolean completed() {
                return this.pagesLeft <= 0;
            }
        }