package division;

import java.util.InputMismatchException;
import java.util.Scanner;

//3. Skriv ett program som läser in två tal och sedan skriver ut kvoten mellan dem
// (dvs. utför division mellan de två talen)
//4. Fånga felen och skriv ut ett felmeddelande
//5. Uppdatera så att meddelandet i Exception e även kommer med
public class Division {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int numerator = 0,denominator=0;
        boolean numeratorOK= false;
        boolean denominatorOK = false;
        while (!numeratorOK || !denominatorOK) {
            try {
                if (!numeratorOK) {
                    System.out.print("Skriv in täljare: ");
                    numerator = myScan.nextInt();
                    numeratorOK = true;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Du angav ett fel täljare");
                numeratorOK = false;
            }
            try {
                if (!denominatorOK) {
                    System.out.print("Skriv in nämnare: ");
                    denominator = myScan.nextInt();
                    denominatorOK = true;
                }
            } catch (InputMismatchException ime){
                System.out.println("Du angav fel nämnare: ");
                denominatorOK = false;
            }
            while(myScan.hasNext()) myScan.nextLine();
        }
        //double qoutient = (double) numerator / denominator;
        System.out.println("Kvoten blir: " + numerator / denominator);
    }
}
