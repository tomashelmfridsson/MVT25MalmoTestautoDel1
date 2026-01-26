import java.util.Arrays;
import java.util.Scanner;
//1. Läs in ett tal som beskriver vilket namn
// man skall skriva ut i ordningen. Fånga eventuella exceptions
// 2. Uppdatera ditt program så att det fångar exceptions
// vid olika tillfällen (inläsning av tal respektive utskrift av namn)
public class ArrayException {
    public static void main(String[] args) {
        try {
            String[] names = {"Ada", "Beda", "Cålle"};
            System.out.println(Arrays.toString(names));
            Scanner myScan = new Scanner(System.in);
            int index = myScan.nextInt();
            System.out.println(names[index]);
        } catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
