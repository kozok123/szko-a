public class uczen extends Osoba {
    private int nrUcznia;
    private static int liczbaUczniowie;


    public uczen(String imie, int wiek) {
        super(imie, wiek);
        liczbaUczniowie ++;
        nrUcznia = liczbaUczniowie;
    }


    @Override
    public String toString() {
        return "uczen{" +
                "imię: " + getImie() +
                "nrUcznia=" + nrUcznia +
                '}';
    }
}
