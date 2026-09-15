public abstract class  Osoba {
        private String imie;
        private int wiek;

        public Osoba(String imie) {
            this.imie = imie;
            wiek = 0;
        }

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }
}

