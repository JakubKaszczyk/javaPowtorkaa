import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Liczba zarejestroanych osób " + Osoba.wartosc);
        //tworzenie obiektu
        Osoba osoba1 = new Osoba();
        //Wczytywanie z klawiatury
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj imie");
        String imieWczytane = klawiatura.next();

        System.out.println("Podaj id");
        int idWczytane = klawiatura.nextInt();
        //tworzenie obiektu

        Osoba osoba2 = new Osoba(idWczytane, imieWczytane);
        Osoba osoba3 = new Osoba(osoba2);

        osoba1.wypisz("Jan");
        osoba2.wypisz("Jan");
        osoba3.wypisz("Jan");

        System.out.println("Liczba zarejestroanych osób " + Osoba.wartosc);


    }
}