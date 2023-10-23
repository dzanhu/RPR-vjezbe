package ba.unsa.etf.rpr.lv1_z1;

public class Racun {
    static double Sinus(double broj){
        double br=Math.toRadians(broj);
        return Math.sin(br);
    }
    static int Faktorijel(double broj){
        int rezultat=1;
        for(int i=1; i<broj; i++){
            rezultat*=i;
        }
        return rezultat;
    }
}
