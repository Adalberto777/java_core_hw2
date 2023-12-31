package home_work_two;

public class CodeOfCaesar {
    public static String codeOfCaesar (String in, int key, boolean encrypt) {
        if (in == null || in.isEmpty())
            return null;

        final int len = in.length();
        char[] out = new char[len];
        for (int i = 0; i < len; ++i) {
            out[i] = (char) (in.charAt(i) + ((encrypt) ? key : -key));
            }
        return new String(out);
        }
}
