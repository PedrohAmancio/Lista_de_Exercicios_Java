/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_12_pedro;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author farne
 */
public class Lista_12_pedro {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       Random sorte = new Random();
   int voto;int ele; int vc1=0;int vc2=0;
   int vc3=0;
    
    System.out.println("Quantos eleitores serao");
        ele = ler.nextInt();
      for(int i = 1;i<=3;++i){ 
            System.out.println("Roubini"+i);
      }
        for(int i = 1; i<=ele; ++i){
            System.out.println("eleitor " + i + " faca seu voto");
                voto=ler.nextInt();
                if(voto==1){
                    vc1+=vc1+1;
                    }
               else if(voto==2){
                    vc2+=vc2+1;
                    }
               else if(voto==3){
               vc3+=vc3+1;
                    }
               else{
                   System.out.print("Voto invalido,não sera contabilizado");
                    }
        }
        if((vc1>vc2) && (vc1>vc3)){
            System.out.println("O candidato 1 ganhou");
        }
       else if((vc2>vc1) && (vc2>vc3)){
            System.out.println("O candidato 2 ganhou");
        }
       else if((vc3>vc1) && (vc3>vc2)){
            System.out.println("O candidato 3 ganhou");
        }
       else{
           System.out.print("Sera necessaria uma nova eleiçao");
       }
    }
}
