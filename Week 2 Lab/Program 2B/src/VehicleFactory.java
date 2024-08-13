// Abstract Product
interface Vehicle {
    void startRide();
}

class Car implements Vehicle {
    @Override
    public void startRide() {
        System.out.println("Car ride started");
    }
}

class Bike implements Vehicle {
    @Override
    public void startRide() {
        System.out.println("Bike ride started");
    }
}
abstract class VehicleFactory {
    public abstract Vehicle createVehicle();
}
class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
