package CollegeBoard;

public class Bike {
    private int numOfWheels = 2;

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public class EBike extends Bike{
        private int numOfWatts;
    
        public EBike(int watts) {
            numOfWatts = watts;
        }
        public int getNumOfWatts() {
            return numOfWatts;
        }
    }
}


/*
 * Bike b = new EBike(250);
 * System.out.println(b.getNumOfWatts());
 * System.out.println(b.getNumOfWheels());
 * 
 * Which of the following best explains why the code segment does not compile?
 * The getNumOfWatts method is not found in the Bike class.
 * 
 * At compile time, the declared type of b determines where the compiler looks for methods during method calls. In this case, 
 * b is declared to be of type Bike, but the getNumOfWatts method does not appear in the Bike class.
*/