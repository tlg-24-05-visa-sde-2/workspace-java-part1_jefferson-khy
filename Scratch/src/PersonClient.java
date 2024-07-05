import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Jeff", LocalDate.of(1993,06,15));
        System.out.println(p1);
    }
}