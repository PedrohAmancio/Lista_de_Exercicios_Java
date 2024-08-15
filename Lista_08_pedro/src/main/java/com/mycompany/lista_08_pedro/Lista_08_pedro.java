/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_08_pedro;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Lista_08_pedro {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       boolean pass = false;
       while(!pass){
       System.out.println("Digite sua senha(Deve ter 8 caracteres)");
       String senha = ler.next();
       if(senha.length()>8){
           System.out.println("A senh deve conter 8 caracteres");
       }
       else{
           System.out.println("Senha definida");
           pass = true;
       }
    }
}
}
