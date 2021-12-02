import java.util.Scanner;

public class JavaTest {
    public static void main (String [] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Vad heter du?");
        String namn = userInput.nextLine();
        System.out.println(namn);
        System.out.println("Hur många poäng har du fått på provet? ");
        int a = userInput.nextInt();


        if (a > 10 ) {
            System.out.println("Du har fått godkänt!");
        } else {
            System.out.println("Du har tyvärr fått underkänt!");
        }






    }
}
