/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_07_pedro;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Lista_07_pedro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);int num; int par=0;int imp=0;
        System.out.println("Digite um numero");
            num=ler.nextInt();
                for(int i=1;i<=num;++i){
                    if(i%2==0){
                         System.out.println("O numero "+ i +" e par");
                         par+=1;
                }
                    else{
                         System.out.println("O numero é impar");
                         imp+=1;
                    }
        
    }
                 System.out.println("A quanidade de numeros pares e " + par);
                       System.out.println("A quanidade de numeros impares e " + imp);
}
}
