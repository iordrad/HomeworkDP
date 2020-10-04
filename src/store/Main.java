package store;

public class Main {
    public static void main(String[] args) {
        Magazin magazin = new Magazin();

        Client c1 = new Client("Eminescu","Mihai");
        Client c2 = new Client("Creanga","Ion");

        Produs p1 = new Produs("pix",100,1.5);
        Produs p2 = new Produs("caiet",50,5);

        magazin.adaugaClient(c1);
        magazin.adaugaClient(c2);
        magazin.adaugaProdus(p1);
        magazin.adaugaProdus(p2);

        magazin.modificaPretProdus(p1,2);
        System.out.println(p1.getPret());

        magazin.adaugaStocProdus(p2,30);
        System.out.println(p2.getStoc());

        magazin.cumparaProdus(p2,70,c1);
        System.out.println(p2.getStoc());
    }
}
