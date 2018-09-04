package ex10NationalService;

public class ex10NationalService {

    public static void main (String [] args) {
        System.out.println("Civil Service:");
        CivilService civilService = new CivilService();
        System.out.println(civilService.getDaysLeft());
        civilService.work();
        System.out.println(civilService.getDaysLeft());

        System.out.println("Military Service:");
        MilitaryService militaryService = new MilitaryService(100);
        System.out.println(militaryService.getDaysLeft());
        militaryService.work();
        System.out.println(militaryService.getDaysLeft());
    }

}
