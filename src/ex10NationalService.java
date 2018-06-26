public class ex10NationalService {

    public static void main(String[] args) {

        // Exercise 10.1
        CivilService civilService = new CivilService(3);
        System.out.println(civilService.getDaysLeft());

        civilService.work();
        System.out.println(civilService.getDaysLeft());
        civilService.work();
        System.out.println(civilService.getDaysLeft());
        civilService.work();
        System.out.println(civilService.getDaysLeft());

        // Exercise 10.2
        // Demonstrate how each method from an interface must have an implementation

    }
}
