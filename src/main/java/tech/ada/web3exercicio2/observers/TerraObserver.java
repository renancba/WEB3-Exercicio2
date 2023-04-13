package tech.ada.web3exercicio2.observers;

import java.util.Random;
public class TerraObserver implements Observer {
    private String mensagem;
    private boolean temRevelacao;

    public TerraObserver() {
        this.mensagem = "";
        this.temRevelacao = new Random().nextBoolean();
    }

    @Override
    public void update() {
        if (temRevelacao) {
            mensagem = "Encontramos o GoKu";
        } else {
            mensagem = "Nada a revelar";
        }
        this.temRevelacao = new Random().nextBoolean();
        System.out.println("OBS-TERRA: " + mensagem);
    }
}
