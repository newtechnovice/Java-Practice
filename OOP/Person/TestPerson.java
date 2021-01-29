import java.text.NumberFormat;

public class TestPerson {
    static NumberFormat cf = NumberFormat.getCurrencyInstance();
    public static void main(String[] args) {
        Person blank_person = new Person("Mark Lee", "Vancouver Canada");

        System.out.println("Name: " +blank_person.getName()+
                           "\nAddress: " +blank_person.getAddress());

        blank_person.setAddress("S.Korea");
        System.out.println(blank_person.toString());

        System.out.println();

        Student student1 = new Student("Kim Jungwoo", "Ulsan S.Korea", "Mechanical Engineer", 3, 6_000);

        System.out.println("Name: " +student1.getName() +
                           "\nAddress: " +student1.getAddress() +
                           "\nProgram: " +student1.getProgram() +
                           "\nYear: " +student1.getYear() +
                           "\nFee(USD): " +cf.format(student1.getFee()));

        student1.setAddress("Seoul S.Korea");
        student1.setProgram("Seoul School of Performing Arts");
        student1.setFee(3_560);
        System.out.println(student1.toString());

        System.out.println();

        Staff staff1 = new Staff("Jung Jaehyun", "Seoul", "Seoul School of Performing Arts", 890);

        System.out.println("Name: " +staff1.getName() +
                           "\nAddress: " +staff1.getAddress() +
                           "\nSchool: " +staff1.getSchool() +
                           "\nPay(USD): " +cf.format(staff1.getPay()));
        
        staff1.setSchool("School of Performing Arts Seoul");
        staff1.setPay(900);
        System.out.println(staff1.toString());
    } 
}
