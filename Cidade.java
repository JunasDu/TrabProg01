/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file,
 choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoprog;

import java.util.Scanner;

public class Cidade {

    Scanner s = new Scanner(System.in);
    CoordGeo coordenadas = new CoordGeo();

    private String nome;
    private double dist;

    public void setNome() {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDist() {
        this.dist = dist;
    }

    public double getDist() {
        return dist;
    }

    public void Cidade() {
        System.out.println("Digite o nome da cidade:");
        nome = s.next();
        coordenadas.preencheCoord();
       
    }

    public void calcDist(double longitude) {
        dist = (coordenadas.getLat() * coordenadas.getLat()) + (longitude * longitude);
    }
    
    /* De novo a tradução, se não da um err louco */
    public String paraString(){
        return ("Nome:"+this.nome+" \nLatitude:"+coordenadas.getLat()+" \nLongitude:"+coordenadas.getLong()+"");
    }
}
