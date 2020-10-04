package store;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
    private List<Produs> listProdus = new ArrayList<>();
    private List<Client> listClient = new ArrayList<>();

    public void adaugaProdus(Produs p){
        if(checkExistingProduct(p)){
            System.out.println("Product "+p.getNume()+" already exists");
        }else{
            listProdus.add(p);
            for(Client c : listClient){
                System.out.println(c+" :A fost adaugat produsul: "+p.getNume());
            }
        }
    }

    public void adaugaStocProdus(Produs p, int additionalStoc){
        if(checkExistingProduct(p)){
            int newStoc = p.getStoc()+additionalStoc;
            p.setStoc(newStoc);
            for(Client c : listClient){
                System.out.println(c+" :A fost modificat stocul produsul: "+p.getNume()+" noul stoc este "+p.getStoc());
            }
        }
    }

    public void cumparaProdus(Produs p, int cantitateCumparata, Client c){
        if(p.getStoc()<cantitateCumparata){
            System.out.println("Stoc insuficient");
        }else{
            int newStoc = p.getStoc()-cantitateCumparata;
            System.out.println(c+" a achizitionat "+cantitateCumparata+" din produsul "+p.getNume());
            p.setStoc(newStoc);
            for(Client cl : listClient){
                System.out.println(c+" :A fost modificat stocul produsul: "+p.getNume()+" noul stoc este "+p.getStoc());
            }
        }
    }

    public void modificaPretProdus(Produs p, double newPrice){
        if(checkExistingProduct(p)){
            p.setPret(newPrice);
            for(Client c : listClient){
                System.out.println(c+" :A fost modificat pretul produsul "+p.getNume()+" ,noul pret este "+p.getPret());
            }
        }else{
            System.out.println(p+ "nu a fost gasit in lista de produse");
        }
    }

    public boolean checkExistingProduct(Produs p){
        boolean check=false;
        for(int i=0; i<listProdus.size();i++){
            if(listProdus.get(i).equals(p)){
                check=true;
                break;
            }
        }
        return check;
    }

    public void adaugaClient(Client c){
        if(checkExistingClient(c)){
            System.out.println(c+" already exists");
        }else{
            listClient.add(c);
        }
    }

    public void eliminaClient(Client c){
        if(checkExistingClient(c)){
            listClient.remove(c);
        }else{
            System.out.println(c+" not found in the client list");
        }
    }

    public boolean checkExistingClient(Client c){
        boolean check=false;
        for(int i=0; i<listClient.size();i++){
            if(listClient.get(i).equals(c)){
                check=true;
                break;
            }
        }
        return check;
    }

}
