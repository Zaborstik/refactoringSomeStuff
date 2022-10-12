package src.car;

public class Cabriolet extends Car{
    public Cabriolet(int numberOfPassengers) {
        super(CABRIOLET, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed(){
        return MAX_CABRIOLET_SPEED;
    }
}
