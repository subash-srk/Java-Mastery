class Calculator{
    String name = "This is Calculator";
    //methods
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

public class classdemo {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;
        Calculator calc = new Calculator();
        System.out.println(calc.add(num1, num2));
    }
    
}
