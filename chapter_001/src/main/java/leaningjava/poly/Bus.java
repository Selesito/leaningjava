package leaningjava.poly;

public class Bus implements Transport {
    @Override
    public void travel() {

    }

    @Override
    public void passeger(int count) {

    }

    @Override
    public double refuel(double fuel) {
        double price = fuel * 47.5;
        return price;
    }
}
