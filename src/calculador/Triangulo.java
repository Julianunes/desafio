/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculador;


/**
 *
 * @author Usuario
 */
public class Triangulo {
    double valorDoLado;
    public Triangulo(double valorDoLado){
        this.valorDoLado = valorDoLado;
    }
    double calcularArea(){
        double area;
        area = (valorDoLado*valorDoLado*Math.sqrt(3))/4;
        return area;
   }
    

}
