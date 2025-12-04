import java.util.Date;
import java.util.Calendar;

public class TestHomework {
    public static void main(String[] args) {
        Date now = new Date();
        Homework homework1 = new Homework("SENG 211 - OOP", "Prepare a slide about Array vs. ArrayList and Date class", now);
        homework1.printInfo();

        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.DECEMBER, 10, 23,59);
        Date deadline = cal.getTime();
        Homework homework2 = new Homework("CENG 201 - Algorithms", "BST", deadline);
        homework2.printInfo();
    }
}
