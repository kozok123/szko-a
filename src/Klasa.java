import java.util.ArrayList;

public class Klasa {
    private String nazwa;
    private ArrayList<uczen> uczniowie;
    private Wychowawca wychowawca;

    public Klasa(String nazwa, Wychowawca wychowawca) {
        this.nazwa = nazwa;
        this.wychowawca = wychowawca;
        uczniowie = new ArrayList<>();
    }
    //dodaj ucznia do klasy
    public void dodajUczniaDoKlasy(uczen uczen) {
        if (uczniowie.contains(uczen)) {
            System.out.println(uczen+"jest już w tej klasie");
        }
        else{
            uczniowie.add(uczen);
        }
        uczniowie.add(uczen);
    }
    //usun ucznia z klasy
    public void usunUczniaZKlasy(uczen uczen) {
        if (uczniowie.contains(uczen)) {
            uczniowie.remove(uczen);
        }
        else {
            System.out.println(uczen+"nie wystepuje w tej klasie");
        }
    }
    public void wypiszInfoOKlasie(){

    }

    //to string -> wypisanie wszystkich uczniow w klasie
    public void wypiszInfo() {
        System.out.println("Klasa "+ nazwa);
        System.out.println("Wychowawca"+ wychowawca);
        for (uczen uczen:uczniowie) {
            System.out.println("- "+ uczen);
        }
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "nazwa='" + nazwa + '\'' +
                ", uczniowie=" + uczniowie +
                ", wychowawca=" + wychowawca +
                '}';
    }
}
