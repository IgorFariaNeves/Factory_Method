package Ocp;

public class PushNotificacao implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação push com mensagem: " + mensagem);
    }
}
