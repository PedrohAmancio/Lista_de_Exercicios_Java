/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_04_pedro;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Lista_04_pedro {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int senha = 2; String nome; int tenta=0;
       int rs;int pass =0; String rn="p";

                while((tenta<3)&&(pass !=1)){
                     System.out.println("Digite o seu nome de usuario");
            nome=ler.next();
                    System.out.println("Digite a senha");
                    rs=ler.nextInt();
                        if(nome.equals(rn)&&(rs==senha) ){
                             System.out.println("Aprovado" );
                             pass=1;
                        }
                        else {
                             System.out.println("Reprovado");
                           
                        }
                        ++tenta;
                }
       
    }
}
