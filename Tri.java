public class Tri extends Shape {

    double a;
    double b;
    double c;
    double h;

    public Tri(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    void calcrArea() {
        this.area = this.b * this.h / 2 ;

    }

    @Override
    void calcrHekef() {
        this.hekef = this.a * this.b * this.c ;

    }

    @Override
    public String toString() {
        return "Tri{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", h=" + h +
                ", area=" + area +
                ", hekef=" + hekef +
                '}';
    }
}
