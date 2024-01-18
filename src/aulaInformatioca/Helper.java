package aulaInformatioca;

public class Helper {
    public static boolean comprobarRAM(double cantidadMemoria) {
        if (cantidadMemoria % 8 == 0){
            return true;
        }else return false;
    }
    public static  boolean comprobarTipoDiscoDuro(String tipoDiscoDuro){
        if (tipoDiscoDuro.toUpperCase().matches("HDD||SDD||M2"))
            return true;
        else return false;
    }
}
