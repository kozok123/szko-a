public class Nauczyciel extends Osoba implements Dyzurny {
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

    @Override
    public void wykonajDuzur() {
        System.out.println("Spacer po korytarzu");
    }
}
