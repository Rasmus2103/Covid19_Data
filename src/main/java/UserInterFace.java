import java.util.Scanner;

public class UserInterFace {
    private Scanner sc = new Scanner(System.in);
    Controller controller = new Controller();


    public void startProgram() {
        while (true) {
            System.out.println("""
                    """);
            System.out.println("--------------------------------------------");
            uiMenu();
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1 -> loadData();
                case 2 -> showData();
                case 3 -> sortRegion();
                case 4 -> sortAgeGroup();
                case 9 -> exit();
                default -> System.out.println("Fejl i kommando. Prøv igen");
            }

        }

    }

    private void uiMenu () {
        System.out.println("""
                COVID 19 Databehandlingsprogram
                --------------------------------------------
                1) Load data
                2) Show data
                3) Search by region
                4) Search by ageGroup
                9) Exit
                """);
    }

    public void loadData () {
        controller.loadFile();
    }
    public void showData () {
        System.out.println("Indlæst data:");
        for (Covid19Data data : controller.showData()) {
            System.out.println(data);
        }
    }

    public void sortRegion() {
        System.out.println("Sorteret efter Region");
        controller.showRegion();
        for (Covid19Data data : controller.showData()) {
            System.out.println(data);
        }
    }

    public void sortAgeGroup() {
        System.out.println("Sorteret efter Aldersgruppe");
        controller.showAgeGroup();
        for (Covid19Data data : controller.showData()) {
            System.out.println(data);
        }
    }

    public void exit() {
        System.out.println("Tak for at bruge programmet");
        System.exit(0);
    }



}
