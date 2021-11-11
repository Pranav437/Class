public class DemoTest {
    public static void main(String[] args) {
        Demo f = new Demo("Dave", "Mary", "John", "Angel",
                200, 400);
        f.displayNames();
        f.setTotalSalary(10000);
        System.out.println("Total salary: $" +f.getTotalSalary());
        f.setSonFee(100);
        f.setDaughterFee(300);
        System.out.println("Total Fee: $" +f.getTotalFee());
        System.out.println("Total savings: $" +f.getTotalSavings());
        f.checkSavings();
    }
}
