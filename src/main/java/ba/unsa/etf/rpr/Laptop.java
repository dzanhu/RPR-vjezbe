package ba.unsa.etf.rpr;

public class Laptop {
    private String brend;
    private String model;
    private double cijena;
    private int ram;
    private int hdd;
    private int ssd;
    private String procesor;
    private String grafickaKartica;
    private double velicinaEkrana;
    public String getBrend(){
        return brend;
    }
    public String getModel(){
        return model;
    }
    public double getCijena(){
        return cijena;

    }
    public int getRam(){
        return ram;

    }
    public int getHdd(){
        return hdd;
    }
    public int getSsd(){
        return ssd;
    }
    public String getProcesor(){
        return procesor;

    }
    public String getGrafickaKartica(){
        return grafickaKartica;
    }
    public double getVelicinaEkrana(){
        return velicinaEkrana;
    }
    public void setBrend(String brend) {
        this.brend = brend;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setGrafickaKartica(String grafickaKartica) {
        this.grafickaKartica = grafickaKartica;
    }

    public void setVelicinaEkrana(double velicinaEkrana) {
        this.velicinaEkrana = velicinaEkrana;
    }
}
