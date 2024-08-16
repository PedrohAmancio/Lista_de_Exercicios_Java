/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_13_pedro;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class Lista_13_pedro {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int ano;
       
       System.out.println("Digite um ano");
        ano=ler.nextInt();
        if((ano%4==0)&&(ano%100!=0)){
                   System.out.println("O ano é bissexto");

        }
        else{
                   System.out.println("O ano nao e bissexto");

        }
    }
}
