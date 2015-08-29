/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoprog;

import java.util.Scanner;

public class CoordGeo {
    Scanner s = new Scanner(System.in);
    
    private double latitude;
    private double longitude;

    public void setLat() {
        this.latitude = latitude;
    }

    public double getLat() {
        return latitude;
    }

    public void setLong() {
        this.longitude = longitude;
    }

    public double getLong() {
        return longitude;
    }

    public void preencheCoord() {
        System.out.println("Digite a latitude:");
        latitude = s.nextInt();
        System.out.println("Digita a longitude:");
        longitude = s.nextInt();
    }

    /* Esse é o método "toString" porém com uma pequena alteração
     porque estava dando erro.
     */
    public void paraString() {
        System.out.println("Latitude:"+getLat()+" Longitude:"+getLong());
    }

}
