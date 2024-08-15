/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_06_pedro;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Lista_06_pedro {

    public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            double peso;double alt;double imc;
        System.out.println("Digite sua altura");
            alt=ler.nextDouble();
        System.out.println("Digite seu peso");
            peso=ler.nextDouble();
            imc=(peso/(alt*alt));
        System.out.println("Seu IMC é " + imc);
            
            
            if(imc<18.5){
                System.out.println("Vc esta abaixo do peso");
             }
            else if((imc>=18.5) && (imc<=24.9)){
                 System.out.println("Seu peso esta normal");
            }
             else if((imc>=25) && (imc<=29.9)){
                 System.out.println("Vc esta com sobrepeso");
            }
             else if((imc>=30) && (imc<=34.9)){
                 System.out.println("Vc esta obeso");
            }

    }
}
