package codegym.vn.model;

public class Calculator {
    private double firstNum;
    private double secondNum;
    private String calculator;

    public Calculator(double firstNum, double secondNum, String calculator) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.calculator = calculator;
    }

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public String getCalculator() {
        return calculator;
    }

    public void setCalculator(String calculator) {
        this.calculator = calculator;
    }

    public double result(){
        double result = 0;
        switch (this.calculator){
            case "Addition(+)":
                result = this.firstNum + this.secondNum;
                break;
            case "Subtraction(-)":
                result = this.firstNum - this.secondNum;
                break;
            case "Multiplication(x)":
                result = this.firstNum * this.secondNum;
                break;
            case "Division(/)":
                result = this.firstNum / this.secondNum;
                break;
            default:
                result = 0;
        }
        return result;
    }

}
