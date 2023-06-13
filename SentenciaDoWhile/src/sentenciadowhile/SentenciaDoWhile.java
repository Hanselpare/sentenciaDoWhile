/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sentenciadowhile;

import java.util.Scanner;

/**
 *
 * @author hanpa
 */
public class SentenciaDoWhile {
    //primer ejemplo
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    int edad;

    do {
      System.out.print("Ingrese su edad: ");
      edad = input.nextInt();
    } while (edad <= 0);

    System.out.println("Su edad es " + edad);
  }
    
}



    
    

