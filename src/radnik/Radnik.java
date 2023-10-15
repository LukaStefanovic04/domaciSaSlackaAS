package radnik;

abstract class Radnik {

    protected String ime;
    protected String prezime;
    protected String JMBG;
    protected String ziroRacun;
    protected int plata;

    public Radnik(String ime, String prezime, String JMBG, String ziroRacun, int plata) {
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = JMBG;
        this.ziroRacun = ziroRacun;
        this.plata = plata;
    }



    public abstract void isplatiPlatu();



}
