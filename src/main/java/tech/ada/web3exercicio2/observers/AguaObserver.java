package tech.ada.web3exercicio2.observers;

import java.util.Random;

public class AguaObserver implements Observer{

       private String mensagem;
        private boolean temRevelacao;

        public AguaObserver() {
            this.mensagem = "";
            this.temRevelacao = new Random().nextBoolean();
        }

        @Override
        public void update() {
            if (temRevelacao) {
                mensagem = "Um animal abissal foi avistado";
            } else {
                mensagem = "Nada a revelar";
            }
            this.temRevelacao = new Random().nextBoolean();
            System.out.println("OBS-AGUA: " + mensagem);
        }
    }
