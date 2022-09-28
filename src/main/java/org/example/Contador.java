package org.example;


public class Contador {
    private int valor;

    public Contador(int valor) {
        this.valor = valor;
    }

    public synchronized void incrementar() {
        valor++;
    }

    public synchronized void decrementar() {
        valor--;
    }

    public int getValor() {
        return valor;
    }

}

