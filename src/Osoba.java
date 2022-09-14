public class Osoba {

    private int id;
    private String imie;

    static int wartosc = 0;

    //bezparametrowy
    public Osoba() {
        this.imie = "";
        this.id = 0;
        wartosc++;
    }

    //normalny
    public Osoba(int id, String imie) {
        this.id = id;
        this.imie = imie;
        wartosc++;
    }
    //kopiujący

    public Osoba(Osoba osoba) {
        this.imie = osoba.imie;
        this.id = osoba.id;
        wartosc++;
    }

    public void wypisz(String argument) {
        if (imie == "") {
            System.out.println("Brak danych");
        } else {
            System.out.println("Cześć " + argument + " mam na imie " + imie);
        }
    }
}




