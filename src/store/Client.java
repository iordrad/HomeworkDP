package store;

public class Client {
    String nume;
    String prenume;

    public Client(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public String toString(){
        return nume+" "+prenume;
    }
    @Override
    public boolean equals(Object o){
        if(o==null)return false;
        if(o instanceof Client){
            Client c= (Client) o;
            return c.nume.equals(this.nume)&&c.prenume.equals(this.prenume);
        }
        return false;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
}
