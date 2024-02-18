// super
public class Person1 {
    private String name = null;

    public Person1(String theName) {
        name = theName;
    }

    public String getFood() {
        return "Hamburger";
    }

    public static void main(String[] args) {
        Person1 p = new Vegan("Javier");
        System.out.println(p.getFood());
    }
}

class Student extends Person1 {
    private int id;
    private static int nextId = 0;

    public Student(String theName) {
        super(theName);
        id = nextId;
        nextId++;
    }

    public String getFood() {
        String output = super.getFood();
        return output + " and Pizza";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int theId) {
        this.id = theId;
    }
}

class Vegan extends Student {
    public Vegan(String theName) {
        super(theName);
    }
    
    public String getFood() {
        return "No " + super.getFood() + " but *";
    }
}