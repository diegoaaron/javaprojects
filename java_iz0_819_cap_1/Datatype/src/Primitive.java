public class Primitive {
    long primitive() {
        boolean bo = true; // false
        byte b = 1; //int (-128 to 127)
        b = 'a'; // Java realiza una promoción automática del tipo char al tipo destino.

        short s = 1; // int (-32 768 to 32 767)
        s = 'a'; // Java realiza una promoción automática del tipo char al tipo destino.

        int i = 1;
        i = 'a'; // Java realiza una promoción automática del tipo char al tipo destino.

        long lo = 2147483648L;
        lo = 'a'; // Java realiza una promoción automática del tipo char al tipo destino.

        float flt = 3.2f;
        double d = 3.14; // double
        char c = 'a'; //
        c = 1;
        return 1L;
    }
}
