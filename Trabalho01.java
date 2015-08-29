/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoprog;

import java.util.Scanner;

public class Trabalho01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cidade cidades = new Cidade();
        
        int quantCidades;
        
        System.out.println("Digite quantas cidades você deseja criar: ");
        quantCidades = s.nextInt();
        
        Object cidas [] = new Object[quantCidades];
        
        for(int i = 0; i < quantCidades; i++){
            cidades.Cidade();
            
            cidas[i] = cidades.paraString();
        }
        
        for(int j = 0; j < quantCidades; j++){
            System.out.println(cidas[j]+"\n");
        }
        
    }
}
