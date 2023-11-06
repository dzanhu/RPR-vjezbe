package ba.unsa.etf.rpr;

public abstract class MedunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;
    public MedunarodniBroj(String drzava, String broj){
        this.drzava=drzava;
        this.broj=broj;
    }
}
