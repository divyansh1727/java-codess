package oops.inter;

public class Car implements engine,brake,media {

    @Override
    public void brake() {
        System.out.println("numew");

    }

    @Override
    public void start() {
        System.out.println("nume staw");

    }

    @Override
    public void stop() {
        System.out.println("numesropw");

    }

    @Override
    public void acc() {
        System.out.println("numeaccw");

    }
}
