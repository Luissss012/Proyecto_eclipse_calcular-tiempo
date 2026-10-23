
package gt.edu.umes.proy.calculo;

public class LogicaDelNegocio {

    public long calcularSegundos(String[] parametros) {

        // Verificar que existan 5 parametros
        if (parametros.length != 5) {
            throw new IllegalArgumentException(
                "Debes ingresar 5 parametros."
            );
        }

        int[] tiempo = new int[5];

        // Convertir los parametros a enteros
        for (int i = 0; i < 5; i++) {
            try {
                tiempo[i] = Integer.parseInt(parametros[i]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(
                    "El parametro " + (i + 1) + " no es entero."
                );
            }
        }

        // Obtener los valores
        long meses = tiempo[0];
        long semanas = tiempo[1];
        long dias = tiempo[2];
        long horas = tiempo[3];
        long minutos = tiempo[4];

        // Convertir todo a segundos
        long total = meses * 30L * 24 * 60 * 60
                   + semanas * 7L * 24 * 60 * 60
                   + dias * 24L * 60 * 60
                   + horas * 60L * 60
                   + minutos * 60L;

        return total;
    }
}