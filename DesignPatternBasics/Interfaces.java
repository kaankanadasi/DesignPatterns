// coupling - how much a class is dependent on another class, for efficient coupling we use interfaces
// interface - a contract that specifies he capabilities that a class should provide 
// abstraction - reduce complexity by hiding unnecessary details, örneğin main'd ekullanmayacağın metodları private yap

public interface TaxCalculator {
    float calculateTax();
}

public class TaxCalculator2023 implements TaxCalculator {
    @Override
    public float calculateTax() {
        return 1;
    }
}

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
    }
    public static TaxCalculator getCalculator() {
        return new TaxCalculator2023();
    }
}

/*
 * Ya da polymorphism ile main methodu yaz: ???
 * 
 * TaxCalculator calculator = new TaxCalculator2023();
 * calculator.calculateTax();
*/