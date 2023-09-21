public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");

        /*
        * E "false" porque esta comparando os objetos
        * sao 2 instancias diferentes
        * nao esta comparando seu conteudo
        */
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual); // false

        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual); // true

        /*
         * E "true" porque o java reconhece que ja existe uma instancia
         * do mesmo objeto com mesmo valor
         * importante: somente se for criado de maneira literal
         */
        String curso3 = "Programacion Java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual); // true

        String curso4 = new String("Programacion Java");
        esIgual = curso2 == curso4;
        System.out.println("esIgual = " + esIgual); // false
    }
}