public class Rectangle extends Shape{

    double a ;
    double b ;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    void calcrArea() {
        this.area = this.a * this.b;
    }
    @Override
    void calcrHekef() {
        this.hekef =2* this.a + 2* this.b;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", area=" + area +
                ", hekef=" + hekef +
                '}';
    }
}
