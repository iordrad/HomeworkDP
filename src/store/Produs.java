package store;

public class Produs {
    private String nume;
    private int stoc;
    private double pret;

    public Produs(String nume, int stoc, double pret) {
        this.nume = nume;
        this.stoc = stoc;
        this.pret = pret;
    }

    @Override
    public String toString(){
        return nume+" "+stoc+" "+pret;
    }
    @Override
    public boolean equals(Object o){
        if(o==null)return false;
        if(o instanceof Produs){
            Produs p = (Produs) o;
            return p.nume.equals(this.nume);
        }
        return false;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}
