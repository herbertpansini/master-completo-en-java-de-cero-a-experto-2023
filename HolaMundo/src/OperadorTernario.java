public class OperadorTernario {
    public static void main(String[] args) {
        String variable = 7 == 5 ? "Si es verdadero" : "Si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 5.2;

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

        if (promedio >= 5.49) {
            estado = "Aprobado";
        } else {
            estado = "Rechazado";
        }
        System.out.println("estado = " + estado);
    }
}
