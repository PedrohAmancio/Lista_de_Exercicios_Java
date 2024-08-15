/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_03_pedro;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Lista_03_pedro {

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int op; int num;int num2;
        
        System.out.println("Qual operação deseja");
         System.out.println("1-adicao");
         System.out.println("2-subtracao");
         System.out.println("3-Multiplicacao");
         System.out.println("4-divisao");
            op = ler.nextInt();
        System.out.println("Digite um numero");
                num = ler.nextInt();
        System.out.println("Digite outro numero");
                num2 = ler.nextInt();
            if(op == 1){
                System.out.println("O resultado e " + (num + num2));
                
        }
            else if(op == 2){
                System.out.println("O resultado e " + (num - num2));
                
        }
             else if(op == 3){
                System.out.println("O resultado e " + (num * num2));
                
        }
             else if(op == 4){
                System.out.println("O resultado e " + (num / num2));
                
        }
        
        
    }
}
