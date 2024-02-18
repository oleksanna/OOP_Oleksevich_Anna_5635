package DZ1;

public class HotDrink extends Product {
    private double volume;
    private int temperature;
    public HotDrink(String name, double cost, double volume, int temperature){
        super(name, cost);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() + '\'' +
                ", volume=" + volume + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
