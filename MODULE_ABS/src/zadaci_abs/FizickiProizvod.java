package zadaci_abs;

public class FizickiProizvod extends Proizvod {

    private static final float TROSAK_DOSTAVA = 0.33f;

    protected FizickiProizvod(String naziv, float jedCijena, float kolicina) {
        super(naziv, jedCijena, kolicina);
    }

    @Override
    public float ukupnaCijenaProizvoda() {
        this.ukupnaCijena = this.jedCijena*this.kolicina + this.kolicina*TROSAK_DOSTAVA;
        System.out.println("Ukuona cijena za: " + this.getClass().getSimpleName() + " je: " + this.ukupnaCijena);
        return this.ukupnaCijena;
    }
}
