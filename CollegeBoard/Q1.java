package CollegeBoard;

public class Q1 {

public class Robot {
    private int servoCount;
    public int getServoCount() {
        return servoCount;
    }
    public void setServoCount(int in) {
        servoCount = in;
    }
}

public class Android extends Robot {
    private int servoCount;
    public Android(int initVal) {
        setServoCount(initVal);
    }
    public int getServoCount() {
        return super.getServoCount();
    }
    public int getLocal() {
        return servoCount;
    }
    public void setServoCount(int in) {
        super.setServoCount(in);
    }
    public void setLocal(int in) {
        servoCount = in;
    }
}

}

/*
    int x = 10;
    int y = 20;
    *- missing code -*
*/