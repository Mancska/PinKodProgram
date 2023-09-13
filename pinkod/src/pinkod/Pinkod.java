package pinkod;


import java.util.Scanner;

public class Pinkod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pinBeker(sc, pinMegadas(sc));

    }

    private static String pinMegadas(Scanner sc) {
        int minHossz = 4;
        int maxHossz = 6;
        String helyesKod = "";
        boolean formatum = false;
        while (!formatum) {
            System.out.print("adja meg a pin kodot!: ");
            String atmeneti = sc.nextLine();
            if (atmeneti.length() > maxHossz) {
                System.out.println("tul hosszu a pinkod!!");

            } else if (atmeneti.length() < minHossz) {
                System.out.println("tul rövid a pinkod!!");

            } else {
                System.out.println("Pin mentve!");
                helyesKod = atmeneti;
                formatum = true;

            }
        }
        return helyesKod;
    }

    private static void pinBeker(Scanner sc, String helyesKod) {
        int szamlalo = 0;
        boolean rendben = false;
        boolean megtagadva = false;
        System.out.println("kérem a pinkodot! : ");
        while ((!rendben && szamlalo < 3) && !megtagadva) {
            String kod = sc.nextLine();
            if (kod != helyesKod && szamlalo < 2) {
                System.out.println("helytelen pinkod!!!");
                ++szamlalo;
            } else if ((kod != helyesKod) && (szamlalo == 2)) {
                System.out.println("helytelen pinkod!!!");
                System.out.println("belepés meg tagadva!!!");
                megtagadva = true;

            } else {
                System.out.println("belépés elfogadva");
                rendben = true;

            }

        }
    }

  
}
