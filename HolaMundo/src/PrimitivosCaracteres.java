public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        System.out.println("caracter = " + caracter);
        
        char decimal = 64;
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));
        
        char espacio = '\u0020';
        System.out.println("espacio = " + espacio);
        
        char retroceso = '\b';
        System.out.println("retroceso = " + retroceso);
        
        char tabulador = '\t';
        System.out.println("tabulador = " + tabulador);
        
        char nuevaLinea = '\n';
        System.out.println("nuevaLinea = " + nuevaLinea);
        
        char retornoCarro = '\r';
        System.out.println("retornoCarro = " + retornoCarro);

        System.out.println(System.getProperty("line.separator"));
        System.out.println(System.lineSeparator()); // UNIX System "\n"; on Windows System "\n\r"

        System.out.println("char corresponde en byte " + Character.BYTES);
        System.out.println("char corresponde en bites  " + Character.SIZE);
        System.out.println("valor minimo en char " + Character.MIN_VALUE);
        System.out.println("valor maximo en char " + Character.MAX_VALUE);
    }
}