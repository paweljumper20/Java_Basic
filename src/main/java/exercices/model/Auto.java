package exercices.model;

//1. utworz klasę auto w ktorej zadeklarujesz następujące pola
// - brand
// - model
// - engine (1.5 , 1.9 , 2.0 , 3.0)
// - fuel (diesel , gasoline)
// - price
// wykorzystaj model JavaBeans


import java.time.LocalDateTime;

public class Auto {
    private String brand;
    private String model;
    private Engine engine;
    private Fuel fuel;
    private double price;
    private LocalDateTime dateAdded = LocalDateTime.now();

    public Auto(String brand, String model, Engine engine, Fuel fuel, double price) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", fuel='" + fuel + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
