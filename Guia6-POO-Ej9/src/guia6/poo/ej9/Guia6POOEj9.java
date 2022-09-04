/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package guia6.poo.ej9;

import Entidad.Matematica;
import Servicio.ServicioMatematica;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia6POOEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioMatematica mat = new ServicioMatematica();
        Matematica m = mat.NewMatematica();
        mat.devolverMayor(m);
        mat.calcularPotencia(m);
        mat.calculaRaiz(m);
    }
    
}
