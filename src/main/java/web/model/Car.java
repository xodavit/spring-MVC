package web.model;

public class Car {

    private String brandAndModel;
    private String win;
    private int year;

    public Car() {
    }

    public Car(String brandAndModel, String win, int year) {
        this.brandAndModel = brandAndModel;
        this.win = win;
        this.year = year;
    }

    public String getBrandAndModel() {
        return brandAndModel;
    }

    public void setBrandAndModel(String brandAndModel) {
        this.brandAndModel = brandAndModel;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandAndModel='" + brandAndModel + '\'' +
                ", win='" + win + '\'' +
                ", year=" + year +
                '}';
    }
}
