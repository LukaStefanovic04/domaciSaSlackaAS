package radnik;

public class FiksniRadnik extends Radnik{
    public FiksniRadnik(String ime, String prezime, String JMBG, String ziroRacun, int plata) {
        super(ime, prezime, JMBG, ziroRacun, plata);
    }
    @Override
    public void isplatiPlatu() {
        System.out.println("Radnik s fiksnom platom: " + ime + " " + prezime);
        System.out.println("JMBG: " + JMBG);
        System.out.println("Ziro racun: " + ziroRacun);
        System.out.println("Plata: " + plata);
    }
}
