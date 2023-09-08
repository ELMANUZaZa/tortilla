/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.tortilla.iu;
import mx.itson.tortilla.negocio.Operacion;
import java.util.Scanner;

/**
 *
 * @author manub
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el enunciado: ");
        
        Scanner entrada = new Scanner(System.in);
        String enunciado = entrada.nextLine();
        
        String [] resultado = new Operacion().separar(enunciado);
        
        for(String r : resultado){
            System.out.println(r);
        }
    }
    
}
