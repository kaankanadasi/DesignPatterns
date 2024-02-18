// Overriding Methods
public class Greeter2 {
    public String greet() {
        return "Hi";
    }

    public static void main(String[] args) {
        Greeter2 g1 = new Greeter2();
        System.out.println(g1.greet());
        Greeter2 g2 = new MeanGreeter();
        System.out.println(g2.greet());
        Greeter2 g3 = new SpanishGreeter();
        System.out.println(g3.greet());
    }
}

class MeanGreeter extends Greeter2 {
    public String greet() {
        return "Go Away";
    }
}

class SpanishGreeter extends Greeter2 {
    @Override
    public String greet() {
        return "Hi";
    }
}