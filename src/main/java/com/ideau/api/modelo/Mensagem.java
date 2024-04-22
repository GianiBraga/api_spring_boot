package com.ideau.api.modelo;

// Importação relacionada ao Spring Framework
import org.springframework.stereotype.Component;

// Componente Spring que representa uma mensagem
@Component
public class Mensagem {

    // Atributo privado para armazenar a mensagem
    private String mensagem;

    // Método para obter a mensagem
    public String getMensagem() {
        return mensagem;
    }

    // Método para definir a mensagem
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
