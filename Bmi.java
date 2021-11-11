public class Bmi {
    private double weight;
    private double height;
    private double bmi;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi(){
        bmi = weight / (height * height);
        return bmi;
    }
}
