/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_01_pedro;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Lista_01_Pedro{

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int nota=0;
       int media=0;
      
       for(int i=0;i<3;++i){
      System.out.println("As notas do aluno");
      nota += ler.nextInt();
       }
       media=(nota/3);
       
       System.out.println("A media do aluno é"+media);
         if(media>=7){
           System.out.println("Aprovado");
       }
        else if((media<=5) && (media<7)){
           System.out.println("O aluno est de recuperação");
       }
        else if(media<5){
           System.out.println("O aluno esta reprovado");
       }
      
    }
}
