package org.teme_lab7.ex1;

/*
* 1. Definiţi o clasă care să implementeze operaţii pe numere double. Operaţiile vor arunca excepţii.

a. Clasa va trebui să implementeze interfața Calculator, ce conţine trei metode:
- add: primeşte două numere şi întoarce un double;
- divide: primeşte două numere şi întoarce un double;
- average: primeşte un vector ce conţine valori double şi întoarce media acestora ca numar de tip double. Pentru calculul mediei sunt folosite metodele add şi divide.
Toate aceste valori se citesc dintr-un fisier.

Metodele pot arunca următoarele excepții (definite în interfața Calculator):
- NullParameterException: este aruncată dacă vreunul din parametrii primiți este null;
- OverflowException: este aruncată dacă suma a două numere este egală cu Double.POSITIVE_INFINITY;
- UnderflowException: este aruncată dacă suma a două numere este egală cu Double.NEGATIVE_INFINITY;

De asemenea, definiti propriile clase de exceptii (care sa le extinda pe unele existente in Java) pentru alte situatii ce pot fi intalnite in implementarea proprie,
inclusiv in crearea si citirea din fisier a valorilor procesate de calculator.
De exemplu, creati clasa MyArithmeticException si folositi-o in metoda divide() pentru a acoperi situatia impartirii la 0.

b. Creati o clasa client cu metoda main in care sa evidentiati prin teste toate cazurile posibile care generează excepţii.
*/

class NullParameterException extends RuntimeException {
    public NullParameterException(String message) {
        super(message);
    }
}

class OverflowException extends RuntimeException {
    public OverflowException(String message) {
        super(message);
    }
}

class UnderflowException extends RuntimeException {
    public UnderflowException(String message) {
        super(message);
    }
}

class MyArithmeticException extends ArithmeticException {
    public MyArithmeticException(String message) {
        super(message);
    }
}

public interface Calculator {
    Double add(Double x, Double y) throws NullParameterException, OverflowException, UnderflowException;
    Double divide(Double x, Double y) throws MyArithmeticException ;
    Double average(Double[] arr) throws NullParameterException;
}
