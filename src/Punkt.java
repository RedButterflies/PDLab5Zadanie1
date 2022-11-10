public class Punkt {
    private double x;
    private double y;
    private String nazwaPunktu;

    public Punkt(double x, double y, String nazwaPunktu) {
        this.x = x;
        this.y = y;
        this.nazwaPunktu = nazwaPunktu;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getNazwaPunktu() {
        return nazwaPunktu;
    }

    public void setNazwaPunktu(String nazwaPunktu) {
        this.nazwaPunktu = nazwaPunktu;
    }
}
