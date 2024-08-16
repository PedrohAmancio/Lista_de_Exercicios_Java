/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_18_pedro;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class Lista_18_pedro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int transporte;
               System.out.println("Essa é a tabela de preco do pedagio");
       System.out.println("|---------------------|");
       System.out.println("|------Carro=920------|");
       System.out.println("|------moto=4,60------|");
       System.out.println("|------Caminhão=46---|");
       System.out.println("|---------------------|");
       
       System.out.println("------------------------");
       System.out.println("Qual seu meio de tranporte");
       System.out.println("-----------------------");
       
              System.out.println("1-carro");
              System.out.println("2-Moto");
              System.out.println("3-Caminhão");
                    transporte=ler.nextInt();
                      if(transporte==1){
                        System.out.println("O valor a ser pago é 9,20");

                      }
                      else if(transporte==2){
                        System.out.println("O valor a ser pago é 4,60");
   
                      }
                      else if(transporte==3){
                         System.out.println("O valor a ser pago é 46");
  
                      }
    }
}
