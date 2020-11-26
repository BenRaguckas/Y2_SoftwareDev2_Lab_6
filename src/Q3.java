import java.awt.print.Book;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        Q2[] BookList = new Q2[5];
        BookList[0] = new Q2("Das Kapital","Verlag von Otto Meisner","Karl Marx",12.99);
        BookList[1] = new Q2("The Princess Bride","Harcourt Brace Jovanovich","William Goldman",14.99);
        BookList[2] = new Q2("Pet Sematary","HODDER & STOUGHTON","Stephen King",15.99);
        BookList[3] = new Q2("I am Legend","Orb Books","Richard Matheson",14.86);
        BookList[4] = new Q2("The Godfather","Cornerstone","Mario Puzo",7.86);
        for (Q2 i:BookList){
            System.out.println(i.toString());
        }
        Q2.SortMethod = 1;
        Arrays.sort(BookList);
        System.out.println("===============================================================");
        for (Q2 i:BookList){
            System.out.println(i.toString());
        }
    }
}
