package service2;

import java.util.Arrays;

import lombok.Getter;
import lombok.Setter;

public class Carro {

    private final int TAM = 5;

    @Setter
    @Getter



    private Llanta []llantas; //referenciacion

    public Carro() {
        llantas = new Llanta[TAM]; //Instanciacion

        for (int i = 0; i < TAM; i++)
            llantas [i] = new Llanta(14);
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public int getTAM() {
        return TAM;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "TAM=" + TAM +
                ", llantas=" + Arrays.toString(llantas) +
                '}';
    }
}
