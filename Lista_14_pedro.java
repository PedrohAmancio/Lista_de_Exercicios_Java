/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_14_pedro;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author farne
 */
public class Lista_14_pedro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random sorte = new Random();int numero1;
        int sist=sorte.nextInt(100);
        System.out.println("seja bem-vindo ao par ou impar");

        System.out.println("Digite um numero");
            numero1=ler.nextInt();
        System .out.println("O numero do sistema e " + sist);
        System.out.println("O numero sera somado e vc tera o resultado ");

        if((numero1+sist)%2==0){
            System.out.println("O numero é par");
        }
        else{
                        System.out.println("O numero é impar");

        }
    }
}
