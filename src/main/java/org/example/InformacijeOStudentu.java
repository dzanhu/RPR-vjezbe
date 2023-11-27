package org.example;

public class InformacijeOStudentu {
    private String ime;
    private String prezime;
    private String godinaStudija;
    private String brojIndexa;
    public String getIme(String ime){
        return ime;
    }
    void setIme(String ime){
        this.ime=ime;
    }
    public String getPrezime(String prezime){
        return prezime;
    }
    void setPrezime(String prezime){
        this.prezime=prezime;
    }
    public String getgodinaStudija(String godinaStudija){
        return godinaStudija;
    }
    void setGodinaStudija(String godinaStudija){
        this.godinaStudija=godinaStudija;
    }
    public String getBrojIndexa(String brojIndexa){
        return brojIndexa;
    }
    void setBrojIndexa(String brojIndexa){
        this.brojIndexa=brojIndexa;
    }

}
