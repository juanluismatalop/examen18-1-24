package aulaInformatioca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //Comprobacion Helper
        //Comprobar Memoria Ram
        System.out.println("===================Comprobar RAM==================");

        double cantidadMemoria;
        cantidadMemoria = 16;
        //true
        System.out.println(cantidadMemoria + " = " + Helper.comprobarRAM(cantidadMemoria));
        cantidadMemoria = 10;
        //false
        System.out.println(cantidadMemoria + " = " + Helper.comprobarRAM(cantidadMemoria));
        //Comprobar Tipo de Disco Duro
        System.out.println("===================Comprobar Disco Duro==================");
        String tipoDiscoDuro;
        tipoDiscoDuro = "hdd";
        //true
        System.out.println(tipoDiscoDuro + " = " + Helper.comprobarTipoDiscoDuro(tipoDiscoDuro));
        tipoDiscoDuro = "hDd";
        //true
        System.out.println(tipoDiscoDuro + " = " + Helper.comprobarTipoDiscoDuro(tipoDiscoDuro));
        tipoDiscoDuro = "sdd";
        //true
        System.out.println(tipoDiscoDuro + " = " + Helper.comprobarTipoDiscoDuro(tipoDiscoDuro));
        tipoDiscoDuro = "M2";
        //true
        System.out.println(tipoDiscoDuro + " = " + Helper.comprobarTipoDiscoDuro(tipoDiscoDuro));
        tipoDiscoDuro = "Antonio";
        //false
        System.out.println(tipoDiscoDuro + " = " + Helper.comprobarTipoDiscoDuro(tipoDiscoDuro));
        List<SistemaOperativo> sistemaOperativos1 = new ArrayList<>();
        Ordenador ordenador1 = new Ordenador("ASUS", 64, true, TipoDiscoDuro.SDD, sistemaOperativos1,2024, 1, 15);
        sistemaOperativos1.add(SistemaOperativo.Windows);sistemaOperativos1.add(SistemaOperativo.Linux);
        List<SistemaOperativo> sistemaOperativos2 = new ArrayList<>();
        Ordenador ordenador2 = new Ordenador("HP", 16, false, TipoDiscoDuro.M2, sistemaOperativos2,2004, 11, 24);
        sistemaOperativos2.add(SistemaOperativo.Windows);
        List<SistemaOperativo> sistemaOperativos3 = new ArrayList<>();
        Ordenador ordenador3 = new Ordenador("MAC", 32, true, TipoDiscoDuro.HDD, sistemaOperativos3,2003, 3, 3);
        sistemaOperativos3.add(SistemaOperativo.MAC);
        List<SistemaOperativo> sistemaOperativos4 = new ArrayList<>();
        Ordenador ordenador4 = new Ordenador("HP", 8, false, TipoDiscoDuro.M2, sistemaOperativos4,2005, 11, 4);
        sistemaOperativos4.add(SistemaOperativo.Linux);
        List<SistemaOperativo> sistemaOperativos5 = new ArrayList<>();
        Ordenador ordenador5 = new Ordenador("ASUS", 64, false, TipoDiscoDuro.HDD, sistemaOperativos5,2011, 4, 7);
        sistemaOperativos5.add(SistemaOperativo.Windows);sistemaOperativos1.add(SistemaOperativo.Linux);sistemaOperativos1.add(SistemaOperativo.MAC);
        List<SistemaOperativo> sistemaOperativos6 = new ArrayList<>();
        Ordenador ordenador6 = new Ordenador("ASUS", 32, true, TipoDiscoDuro.SDD, sistemaOperativos6,2002, 4, 7);
        sistemaOperativos5.add(SistemaOperativo.Windows);
        List<Ordenador> ordenadors = new ArrayList<>();
        AulaOrdenadores aulaOrdenadores = new AulaOrdenadores(0.4,ordenadors);
        AulaOrdenadores.añadirOrdenador(ordenador1);AulaOrdenadores.añadirOrdenador(ordenador2);AulaOrdenadores.añadirOrdenador(ordenador3);
        AulaOrdenadores.añadirOrdenador(ordenador4);AulaOrdenadores.añadirOrdenador(ordenador5);AulaOrdenadores.añadirOrdenador(ordenador6);
        System.out.println(aulaOrdenadores);
        TipoDiscoDuro tipoDiscoDuro1 = null;
        System.out.println("=====Disco Duro M2 y 16G==============");
        System.out.println(aulaOrdenadores.mostrarConM2Y16G(ordenadors, tipoDiscoDuro1, cantidadMemoria));
        System.out.println("=========Mostrar Tipo de disco duro==========");
        System.out.println(aulaOrdenadores.mostrarConTipoDisco(ordenadors,TipoDiscoDuro.M2));
        System.out.println("=========Mostrar si tiene mas de un SO==========");
        System.out.println(aulaOrdenadores.mostrarConMasDe1SO(ordenadors));
        System.out.println("=========Mostrar ordenadores con tarjeta==========");
        System.out.println(aulaOrdenadores.mostrarOrdenadoresConTarjeta(ordenadors));
        System.out.println("=========Aumentar memoria==========");
        cantidadMemoria = 16;
        System.out.println(aulaOrdenadores.ampliarMemoria(cantidadMemoria));
    }
}
//Ordenador ordenador1 = new Ordenador("ASUS", 64, true, TipoDiscoDuro.HDD, sistemaOperativosOrdenador1,2024, 15, 1);