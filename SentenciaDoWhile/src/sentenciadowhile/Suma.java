/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentenciadowhile;

import java.util.Scanner;

/**
 *
 * @author hanpa
 */
public class Suma {
    public void s(){
        Scanner input = new Scanner(System.in);
    int num, suma = 0;
    String respuesta;

    do {
      System.out.print("Ingrese un número: ");
      num = input.nextInt();
      suma += num;
      System.out.print("¿Desea ingresar otro número? (s/n) ");
      respuesta = input.next();
    } while (respuesta.equals("s"));

    System.out.println("La suma de los números ingresados es " + suma);
  }
}
    
