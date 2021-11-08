public class PersonAssignmentTest {
    public static void main(String[] args) {
        PersonAssignment p = new PersonAssignment("Jim", "Roberts", "Maple view, Brampton", 53);
        System.out.println("Full Name: " +p.getfullName());
        System.out.println("Old address: " +p.getAddress());
        System.out.println("New address: " +p.changeAddress("King street, Toronto"));
        }
}