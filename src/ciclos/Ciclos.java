package ciclos;

import static java.lang.Math.sqrt;

public class Ciclos {

    Integer num1 = 0;
    Integer num2 = 0;
    Integer num3 = 0;
    double x1=0;
    double x2=0;
    

    public void Igual(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
        if (n1 == n2) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros son diferentes");
        }
    }

    public void Mayor(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;

        if (num1 > num2) {
            System.out.println("El numero 1 es mayor...");
        } else {
            System.out.println("El numero 1 es menor");
        }

    }

    public void Menor(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
        if (num1 < num2) {
            System.out.println("El numero 1 es menor");
        } else {
            System.out.println("el numero 1 es mayor");
        }

    }

    public void Multiplicacion(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
        System.out.println("La multiplicacion de los 2 numeros es: " + num1 * num2);
    }

    public void Resta(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
        System.out.println("La Resta de los 2 numeros es: " + (num1 - num2));
    }

    public void Division(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
        System.out.println("La Division de los 2 numeros es: " + (num1 / num2));
    }

    public void Raiz(int n1) {
        this.num1 = n1;
        System.out.println("La raiz Cuadrada es: " + (sqrt(n1)));
    }

    public void cuadratica(int n1, int n2, int n3) {
        this.num1 = n1;
        this.num2 = n2;
        this.num3 = n3;
        x1=(-num2 + sqrt(num2 * num2 - 4*num1 * num3)/2*num1);
        x2=-num2 - sqrt(num2 * num2 - 4*num1 * num3)/2*num1;
        System.out.println("Resultado de la Formula Cuadratica x1 es: "+x1);
        System.out.println("Resultado de la Formula Cuadratica x2 es: "+x2);
    


        
        }
}
