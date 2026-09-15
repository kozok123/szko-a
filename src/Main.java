//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Osoba osoba = new uczen("Jaś", 8);
            uczen uczen = new uczen("Małgosia", 7);
        System.out.println(osoba);
        System.out.println(uczen);
        uczen.wykonajDuzur();
        Nauczyciel nauczyciel = new Nauczyciel("Joanna", "muzyka");
        System.out.println(nauczyciel);
        nauczyciel.wykonajDuzur();
        }
    }