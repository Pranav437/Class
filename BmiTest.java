public class BmiTest {
    public static void main(String[] args) {
        Bmi b = new Bmi();
        b.setHeight(1.75);
        b.setWeight(73);
        System.out.println(b.getBmi());
    }
}
