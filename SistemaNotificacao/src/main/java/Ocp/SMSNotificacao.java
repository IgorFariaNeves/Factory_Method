package Ocp;

public class SMSNotificacao implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS com mensagem: " + mensagem);
    }
}
