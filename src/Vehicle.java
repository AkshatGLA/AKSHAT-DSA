class Vehicle {
    String type = "4w";
    int maxSpeed = 100;

    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    Vehicle() {}
}

class Car extends Vehicle {
    String trans;

    Car(String trans) { // line n1
        this.trans = trans;
    }

    Car(String type, int maxSpeed, String trans) { // line n2
        super(type, maxSpeed);
        this.trans = trans;
    }

    public static void main(String[] args) {
        // And given the code fragment:
        Car c1 = new Car("Auto");
        Car c2 = new Car("4w", 150, "Manual");
        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
    }
}

