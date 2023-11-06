package ba.unsa.etf.rpr;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
public class Imenik {
    private HashMap<String, TelefonskiBroj> mapa;
    public Imenik(){ mapa = new HashMap<>(); }

    public void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime, broj);
    }
    public String dajBroj(String ime){
        return mapa.get(ime).Ispisi();
    }
}
