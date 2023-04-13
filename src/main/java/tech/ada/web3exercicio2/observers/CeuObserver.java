package tech.ada.web3exercicio2.observers;

import java.util.Random;

public class CeuObserver implements Observer{
    private String mensagem;
    private boolean temRevelacao;

    public CeuObserver() {
        this.mensagem = "";
        this.temRevelacao = new Random().nextBoolean();
    }

    @Override
    public void update() {
        if (temRevelacao) {
            mensagem = "Um grande cometa acabou de passar.";
        } else {
            mensagem = "Nada a revelar";
        }
        this.temRevelacao = new Random().nextBoolean();
        System.out.println("OBS-CEU: " + mensagem);
    }
}

