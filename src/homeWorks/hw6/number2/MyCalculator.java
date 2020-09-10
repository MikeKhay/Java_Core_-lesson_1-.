package homeWorks.hw6.number2;

public class MyCalculator implements Numerable {
    double plu1,plu2,mul1,mul2,min1,min2,dev1,dev2;

    public MyCalculator(double plu1, double plu2, double mul1, double mul2, double min1, double min2, double dev1, double dev2) {
        this.plu1 = plu1;
        this.plu2 = plu2;
        this.mul1 = mul1;
        this.mul2 = mul2;
        this.min1 = min1;
        this.min2 = min2;
        this.dev1 = dev1;
        this.dev2 = dev2;
    }

    @Override
    public double devide() {
        return this.dev1/this.dev2;
    }

    @Override
    public double minus() {
        return this.min1-this.min2;
    }

    @Override
    public double multiply() {
        return this.mul1*this.mul2;
    }

    @Override
    public double plus() {
        return this.plu1+this.plu2;
    }
}
