package oops.inter;

public class powereng implements engine {
    @Override
    public void start() {
        System.out.println("pe start");

    }

    @Override
    public void stop() {
        System.out.println("pe stop");


    }

    @Override
    public void acc() {
        System.out.println("pe accelerate");


    }
}
