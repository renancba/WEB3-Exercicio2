package tech.ada.web3exercicio2.subjects;

import tech.ada.web3exercicio2.observers.*;

import java.util.ArrayList;
import java.util.List;

public class OlhosDoCeu {
    private List<Observer> observadores;

    public OlhosDoCeu() {
        observadores = new ArrayList<>();
        observadores.add(new CeuObserver());
        observadores.add(new AguaObserver());
        observadores.add(new TerraObserver());
    }

        public void notificarObservadores(int round) {
            System.out.println("Round " + round);
            for (Observer o : observadores) {
                o.update();
            }
    }
}

