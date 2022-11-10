public class Main {
    public static void main(String[] args) {

        System.out.println("Kolorowy punkt: ");
        KolorowyPunkt kolorowyPunkt = new KolorowyPunkt(6,7,"Kolorowy Punkt", "rozowy");
        System.out.println("Nazwa punktu: "+kolorowyPunkt.getNazwaPunktu());
        System.out.println("Wspolrzedne punktu: x= "+ kolorowyPunkt.getX() + " y= "+ kolorowyPunkt.getY());
        kolorowyPunkt.getKolor();
        kolorowyPunkt.setKolor("zielony");

    }
}