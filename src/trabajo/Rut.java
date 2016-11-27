package trabajo;

public class Rut {

    static public String formatear(String rut) {
        int cont = 0;
        String format;
        if (rut.length() == 0) {
            return "";
        } else {
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            format = "-" + rut.substring(rut.length() - 1);
            for (int i = rut.length() - 2; i >= 0; i--) {
                format = rut.substring(i, i + 1) + format;
                cont++;
                if (cont == 3 && i != 0) {
                    format = "." + format;
                    cont = 0;
                }
            }
            return format;
        }
    }

    static public boolean validar(String rut) {
        //Error de rut 19314092-0 ningun rut con dv terminado en 0 me pasaba
        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    
    /*int suma = 0;
        String dvR, dvT;
        int[] serie = {2, 3, 4, 5, 6, 7};
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        dvR = rut.substring(rut.length() - 1);
        for (int i = rut.length() - 2; i >= 0; i--) {
            suma += Integer.valueOf(rut.substring(i, i + 1))
                    * serie[(rut.length() - 2 - i) % 6];
        }
        dvT = String.valueOf(11 - suma % 11);
        if (dvT.compareToIgnoreCase("10") == 0) {
            dvT = "K";
        }
        if (dvT.compareToIgnoreCase("0") == 0) {
            dvT = "0";
        }

        if (dvT.compareToIgnoreCase(dvR) == 0) {
            return true;
        } else {
            return false;
        }*/
    }

static public String desformatear(String rut) {
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        return rut;
    }
}
