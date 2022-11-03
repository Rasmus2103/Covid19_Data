import java.util.ArrayList;

public class Controller {
    FileHandler fileHandler = new FileHandler();

    public void loadFile() {
        fileHandler.loadFile();
    }

    public void showRegion() {
        fileHandler.sortByRegion();
    }

    public void showAgeGroup() {
        fileHandler.sortByAgeGroup();
    }

    public ArrayList<Covid19Data> showData() {
        return fileHandler.getCovidData();
    }

}
