public class Area {
    public static double pi = 3.14;
    double r;

    public Area (double r){
        this.r = r;
    }
    public double circumference() {
        return ((pi * r * r));
    }
}