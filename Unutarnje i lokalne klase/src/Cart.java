public class Cart {
    private double sum = 0;

    public Cart ( double sum ) { this . sum = sum ; }

    public Discount discount () { return new Discount () ; }

    public class Discount{
        public double apply ( double percent ) {
            if ( percent < 0 || percent > 100) {
                throw new IllegalArgumentException (" Postotak mora biti 0..100 ") ;

            }
            return sum * (1.0 - percent / 100.0) ;

        }
    }
}


