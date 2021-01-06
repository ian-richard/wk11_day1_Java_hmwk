public class Calculator {
    private String name;
    private int number1;
    private int number2;

    public Calculator(String name, int number1, int number2){
        this.name = name;
        this.number1 = number1;
        this.number2 = number2;
    }

    public String getName(){
        return this.name;
    }

    public int getNumber1() {
        return this.number1;
    }

    public int getNumber2() { return this.number2; }

    public int add() {
        return this.number1 + this.number2;
    }

    public int subtract() {
        return this.number1 - this.number2;
    }

    public int multiply() {
        return this.number1 * this.number2;
    }

    public double divide( double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

}
