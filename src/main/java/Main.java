/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edensilvestre
 */
// Clase Persona
class Persona {
    int edad;
    String nombre;
    String telefono;
}
 // Clase Cliente que hereda de Persona
class Cliente extends Persona {
    int credito;
}
 // Clase Trabajador que hereda de Persona
class Trabajador extends Persona {
    int salario;
}
 public class Main {
    public static void main(String[] args) {
        // Crear objeto Cliente
        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.nombre = "Juan";
        cliente.telefono = "123456789";
        cliente.credito = 1000;
         // Mostrar propiedades del Cliente
        System.out.println("Cliente:");
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Teléfono: " + cliente.telefono);
        System.out.println("Crédito: " + cliente.credito + " Euros");
         // Crear objeto Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 30;
        trabajador.nombre = "Pedro";
        trabajador.telefono = "987654321";
        trabajador.salario = 2000;
         // Mostrar propiedades del Trabajador
        System.out.println("\nTrabajador:");
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Teléfono: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario + " Euros");
    }
}