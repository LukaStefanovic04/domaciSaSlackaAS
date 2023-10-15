package radnik;

public class Main {
    public static void prikazRadnika(Radnik[] radnici) {
        for (int i = 0; i < radnici.length; i++) {
            System.out.println(radnici[i]);
        }

    }

    public static void main(String[] args) {
        RadnikpoDanu radnikpoDanu = new RadnikpoDanu("Zivaidn", "Jaric", "123456789",
                "123-456-789", 5000);
        RadnikpoSatu radnikpoSatu = new RadnikpoSatu("Pavle", "Cutura", "987654321",
                "987-654-321", 2000);
        FiksniRadnik fiksniRadnik = new FiksniRadnik("Pera", "Peric", "567890123",
                "567-890-123", 40000);

        radnikpoDanu.isplatiPlatu();
        System.out.println();
        radnikpoSatu.isplatiPlatu();
        System.out.println();
        fiksniRadnik.isplatiPlatu();
        ;

    }


}
