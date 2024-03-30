package Arithmetic;

public class Arithmetic<F extends Number,S extends Number>{

    F num1;
    S num2;
    public Arithmetic(F num1, S num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        return this.num1.doubleValue() + this.num2.doubleValue();
    }

    public double subtract(){
        return this.num1.doubleValue() - this.num2.doubleValue();
    }

    public double multily(){
        return num1.doubleValue()*num2.doubleValue();
    }
    public double divide(){
        if(num2.doubleValue() == 0){
            throw new ArithmeticException("Cannot be divided by zero");
        }
        else{
            return num1.doubleValue()/num2.doubleValue();
        }
    }

    public double getMin(){
        double n1 = num1.doubleValue();
        double n2 = num2.doubleValue();
        return Math.min(n1,n2);
    }

    public double getMax(){
        double n1 = num1.doubleValue();
        double n2 = num2.doubleValue();
        return Math.max(n1,n2);
    }
}
