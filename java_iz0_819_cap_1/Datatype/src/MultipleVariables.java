public class MultipleVariables {
    public void sandFence(){
        String s1,s2;
        String s3 = "yes", s4 = "no";
    }

    public void paintFence(){
        int i1, i2, i3 = 0;
        // int num, String value; error
    }

    public void legalDeclaration(){
        boolean b1, b2;
        String s1 = "1", s2;
        // double d1, double d2; error
        double d1; double d2;
        int i1; int i2;
        int i3;
        // i4;
    }

    public Long wrapper(){
        Boolean bo = false; // autoboxing
        boolean boo = Boolean.valueOf(true); // unboxing

        Byte b = 1;
        Short s = 1;
        Integer i = 1;
        Long lo = 1L;
        Float f = 3.14f;
        Double d = 3.14;
        return 1L;
    }
}
