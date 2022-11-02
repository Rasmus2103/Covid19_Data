import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;


public class FileHandler {

    public static void main(String[] args) {
        File f = new File("src/Nøgletal fra Covid19Data.csv");

        // Indlæsning af CSV fil og genskabelse af objekter
        try {
            Scanner sc = new Scanner(f);

            while (sc.hasNext()) {
                String linje = sc.nextLine();
                String[] attributter = linje.split(",");

                // opret et person objekt
                Covid19Data covid19Data = new Covid19Data(
                        attributter[0],
                        Integer.parseInt(attributter[1]),
                        attributter[2],
                        Integer.parseInt(attributter[3]),
                        Integer.parseInt(attributter[4]),
                        Integer.parseInt(attributter[5]),
                        attributter[6]
                );
                System.out.println(covid19Data);

            }

        } catch (IOException e) {
            System.out.println("Fejl i kommunikation med fil");

        } catch (NumberFormatException e) {
            System.out.println("Fejl i filformat: " + e.getMessage());
        }

        System.out.println("Fil størrelse: " + f.length());
        System.out.println("Ændringsdato: " + new Date(f.lastModified()));

    }




}
