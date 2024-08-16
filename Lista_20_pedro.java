/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_20_pedro;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class Lista_20_pedro {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int ind;double compra;double des;double result;double result2;
       System.out.println("Sera um 1-desconto ou um 2-acrescimo");
        ind=ler.nextInt();
        if(ind==1){
         System.out.println("Qual valor da compra");
         compra=ler.nextInt();
         System.out.println("Qual valor do desconto(Informe no valor inteiro)");
         des=ler.nextInt();
         result=(compra*(des/100));
         result2=compra-result;
         System.out.println("esse é o valor a ser pago "+result2);
        }
        else if(ind==2){
            System.out.println("Qual valor da compra");
         compra=ler.nextInt();
          System.out.println("Qual valor do acrescimo(Informe o valor inteiro)");
         des=ler.nextInt();
         result=(compra*(des/100));
         result2=compra+result;
          System.out.println("esse é o valor a ser pago "+result2);
        }
       
    }
}
