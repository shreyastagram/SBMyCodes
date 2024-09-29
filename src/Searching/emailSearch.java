package Searching;
public class emailSearch {
    public static void main(String[] args) {
        String[] emails = {"chandler.bing@xyz.com", "ross.geller@xyz.com", "rachel.greene@xyz.com", "joey.tribbiani@xyz.com", "monica.geller@xyz.com", "phoebe.buffay@xyz.com", "sheldon.copper@xyz.com", "marie.george@xyz.com"};

        String NewEmail = "monica.geller@xyz.com";
        int index=-1;
        System.out.println(eSearch(emails, NewEmail,index));


        // Write your code here
    }

    public static int eSearch(String[] emails, String NewEmail,int index) {
        for (int i = 0; i < emails.length; i++) {

            if (emails[i].equals(NewEmail)) {
                index = i;
            }
        }
        return index;
    }
}
