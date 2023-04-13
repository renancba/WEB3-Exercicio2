package tech.ada.web3exercicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.ada.web3exercicio2.subjects.OlhosDoCeu;

@SpringBootApplication
public class Web3Exercicio2Application {

    public static void main(String[] args) {
        OlhosDoCeu olhosDoCeu = new OlhosDoCeu();

        olhosDoCeu.notificarObservadores(1); // Round 1
        olhosDoCeu.notificarObservadores(2); // Round 2
        olhosDoCeu.notificarObservadores(3); // Round 3

        //SpringApplication.run(Web3Exercicio2Application.class, args);
    }

}
