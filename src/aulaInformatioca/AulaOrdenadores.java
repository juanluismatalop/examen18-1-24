package aulaInformatioca;

import java.util.ArrayList;
import java.util.List;

//Clase AulaOrdenadores, que consta de los siguientes atributos y métodos:
public class AulaOrdenadores {
    //Nombre del aula, ejemplos 0.4, 1.8, 2.7, . . .
    private double nombreAula;
    //Una colección de objetos Ordenador
    private static List<Ordenador> ordenadors;
    //Un constructor que inicialice el nombre del aula, mientrás que la colección de objetos Ordenador se inicializa a vacía.
    public AulaOrdenadores(double nombreAula, List<Ordenador> ordenadors) {
        this.nombreAula = nombreAula;
        this.ordenadors = ordenadors;
    }
    //Los siguientes métodos:
    //Un método para añadir un ordenador
    public static List<Ordenador> añadirOrdenador(Ordenador ordenador) {
        ordenadors.add(ordenador);
        return ordenadors;
    }
    //Un método que amplie la memoria de un ordenador, para ello al método le pasamos la posición del ordenador en la colección para localizar el equipo a ampliar memoria y el
    //nuevo módulo de memoria, de manera que si ten´ıa 16G de RAM y añadimos un módulo mas de 16G, la memoria total tiene que ser 32G en total.
    public  double ampliarMemoria(double cantidadMemoria){
        cantidadMemoria += cantidadMemoria;
        return cantidadMemoria;
    }
    //Un método que nos devuelva el ordenador adquirido mas recientemente.
    /*public Ordenador mostrarMasReciente(List<Ordenador> ordenadors, int dia, int mes, int anno){
        for (Ordenador ordenador: ordenadors){
            LocalDate.of(anno, mes, dia) - LocalDate.now();
        }
        return
    }*/
    //Un método que nos devuelva todos los ordenadores que tienen integrada la tarjeta de vídeo.
    public  List<Ordenador> mostrarOrdenadoresConTarjeta(List<Ordenador> ordenadors){
        List<Ordenador> tieneControladors = new ArrayList<>();
        for (Ordenador ordenador : ordenadors){
            if(ordenador.integradaControladorVideo()==true)
                tieneControladors.add(ordenador);
        }
        return tieneControladors;
    }
    //Un método que nos devuelva los ordenadores con mas de un sistema operativo
    public List<Ordenador> mostrarConMasDe1SO(List<Ordenador> ordenadors){
        List<Ordenador> tiene2oMas = new ArrayList<>();
        for (Ordenador ordenador : ordenadors){
            if(ordenador.sistemaOperativos().size() > 1)
                tiene2oMas.add(ordenador);
        }
        return tiene2oMas;
    }
    //Un método que dado el tipo de disco nos devuelva una colección de equipos con ese tipo de disco.
    public List<Ordenador> mostrarConTipoDisco(List<Ordenador> ordenadors, TipoDiscoDuro tipoDiscoDuro){
        List<Ordenador> conDiscoDuro = new ArrayList<>();
        for (Ordenador ordenador : ordenadors){
            if (ordenador.tipoDiscoDuro().equals(tipoDiscoDuro)){
                conDiscoDuro.add(ordenador);
            }
        }
        return conDiscoDuro;
    }
    //Un método que nos devuelva todos los equipos con disco M2 y con mas de 16G de RAM
    public List<Ordenador> mostrarConM2Y16G (List<Ordenador> ordenadors, TipoDiscoDuro tipoDiscoDuro, double cantidadMemoria){
        List<Ordenador> conM2Y16 = new ArrayList<>();
        for (Ordenador ordenador : ordenadors){
            if (ordenador.tipoDiscoDuro().equals(TipoDiscoDuro.M2))
                if (ordenador.cantidadMemoria()==16.0)
                    conM2Y16.add(ordenador);
        }
        return conM2Y16;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(nombreAula + "\n").append("=======================\n");
        int contador = 1;
        for(Ordenador ordenador : ordenadors){
            builder.append(contador++).append(".- ").append(ordenador).append('\n');
        }
        return String.valueOf(builder);
    }
}
