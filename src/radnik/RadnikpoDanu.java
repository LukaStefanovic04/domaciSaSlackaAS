package radnik;

public class RadnikpoDanu extends  Radnik{
    private int brojDana = 2;
    public RadnikpoDanu(String ime, String prezime, String JMBG, String ziroRacun, int plata) {
        super(ime, prezime, JMBG, ziroRacun, plata);
    }

    @Override
    public void isplatiPlatu() {
        int iznosPlate = plata * brojDana;
        System.out.println("Radnik po danu: " + ime + " " + prezime);
        System.out.println("JMBG: " + JMBG);
        System.out.println("Ziro racun: " + ziroRacun);
        System.out.println("Plata: " + iznosPlate);

    }
}
