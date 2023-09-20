public class PrimitivosFloat {
    public static void main(String[] args) {
        float realPositivoFloat = 2.12e3f; // 2120f;
        System.out.println("realPositivoFloat = " + realPositivoFloat);

        float realNegativoFloat = 0.00000000015f; // 1.5e-10f;
        System.out.println("realNegativoFloat = " + realNegativoFloat);

        System.out.println("float corresponde en byte a " + Float.BYTES);
        System.out.println("float corresponde en bites a " + Float.SIZE);
        System.out.println("valor minimo de un float: " + Float.MIN_VALUE);
        System.out.println("valor maximo de un float: " + Float.MAX_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("\nrealDouble = " + realDouble);

        System.out.println("double corresponde en byte a " + Double.BYTES);
        System.out.println("double corresponde en bites a " + Double.SIZE);
        System.out.println("valor minimo de un double: " + Double.MIN_VALUE);
        System.out.println("valor maximo de un double: " + Double.MAX_VALUE);
        
        var varFloatante = 3.1416f;
        System.out.println("varFloatante = " + varFloatante);
    }
}