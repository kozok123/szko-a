public class uczen extends Osoba implements Dyzurny{
    private int nrUcznia;
    private static int liczbaUczniowie;

    //static pole klasy a nie obiektu
    //moze sluzyc do zliczenia liczby instancji
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

    @Override
    public void wykonajDuzur() {
        System.out.println("Podlewanie kwiatów");
    }
}
