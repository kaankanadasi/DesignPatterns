public class Greeter {
    public String greet() {
        return "Hi";
    }

    public String greet(String who) {
        return "Hello " + who;
    }

    public static void main(String[] args) {
        Greeter g1 = new Greeter();
        System.out.println(g1.greet("Sam"));
        Greeter g2 = new MeanGreeter();
        System.out.println(g2.greet("Nimish"));
    }
}

class MeanGreeter extends Greeter {
    public String greet() {
        return "Go away";
    }
    
    public String greet(String who) {
        return "Go away " + who;
    }
}

