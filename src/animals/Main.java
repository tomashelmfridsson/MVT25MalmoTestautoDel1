package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Fido");
        myDog.behaivor();


        // Skapat våra instanser av objektet Frog
        Frog myFrog =  new Frog(name(),age());
        Frog yourFrog = new Frog(name(),age());

        // Anropar våra egna instanser av Frog
        System.out.print(myFrog.getName()+" ");
        myFrog.behaivor(nbrOfJumps(),5);
        myFrog.behaivor();

        System.out.print(yourFrog.getName()+" ");
        yourFrog.behaivor(nbrOfJumps(),3.5);

    }

    private static int nbrOfJumps() {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Ange antal hopp: ");
        try {
            return Integer.parseInt(myScan.nextLine());
        }catch(Exception e){
            System.out.println("inmatning av antal hopp blev fel måste vara ett heltal, sätter till 0");
        }
         return 0;
    }

    private static int age() {
        Scanner myScan = new Scanner(System.in);
        boolean age = false;
        int ageInt=0;
        while(!age) {
            try {
                System.out.print("Ange ålder :");
                ageInt = Integer.parseInt(myScan.nextLine());
                age = true;
            } catch (Exception e) {
                System.out.println(" Det blev fel vid inläsning av ålder, ålder måste vara ett heltal försök igen");
            }
        }
        return ageInt;
    }

    private static String name(){
        Scanner myScan = new Scanner(System.in);
        System.out.print("Ange namn: ");
        return myScan.nextLine();
    }
}
