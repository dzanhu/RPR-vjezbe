package ba.unsa.etf.rpr;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public interface LaptopDao {
    void dodajLaptopUListu(Laptop laptop);
    void dodajLaptopUFile(Laptop laptop) throws IOException;
    ArrayList<Laptop> getLaptop(String procesor);
    void napuniListu(ArrayList<Laptop> laptopi);
    ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException;
}
