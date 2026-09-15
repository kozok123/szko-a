public class Nauczyciel extends Osoba {
    private String przemiot;

    public Nauczyciel(String imie, String przemiot) {
        super(imie);
        this.przemiot = przemiot;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "imię: "+ getImie()+
                "przemiot='" + przemiot +
                '}';
    }
}
