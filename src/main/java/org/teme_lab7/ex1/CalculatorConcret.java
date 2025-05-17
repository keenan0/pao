package org.teme_lab7.ex1;

public class CalculatorConcret implements Calculator {
    @Override
    public Double add(Double x, Double y) throws NullParameterException, OverflowException, UnderflowException {
        if(x == null || y == null)
            throw new NullParameterException("Unul din parametri este null");

        Double sum = x + y;

        if(sum == Double.NEGATIVE_INFINITY)
            throw new OverflowException("Suma numerelor este -infinit");
        if(sum == Double.POSITIVE_INFINITY)
            throw new UnderflowException("Suma numerelor este +infinit");

        return sum;
    }

    @Override
    public Double divide(Double x, Double y) throws MyArithmeticException {
        if(x == null || y == null)
            throw new NullParameterException("Unul din parametri este null");

        if(y == 0)
            throw new MyArithmeticException("Impartire la 0");

        Double sum = x / y;

        return sum;
    }

    @Override
    public Double average(Double[] arr) throws NullParameterException {
        if(arr == null)
            throw new NullParameterException("Vectorul este null");

        if(arr.length == 0)
            return 0.0;

        Double sum = 0.0;
        for(Double elem : arr) {
            if(elem == null)
                throw new NullParameterException("Un element din vector este null");

            sum = add(sum, elem);
        }

        return divide(sum, (double) arr.length);
    }
}
