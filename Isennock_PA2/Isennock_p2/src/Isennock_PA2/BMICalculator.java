package Isennock_PA2;

import java.util.Scanner;
/*
* The Program will begin by calling readUserData, readUserData will first call readUnitType which will get a character input of either i or m from the user
* and return it to be stored in a private char var type, it will then take that type variable and pass it toreadMeasurement to get the height and weight of the user
* then calculateBmi will be called from main and based of the value stored in type it will either use the metric based or imperial based bmi calculation method
*
* */
public class BMICalculator {
    private double weight;

    private char type;

    private double height;
    private double bmi;
    private String bmiCat;
    public void readUserData(){
        type = readUnitType();
        readMeasurementData(type);
    }
    private char readUnitType(){
        System.out.println("Please enter an m for metric or i for imperial measurements: ");
        Scanner scn = new Scanner(System.in);
        char unitType = scn.next().toLowerCase().charAt(0);
        return unitType;
    }
    private void readMeasurementData(char unitType){
        if(unitType == 'm'){
            readMetricData();
        }else if(unitType == 'i'){
            readImperialData();
        }
    }
    private void readMetricData(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your Height in Meters");
        setHeight(scn.nextDouble());
        System.out.println("please enter your Weight in Kilograms ");
        setWeight(scn.nextDouble());
    }
    private void readImperialData(){
        Scanner scn = new Scanner(System.in);
        setWeight(scn.nextDouble());
        setHeight(scn.nextDouble());

    }

    public void calculateBmi(){
        if(weight < 0 || height < 0){
            return;
        }
        if(type == 'm'){
            bmi = getWeight()/(getHeight()*getHeight());
        }else if(type == 'i'){
            bmi = (703 * getWeight())/(getHeight()*getHeight());

        }
        bmiCat=calculateBmiCategory();
    }
    private String calculateBmiCategory(){
        if(bmi < 18.5){
            return "Underweight";
        }else if(bmi<25){
            return "Normal Weight";
        }else if(bmi<30){
            return "Overweight";
        }else{
            return "Obesity";
        }
    }
    public void displayBmi(){
        System.out.printf("BMI Value : %.2f BMI Category: %s",getBmi(),getBmiCat());
    }
    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public String getBmiCat() {
        return bmiCat;
    }
}
