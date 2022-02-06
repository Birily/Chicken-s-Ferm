public class CarOwner {

    public static void main(String[] args) {
	Car car = new Car();
    car.start();
    System.out.println("Distance: "+car.drive(2)+" km");
    car.stop();

    JamesBondCar jamesBondCar = new JamesBondCar();
    jamesBondCar.start();
    System.out.println("Distance: "+jamesBondCar.drive(2)+" km");
    jamesBondCar.stop();
    }
}
