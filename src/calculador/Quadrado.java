/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculador;

/**
 *
 * @author Usuario
 */
public class Quadrado {
    double valorDoLado;
    public Quadrado(double valorDoLado){
        this.valorDoLado = valorDoLado;
    }
    double calcularArea(){
        double area;
        area = valorDoLado*valorDoLado;
        return area;
    }
}
