public class FamilyAssignmentTest {
    public static void main(String[] args) {
        FamilyAssignment f = new FamilyAssignment("Dave", "Mary", "John", "Angel",
                200, 400);
        f.displayNames();
        f.setTotalSalary(700);
        System.out.println(f.getTotalSalary());

//
//        f.setFatherName("David");
//        f.setMotherName("Mary");
//        f.setSonName("John");
//        f.setDaughterName("Angel")
//        f.setFatherSalary(3000);
//        f.setMotherSalary(4000);
//        f.setSonFee(1000);
//        f.setDaughterFee(300);
//
//        System.out.println("Father Name: " +f.getFatherName());
//        System.out.println("Mother Name: " +f.getMotherName());
//        System.out.println("Son Name: " +f.getSonName());
//        System.out.println("Daughter Name: " +f.getDaughterName());
//        System.out.println("Father Salary: " +f.getFatherSalary());
//        System.out.println("Mother Salary: " +f.getMotherSalary());
//        System.out.println("Son Fee: " +f.getSonFee());
//        System.out.println("Daughter Fee: " +f.getDaughterFee());


    }
}
