/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_02_pedro;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author p.rosa
 */
public class Lista_02_Pedro {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      Random sorte = new Random();
      int num = sorte.nextInt(100)+1;
      int num2=0;
            while(num != num2){
                 System.out.println("A divinhe o numero");
                    num2=ler.nextInt();
                if(num2>num){
                    System.out.println("O numero tem que ser menor que " + num2);
                }
                else if (num2<num){
                    System.out.println("O numero tem que ser maior que " + num2); 
                }
            
            }
            System.out.println("VC acertou, parabens");
        
        
    }
}
