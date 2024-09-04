package Ocp;

public class EmailNotificacao implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail com mensagem: " + mensagem);
    }
}
