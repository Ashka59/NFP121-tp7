package question1;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int returnResult(Operation op){
        return op.calcul(this.a, this.b);
    }
}
