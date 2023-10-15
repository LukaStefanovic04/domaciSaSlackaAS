package radnik;

public class RadnikpoSatu extends  Radnik{
    private int brojSati = 1;
    public RadnikpoSatu(String ime, String prezime, String JMBG, String ziroRacun, int plata) {
        super(ime, prezime, JMBG, ziroRacun, plata);
    }

    @Override
    public void isplatiPlatu() {
        int iznosPlate = plata * brojSati;
        System.out.println("Radnik po satu: " + ime + " " + prezime);
        System.out.println("JMBG: " + JMBG);
        System.out.println("Ziro racun: " + ziroRacun);
        System.out.println("Plata: " + iznosPlate);

    }
}
