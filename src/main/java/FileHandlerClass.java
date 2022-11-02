import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileHandlerClass {
    public static void main(String[] args) {
        File f = new File("src/Nøgletal fra Covid19Data.csv");

        try {
            Scanner sc = new Scanner(f);

            while (sc.hasNext()) {
                String linje = sc.nextLine();
                String[] attributter = linje.split(",");

                Covid19Data covid19Data = new Covid19Data(
                        attributter[0],
                        attributter[1],
                        attributter[2],
                        attributter[3],
                        attributter[4],
                        attributter[5],
                        attributter[6]

                );
                System.out.println(covid19Data);
            }
            sc.close();

        } catch (IOException e) {
            System.out.println("Fejl i kommunikation med fil");

        } catch (NumberFormatException e) {
            System.out.println("Fejl i filformat: " + e.getMessage());
        }

        System.out.println("Fil størrelse: " + f.length());
        System.out.println("Ændringsdato: " + new Date(f.lastModified()));
    }

}
