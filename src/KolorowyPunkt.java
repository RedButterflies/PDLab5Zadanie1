import java.util.Scanner;

public class KolorowyPunkt extends Punkt {
    private String kolor;

    public KolorowyPunkt(double x, double y, String nazwaPunktu) {
        super(x, y, nazwaPunktu);
    }

    public KolorowyPunkt(double x, double y, String nazwaPunktu, String kolor) {
        super(x, y, nazwaPunktu);
        this.kolor = kolor;
    }

    public String getKolor() {
        System.out.println("Ustawiony kolor to: "+ kolor);
        return kolor;
    }

    public void setKolor(String kolor) {
        System.out.println("Zmieniono kolor na: "+ kolor);
        this.kolor = kolor;
    }
}
