
// Proyecto de Ingenieria de Software II y prueba de commit
package gt.edu.umes.proy.calculo;

public class CalculaMinutos {

    public static void main(String[] args) {

        // Crear un objeto de la clase LogicaDelNegocio
        LogicaDelNegocio logica = new LogicaDelNegocio();

        try {
            // Enviar los parametros y obtener el resultado
            long resultado = logica.calcularSegundos(args);

            // Mostrar el resultado
            System.out.println("Total en segundos: " + resultado);

        } catch (IllegalArgumentException e) {

            // Mostrar un mensaje si existe un error
            System.out.println("Error: " + e.getMessage());
        }
    }
}