package zadaci_abs;

public class PreplataProizvod extends Proizvod{

    private static final float POPUST = 0.1f;

    protected PreplataProizvod(String naziv, float jedCijena, float kolicina) {
        super(naziv, jedCijena, kolicina);
    }

    private float popustZaPreplatu(){
        if(this.kolicina >= 12){
            return POPUST * this.jedCijena*this.kolicina;
        }else{
            return 0;
        }
    }
    @Override
    public float ukupnaCijenaProizvoda() {
        this.ukupnaCijena = this.jedCijena*this.kolicina - popustZaPreplatu();
        System.out.println("Ukupna cijena za: " + this.getClass().getSimpleName() + " je: " + this.ukupnaCijena);
        return ukupnaCijena;
    }
}
