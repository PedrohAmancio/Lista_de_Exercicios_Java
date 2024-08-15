/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_05_pedro;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Lista_05_pedro {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int num;
       System.out.println("Digte um numero");
        num = ler.nextInt();
        for(int i = 0; i < 11;++i){
            System.out.println(num*i);
        }
    }
}
