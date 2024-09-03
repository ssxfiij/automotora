/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.utonomora;



/**
 *
 * @author Cetecom
 */
import java.time.LocalDate;
import java.util.Scanner;

public class Utonomora {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Persona vPersona = new Persona();
        Vendedor vendedor = new Vendedor();
        int opcion = 0;
        
        while(opcion != 5){
            System.out.println("=======Menu=======");
            System.out.println("[1] - Agregar Vendedor");
            System.out.println("[2] - Agregar Cliente");
            System.out.println("[3] - Agregar Vehiculo");
            System.out.println("[4] - Agregar Venta");
            System.out.println("[5] - salir");
            
            opcion = entrada.nextInt();
            
          
            switch(opcion){
                case 1:
                    System.out.println("ingrese el nombre del vendedor:");
                    vPersona.setNombre(entrada.next());
                    
                    System.out.println("ingrese el apellido del vendedor");
                    vPersona.setApellido(entrada.next());
                    
                    System.out.println("ingrese el rut del vendedor");
                    vPersona.setRut(entrada.next());
                    
                    System.out.println("ingrese el numero de telefono del vendedor");
                    vPersona.setTelefono(entrada.nextInt());
                    
                    int anio, mes, dia;
                    
                    System.out.println("ingrese el año de nacimiento del vendedor");
                    anio = entrada.nextInt();
                    
                    System.out.println("ingrese el mes de nacimiento del vendedor");
                    mes = entrada.nextInt();
                            
                    System.out.println("ingrese el dia de nacimiento del vendedor");
                    dia = entrada.nextInt();
                    
                    vPersona.setFecha_nacimiento(LocalDate.of(anio, mes, dia));
                    
                    vendedor.setId_vendedor(1);
                    vendedor.setPersona(vPersona);
                    
                    System.out.println("vendedor");
                            
                    break;
                case 2:
                    System.out.println("opcion 2");
                    break;
                case 3:
                    System.out.println("opcion 3");
                    break;
                case 4:
                    System.out.println("opcion 4");
                    break;
                case 5:
                    System.out.println("saliendo!!");
                    break;
                default:
                    System.out.println("opcion no valida.");
                    break;
            }
        }
    }
}
