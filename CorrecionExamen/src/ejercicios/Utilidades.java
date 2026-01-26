package ejercicios;

public class Utilidades {

    // 1.1 validar
    public static boolean validar(String s) {
        return s != null && s.matches("[A-Za-z]{8,}");
    }

    // 1.2 concatenar
    public static String concatenar(String s1, String s2) {
        String resultado = "";
        int min = Math.min(s1.length(), s2.length());

        for (int i = 0; i < min; i++) {
            resultado += s1.charAt(i);
            resultado += s2.charAt(i);
        }

        if (s1.length() > min) {
            resultado += s1.substring(min);
        } else if (s2.length() > min) {
            resultado += s2.substring(min);
        }

        return resultado;
    }
    // 1.3 esPalindromo
    public static boolean esPalindromo(String s) {
        String invertida = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            invertida += s.charAt(i);
        }
        return s.equals(invertida);
    }
}
