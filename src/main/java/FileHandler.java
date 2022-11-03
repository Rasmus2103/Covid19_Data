import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileHandler {
    private final File f = new File("src/Nøgletal fra Covid19Data.csv");
    private ArrayList<Covid19Data> covidData = new ArrayList<>();

    public void sortByRegion() {
        Collections.sort(covidData, new RegionComparator());
    }

    public void sortByAgeGroup() {
        Collections.sort(covidData, new AldersGruppeComparator());
    }

    public void loadFile() {

        try {
            Scanner sc = new Scanner(f, StandardCharsets.ISO_8859_1);

            while (sc.hasNext()) {
                String linje = sc.nextLine();
                String[] attributter = linje.split(";");


                Covid19Data covid19Data;
                try {
                    covid19Data = new Covid19Data(
                            attributter[0],
                            attributter[1],
                            Integer.parseInt(attributter[2]),
                            Integer.parseInt(attributter[3]),
                            Integer.parseInt(attributter[4]),
                            Integer.parseInt(attributter[5]),
                            new SimpleDateFormat("dd-MM-yyyy").parse(attributter[6])
                    );
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(covid19Data);
                covidData.add(covid19Data);
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

    public ArrayList<Covid19Data> getCovidData() {
        return covidData;
    }

}
