package net.futureclient.client;

public class OI
{
    private boolean a;
    private OI.Zi D;
    private String k;
    
    public OI() {
        super();
    }
    
    public void M(final boolean a) {
        this.a = a;
    }
    
    public void M(final OI.Zi d) {
        this.D = d;
    }
    
    public String M() {
        return this.k;
    }
    
    public static String M(String s) {
        final StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        final String string = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        final int n = string.length() - 1;
        final int n2 = 41;
        final int n3 = 32;
        final int length = (s = s).length();
        final char[] array = new char[length];
        int n4;
        int i = n4 = length - 1;
        final char[] array2 = array;
        final int n5 = n3;
        final int n6 = n2;
        int n7 = n;
        final int n8 = n;
        final String s2 = string;
        while (i >= 0) {
            final char[] array3 = array2;
            final int n9 = n6;
            final String s3 = s;
            final int n10 = n4--;
            array3[n10] = (char)(n9 ^ (s3.charAt(n10) ^ s2.charAt(n7)));
            if (n4 < 0) {
                break;
            }
            final char[] array4 = array2;
            final int n11 = n5;
            final String s4 = s;
            final int n12 = n4;
            final char c = (char)(n11 ^ (s4.charAt(n12) ^ s2.charAt(n7)));
            --n4;
            --n7;
            array4[n12] = c;
            if (n7 < 0) {
                n7 = n8;
            }
            i = n4;
        }
        return new String(array2);
    }
    
    public OI.Zi M() {
        return this.D;
    }
    
    public boolean M() {
        return this.a;
    }
    
    public void M(final String k) {
        this.k = k;
    }
}
