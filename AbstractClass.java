abstract class Bike {
    //An abstract method doesn't have its body
    abstract void sound();

    //non-abstract method
    void speed() {
        System.out.println("Speed is above 150 km/h");
    }
}

//subclass for an abstract class
class Car extends Bike {
    //provide implementation of abstract method
    void sound() {
        System.out.println("Speed is less than 200 km/h");
    }

    public static void main(String[] args) {
        Bike B = new Car();
        //accessing the non-abstract methods
        B.speed();

        //instance for the child class
        Car C = new Car();
        //calling abstract methods
        C.sound();
        //calling non-abstract methods
        C.speed();
    }
}