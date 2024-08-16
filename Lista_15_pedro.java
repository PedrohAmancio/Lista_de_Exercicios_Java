/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_15_pedro;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class Lista_15_pedro {

    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     int num;int fat;
     
     System.out.println("Digite um numero");
      num=ler.nextInt();
     for(fat = 1; num > 1; num = num - 1)
  {      
      fat = fat * num;
  }
     System.out.println(fat);


    }
}
