package ciclos;

import java.util.Scanner;

public class main {

    public static void menu(String[] args) {
        
    }

    public static void main(String[] args) {

            Ciclos condicional = new Ciclos();
        int op;
        Scanner var = new Scanner(System.in);
        System.out.println("     ***MENU PRINCIPAL***");
        System.out.println("Igual.......................1");
        System.out.println("Mayor.......................2");
        System.out.println("Menor.......................3");
        System.out.println("Resta.......................4");
        System.out.println("Multiplicacion..............5");
        System.out.println("Division....................6");
        System.out.println("Raiz cuadrada...............7");
        System.out.println("Ecuacion Cuadratica.........8");
        System.out.println("Maximo numero...............9");
        System.out.println("Operador And................10");
        System.out.println("Operador Or.................11");
        System.out.println("Ingrese su opcion: ");
        op = var.nextInt();
        switch (op) {
            case 1:
                condicional.Igual(4, 6);
                break;
            case 2:
                condicional.Mayor(5, 6);
                break;
            case 3:
                condicional.Menor(9, 5);
                break;
            case 4:
                condicional.Resta(8, 2);
                break;
            case 5:
                condicional.Multiplicacion(2, 8);
                break;
            case 6:
                condicional.Division(10, 2);
                break;
            case 7:
                condicional.Raiz(9);
                break;
            case 8:
                condicional.cuadratica(5, 8, 3);
                break;
            case 9:
                condicional.maxima(8, 9, 3);
                break;
            case 10:
                condicional.and(10, 5);
                break;
            case 11:
                condicional.or(4);
                break;
           default:
               System.out.println("Opcion Incorrecta....");
              
                break;

        }

    }


}
