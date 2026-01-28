package heltalsarray;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SequencedCollection;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        HeltalsArray myArr = new HeltalsArray();
        int val = 0;
        while (val != 3) {
            try {
                System.out.println("Vill du lägga till ett tal tryck 1, \n" +
                        "Vill du titta på ett index tryck 2\nVill du avsluta tryck 3");
                val = myScan.nextInt();
                if (val == 1) {
                    System.out.println("Vilket tal vill du lägga in");
                    int tal = myScan.nextInt();
                    myArr.add(tal);
                }
                if (val == 2) {
                    System.out.println("Vilket index vill du se");
                    int index = myScan.nextInt();
                    System.out.println(myArr.getValue(index));
                }
            } catch (InputMismatchException e){
                System.out.println("Ogiltigt val försök igen");
                myScan.nextLine();
            }
        }
    }
}
