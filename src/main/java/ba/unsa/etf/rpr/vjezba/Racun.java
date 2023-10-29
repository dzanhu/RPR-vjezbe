package ba.unsa.etf.rpr.vjezba;

public class Racun {
    public Long brojRacuna;
    public Osoba korisnikRacuna;
    public boolean odobrenjePrekoracenja;
    public Double stanjeRacuna;
    public Racun(Long brojRacuna, Osoba xy){
        this.brojRacuna=brojRacuna;
        this.korisnikRacuna=xy;
        this.odobrenjePrekoracenja=false;
        this.stanjeRacuna=0.;

    }
    private boolean provjeriOdobrenjePrekoracenja(double a){
        return this.odobrenjePrekoracenja;
    }
    private boolean izvrsiUplatu(Double uplata){
        return true;
    }
    private boolean izvrsiIsplatu(Double isplata){
        return true;
    }
    public void odobriPrekoracenje(Double g){
        return;
    }

}
