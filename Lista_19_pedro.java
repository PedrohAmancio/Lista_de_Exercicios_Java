/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_19_pedro;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class Lista_19_pedro {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int bas;int ex;int result=1;
       
       System.out.println("Qual a base ");
        bas=ler.nextInt();
       System.out.println("qual o expoente");
        ex=ler.nextInt();
           for(int i =0; i <ex;++i){
             result*=bas;
           }
          System.out.println(result);


       
    }
}
