package entity;

import java.io.Serial;
import java.io.Serializable;

public class Lampadina implements Serializable {
    @Serial
    private static final long serialVersionUID = 21471294827194L;

    private String nome, colore = "bianco";
    private final float potenza;
    private int QI = 60;
    private boolean isOn = false;

    public Lampadina(String nome, float potenza) {
        this.nome = nome;
        this.potenza = potenza;
    }

    public String getNome() {
        return nome;
    }

    public String getColore() {
        return colore;
    }

    public float getPotenza() {
        return potenza;
    }

    public int getQI() {
        return QI;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setColore(String colore) {
        if ("bianco".equals(colore) || "giallo".equals(colore)  || "blu".equals(colore)) {
            this.colore = colore;
        }
    }

    public void setQI(int QI) {
        if(QI < 0){
            this.QI = 0;
        } else {
            this.QI = Math.min(QI, 100);
        }
    }

    public void setOn() {
        this.isOn = true;
    }

    public void setOff(){
        this.isOn = false;
    }

    @Override
    public String toString (){
        return (this.nome +
                "\nPotenza: " + this.potenza +
                "\nColore: " + this.colore +
                "\nQI: " + this.QI +
                "\nStato: " + (isOn? "accesa" : "spenta"));
    }


}
