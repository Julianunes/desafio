/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculador;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculador {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        DecimalFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(2);
        format.setMinimumFractionDigits(1);
        
        List<Poligono> ordem = new LinkedList<Poligono>();
        
        int op = 0;
        do{
            try{
                menu();
                op = in.nextInt();
            }catch(InputMismatchException e){
                in.nextLine();
                System.out.println("ERRO 2: Valor de entrada invalido");
                continue;
            }
            switch(op){
                case 1:
                    int numDeLados = 0;
                    double valorDoLado = 0;
                    try{
                        System.out.println("Digite o numero de lados");
                        numDeLados = in.nextInt();
                        if(numDeLados < 3){
                            System.out.println("Nao existe poligono com menos de 3 lados");
                            continue;
                        }
                    }catch(InputMismatchException e){
                        in.nextLine();
                        System.out.println("ERRO 2: Valor de entrada invalido");
                        continue;
                    }
                    try{
                        System.out.println("Digite o valor do lado em cm");
                        valorDoLado = in.nextDouble();
                        if(valorDoLado <= 0){
                            System.out.println("Nao existe valor negativo ou nulo para poligono");
                            continue;
                        }
                    }catch(InputMismatchException e){
                        in.nextLine();
                        System.out.println("ERRO 2: Valor de entrada invalido");
                        continue;
                    }
                    Poligono poligono = new Poligono(valorDoLado, numDeLados);
                    ordem.add(poligono);
                    break;
                case 2:
                    double area;
                    double soma = 0;
                    for(Poligono o : ordem){
                        if(o.numDeLados == 3){
                            area = o.calcularAreaTriangulo();
                            soma = soma + area;
                            System.out.println("Triangulo de lado "
                                    + o.valorDoLado +
                                    " e area de "
                                    + format.format(area));
                        }else if(o.numDeLados == 4){
                            area = o.calcularAreaQuadrado();
                            soma = soma + area;
                            System.out.println("Quadrado de lado "
                                    + o.valorDoLado +
                                    " e area de "
                                    + format.format(area));
                        }
                    }
                    System.out.println("Soma das areas "+format.format(soma));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("ERRO 1: Valor invalido: Nao eh 1 ou 2 ou 3");
            }
        }while(op !=3);

    }
    
    public static void menu(){
        System.out.println("Digite uma opcao-> "
            + "Digite '1' p/ inserir " //Ao digitar 1 o programa continuará inserindo valores
            + ", "
            + "Digite '2' p/ calcular area ou "
            + "Digite '3' p/ parar programa"); //Digitar 0 para calcular areas
    }
    
}
