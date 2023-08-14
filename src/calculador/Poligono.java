/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculador;

/**
 *
 * @author Usuario
 */
public class Poligono {
    double valorDoLado;
    int numDeLados;
    public Poligono(double valorDoLado, int numDeLados){
        this.valorDoLado = valorDoLado;
        this.numDeLados = numDeLados;
    }
    double calcularAreaTriangulo(){
        double area;
        area = (valorDoLado*valorDoLado*Math.sqrt(3))/4;
        return area;
   }
    
    double calcularAreaQuadrado(){
        double area;
        area = valorDoLado*valorDoLado;
        return area;
    }
}
