package Isennock_PA2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BMICalculator app = new BMICalculator();
        app.readUserData();
        app.calculateBmi();
        app.displayBmi();
    }
}
