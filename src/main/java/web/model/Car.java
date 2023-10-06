package web.model;

public class Car {

    private int id;
    private int carPrice;
    private String carModel;

    public Car() {}

    public Car(String carModel, int carPrice, int id) {
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.id = id;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carPrice=" + carPrice +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}