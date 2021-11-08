public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Pranav");
        p.setAge(29);
        p.setEmail("pranavece58@gmail.com");
        p.setAddress("Brampton");
        p.setId(9003);
        System.out.println("Name: " +p.getName());
        System.out.println("Age: " +p.getAge());
        System.out.println("Email: " +p.getEmail());
        System.out.println("Address: " +p.getAddress());
        System.out.println("Id: " +p.getId());
    }
}
