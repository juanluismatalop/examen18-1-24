package aulaInformatioca;

import java.util.List;

//Crea una clase, denominada Ordenador, que tiene los siguientes atributos y métodos:
//– Marca.
//– Cantidad de memoria RAM, se mide en gigas.
//– Si tiene integrada o no la controladora de video.
//– Tipo de disco duro.
//– Sistemas operativos instalados, puede tener mas que uno, por lo que el tipo de dato es una colección y queda a elección del alumno el tipo de dato y el tipo de colección a emplear.
//– Fecha de compra
//Constructor o constructores.
//Getters
public record Ordenador(String marca, double cantidadMemoria, boolean integradaControladorVideo, TipoDiscoDuro tipoDiscoDuro, List<SistemaOperativo> sistemaOperativos, int anno, int mes, int dia){

    //Un método para ampliar memoria RAM
    public double ampliarRAM(double cantidadMemoria){
        double ampliacionMemoria = 0;
        cantidadMemoria += ampliacionMemoria;
        return cantidadMemoria;
    }
    //Un método para cambiar tipo de disco
    public TipoDiscoDuro cambiarTipoDisco(TipoDiscoDuro tipoDiscoDuro){
        return null;
    }
    //Un método para añadir un sistema operativo más
    public List<SistemaOperativo> añadirSistemaOperativo(List<SistemaOperativo> sistemaOperativos, SistemaOperativo sistemaOperativo){
        sistemaOperativos.add(sistemaOperativo);
        return sistemaOperativos;
    }
    // Sobreescritura del método toString, para que la información quede con el formato que marca el siguiente ejemplo:
    //ASUS-64G RAM-HDD-GNU/Linux,Windows-Integrada Vídeo: TRUE-15/1/2024
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(marca + "-").append(cantidadMemoria + "G RAM-").append(tipoDiscoDuro + "-").append("GNU/" + sistemaOperativos + "-").append("Integrada Vídeo: " + integradaControladorVideo + "-").append(dia+"/"+mes+"/"+anno);
        return String.valueOf(builder);
    }
}
