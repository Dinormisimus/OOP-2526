package zd_3;

import java.util.*;

public class Package {
    private int idPackage;
    private static int cntPckg = 0;
    private String destination;
    private Customer customer;
    private float pricePackage;
    private int totalKom;
    private String webShop;
    private Scanner sc;
    private List<Item> items = new ArrayList<>();

    public Package(String webShop, Customer customer, String destination, Scanner sc) {
        this.webShop = webShop;
        this.customer = customer;
        this.destination = destination;
        this.sc = sc;
        this.idPackage = ++cntPckg;
    }

    // Unutarnje klase prema dijagramu
    private class T_Shirt extends Item {
        float tshirtPrice; int komTshirt;
        T_Shirt(float p, int k) { this.tshirtPrice = p; this.komTshirt = k; }
        public float itemPrice() { return tshirtPrice * komTshirt; }
        public float getPrice() { return tshirtPrice; }
        public int getKom() { return komTshirt; }
    }

    private class Pants extends Item {
        float pantPrice; int komPant;
        Pants(float p, int k) { this.pantPrice = p; this.komPant = k; }
        public float itemPrice() { return pantPrice * komPant; }
        public float getPrice() { return pantPrice; }
        public int getKom() { return komPant; }
    }

    private class Helmet extends Item {
        float helmetPrice; int komHelmet;
        Helmet(float p, int k) { this.helmetPrice = p; this.komHelmet = k; }
        public float itemPrice() { return helmetPrice * komHelmet; }
        public float getPrice() { return helmetPrice; }
        public int getKom() { return komHelmet; }
    }

    private class Sneakers extends Item {
        float sneakersPrice; int komSneakers;
        Sneakers(float p, int k) { this.sneakersPrice = p; this.komSneakers = k; }
        public float itemPrice() { return sneakersPrice * komSneakers; }
        public float getPrice() { return sneakersPrice; }
        public int getKom() { return komSneakers; }
    }

    public void putContent() {
        boolean continueShopping = true;
        while (continueShopping) {
            System.out.println("Izaberite: 1. T-Shirt, 2. Pants, 3. Helmet, 4. Sneakers, 0. Završi");
            int choice = sc.nextInt();
            if (choice == 0) break;

            float rPrice = randFloatPrice();
            int rKom = randIntKom();

            switch (choice) {
                case 1 -> items.add(new T_Shirt(rPrice, rKom));
                case 2 -> items.add(new Pants(rPrice, rKom));
                case 3 -> items.add(new Helmet(rPrice, rKom));
                case 4 -> items.add(new Sneakers(rPrice, rKom));
            }
        }
        checkPaymentPackage();
    }

    public boolean checkPaymentPackage() {
        class PaymentMedia {
            String[] allowed = {"POU", "CP", "OPS"};
            boolean paymentApproved(String method) {
                for (String s : allowed) if (s.equalsIgnoreCase(method)) return true;
                System.out.println("Neispravna metoda. Unesite ponovno (POU, CP, OPS):");
                return paymentApproved(sc.next()); // Rekurzivni poziv prema uputi
            }
        }
        System.out.println("Unesite metodu plaćanja (POU, CP, OPS):");
        return new PaymentMedia().paymentApproved(sc.next());
    }

    public void calculateTotalPackagePrice() {
        pricePackage = 0;
        totalKom = 0;
        for (Item i : items) {
            pricePackage += i.itemPrice();
            totalKom += i.getKom();
        }
    }

    public void packageInfo() {
        System.out.println("--- INFORMACIJE O NARUDŽBI ---");
        System.out.println("Paket ID: " + idPackage + " | Shop: " + webShop);
        customer.customerInfo();
        System.out.println("Odredište: " + destination);
        System.out.println("Ukupno komada: " + totalKom);
        System.out.println("Ukupna cijena: " + pricePackage + " EUR");
    }

    private float randFloatPrice() { return (float) (Math.random() * 100 + 10); }
    private int randIntKom() { return (int) (Math.random() * 5 + 1); }
}
