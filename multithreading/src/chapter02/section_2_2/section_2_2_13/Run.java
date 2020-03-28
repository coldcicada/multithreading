package chapter02.section_2_2.section_2_2_13;

public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameVal");
        publicClass.setPassword("passwordVal");
        System.out.println(publicClass.getUsername() + " " + publicClass.getPassword());

        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAge("ageVal");
        privateClass.setAddress("addressVal");
        System.out.println(privateClass.getAge() + " " + privateClass.getAddress());
    }
}
