/**
 * The equals method defined in Object and thus inherited by all classes only considers two object references equivalent if they refer 
 * to exactly the same object. But we saw in Unit 2 that the String class provides an equals method that considers two String objects 
 * equivalent if they have the same characters in the same order, even if they are actually different objects. How does that work?
 * 
 * It is because the String class has overridden the equals method it inherited from Object to provide a definition of equality that 
 * makes more sense.
 * 
 * As we saw in section 9.3 a class can override inherited methods by providing a method with the same method signature 
 * (method name, parameter types, and return type). String has done that with equals so when we compare String objects with 
 * equals that new method will be called instead of the inherited one.
*/


public class equals {
    private String name;

    public equals(String theName) {
        this.name = theName;
    }

    public static void main(String[] args) {

        equals p1 = new equals("Kairen");
        equals p2 = new equals("Jewel");
        equals p3 = new equals("Kairen");
        equals p4 = p3;
        System.out.println(p1.equals(p2)); // false
        System.out.println(p2.equals(p3)); // false
        System.out.println(p1.equals(p3)); // false
        System.out.println(p3.equals(p4)); // true
        System.out.println(p1.name);


        String s1 = "hi";
        String s2 = "Hi";
        String s3 = new String("hi");
        System.out.println(s1.equals(s2)); // false
        System.out.println(s2.equals(s3)); // false
        System.out.println(s1.equals(s3)); // true
    }
}