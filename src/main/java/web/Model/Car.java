package web.Model;

public class Car {
    private String model;
    private int series;
    private int release;

    public String getModel() {
        return model;
    }

    public Car(String model, int series, int release) {
        this.model = model;
        this.series = series;
        this.release = release;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", release=" + release +
                '}';
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }
}
