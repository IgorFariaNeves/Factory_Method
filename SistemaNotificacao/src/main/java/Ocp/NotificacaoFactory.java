package Ocp;

public class NotificacaoFactory {
    public static Notificacao criarNotificacao(String tipo) {
        if (tipo.equalsIgnoreCase("email")) {
            return new EmailNotificacao();
        } else if (tipo.equalsIgnoreCase("sms")) {
            return new SMSNotificacao();
        } else if (tipo.equalsIgnoreCase("push")) {
            return new PushNotificacao();
        } else {
            throw new IllegalArgumentException("Tipo de notificação desconhecido");
        }
    }
}
