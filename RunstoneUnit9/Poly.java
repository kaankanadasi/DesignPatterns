// Inherited Methods
public static class Person extends Object {
    private String name;
    
    public String getName() {
        return name;
    }
    public boolean setName(String theNewName) {
        if (theNewName != null) {
            this.name = theNewName;
            return true;
        }
        return false;
    }
}

public static class Employee extends Person {
    private static int nextId = 1;
    private int id;
    
    public Employee() {
        id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }
}

public static void main(String[] args) {
    Person emp = new Employee();
    emp.setName("Dina");
    System.out.println(emp.getName());
    // System.out.println(emp.getId()); this would give a compilation error
}


/*
 * class başına "static" getirmeden önce verdiği error: No enclosing instance of type Poly is accessible. Must qualify the allocation 
 * with an enclosing instance of type Poly (e.g. x.new A() where x is an instance of Poly)
 * 
 * ChatGPT: In Java, non-static inner classes require an instance of the outer class to be instantiated. Make Person and Employee 
 *          static inner classes: This means they won't require an instance of Poly to be instantiated. You can do this by adding 
 *          the static keyword before their class declarations:
*/

/*
 * Diğer Opsiyon:
 * Instantiate Person and Employee within an instance of Poly: Since Person and Employee are non-static inner classes, you'll need an 
 * instance of Poly to create instances of them. You can do this by creating an instance of Poly first and then instantiating Person 
 * and Employee:
  
    public static void main(String[] args) {
        Poly poly = new Poly();
        Person emp = poly.new Employee(); // Instantiate Employee within an instance of Poly
        emp.setName("Dina");
        System.out.println(emp.getName());
    }

*/