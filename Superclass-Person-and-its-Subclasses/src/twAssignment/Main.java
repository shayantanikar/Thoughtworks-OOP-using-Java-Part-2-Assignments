package twAssignment;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Rachael Green", "123 Main St");
        System.out.println(p1);
        p1.setAddress("456 Oak St");
        System.out.println("Name is: " + p1.getName());
        System.out.println("Address is: " + p1.getAddress());

        Student s1 = new Student("Monica Geller", "456 Sub St", "Computer Science", 3, 10000.0);
        System.out.println(s1);
        s1.setProgram("Information Technology");
        s1.setYear(4);
        s1.setFee(15000.0);
        System.out.println("Name is: " + s1.getName());
        System.out.println("Address is: " + s1.getAddress());
        System.out.println("Program is: " + s1.getProgram());
        System.out.println("Year is: " + s1.getYear());
        System.out.println("Fee is: " + s1.getFee());

        Staff st1 = new Staff("Ross Geller", "789 Sand St", "Springfield High", 3000.0);
        System.out.println(st1);
        st1.setSchool("Medford University");
        st1.setPay(5000.0);
        System.out.println("Name is: " + st1.getName());
        System.out.println("Address is: " + st1.getAddress());
        System.out.println("School is: " + st1.getSchool());
        System.out.println("Pay is: " + st1.getPay());
    }
}
