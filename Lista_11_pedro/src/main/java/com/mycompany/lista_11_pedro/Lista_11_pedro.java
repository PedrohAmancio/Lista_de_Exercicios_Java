/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_11_pedro;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Lista_11_pedro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolha; double temF; double temC;
        double result;
        
        System.out.println("Qual unidade deseja converter");
        System.out.println("1-Celsius para F");
        System.out.println("2-Fahrenheit para C");
        escolha = ler.nextInt();
         if(escolha == 1){
             System.out.println("Qual a temperatura ");
                temC = ler.nextDouble();
                result=(1.8*temC)+32;
                 System.out.println(result);
         }
         else if(escolha ==2){
              System.out.println("Qual a temperatura ");
                temF =  ler.nextDouble();
                result=(temF-32)/1.8;
                 System.out.println(result);
         }
        
        
    }
}
