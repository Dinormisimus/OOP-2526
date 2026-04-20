public class ShippingCalculator {

    public void calculateShipping(double weightKg, boolean express) {


        class Pricing {
            double price() {

                double basePrice = 2.0 + 1.2 * weightKg;


                if (express) {
                    return basePrice * 1.5;
                }

                return basePrice;
            }
        }


        Pricing pricing = new Pricing();
        double finalPrice = pricing.price();


        System.out.printf("Težina: %.2f kg | Express: %b | Ukupna cijena: %.2f EUR%n",
                weightKg, express, finalPrice);
    }

    public static void main(String[] args) {
        ShippingCalculator calculator = new ShippingCalculator();

        // Testni primjeri
        calculator.calculateShipping(5.0, false);
        calculator.calculateShipping(5.0, true);
    }
}