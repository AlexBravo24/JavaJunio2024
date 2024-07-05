package com;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String tipo = "";
        Cientifica calculadora = new Cientifica("Patito", "Azul", 2024);
        Scanner seleccion = new Scanner(System.in);
        boolean continuar = true;
        /*
        System.out.println("****************************************************");
        System.out.println("**** Bienvenido a tu " + calculadora + " *****");
        System.out.println("****************************************************");
        
        do {
            System.out.println("Selecciona qu� tipo de acci�n quieres realizar (+, -, /, *):");
            tipo = seleccion.nextLine();
            
            if (tipo.equals("+") || tipo.equals("-") || tipo.equals("*") || tipo.equals("/")) {
                System.out.print("Ingrese el primer n�mero: ");
                double num1 = seleccion.nextDouble();
                System.out.print("Ingrese el segundo n�mero: ");
                double num2 = seleccion.nextDouble();
                seleccion.nextLine();  // Limpiar el buffer

                switch (tipo) {
                    case "+":
                        System.out.println("Resultado de la suma: " + calculadora.sumar(num1, num2));
                        break;
                    case "-":
                        System.out.println("Resultado de la resta: " + calculadora.restar(num1, num2));
                        break;
                    case "*":
                        System.out.println("Resultado de la multiplicaci�n: " + calculadora.multiplicar(num1, num2));
                        break;
                    case "/":
                        if (num2 != 0) {
                            System.out.println("Resultado de la divisi�n: " + calculadora.dividir(num1, num2));
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                        }
                        break;
                }
            } else {
                System.out.println("Operaci�n no v�lida. Por favor, selecciona +, -, * o /.");
            }
            
            System.out.println("�Desea realizar otra operaci�n? (si/no):");
            String respuesta = seleccion.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
            
        } while (continuar);
        
        seleccion.close();
        System.out.println("Gracias por usar la "+calculadora);*/
        
        calculadora.tomarTemperatura();
        /*
        //�De d�nde toman comportamientos nuestros objetos/clases?
         * 1. De m�todos propios de la clase
         * 2. De la herencia de otras clases, incuyendo clases abstractas
         * 3. De interfaces.
        */
    }
}
