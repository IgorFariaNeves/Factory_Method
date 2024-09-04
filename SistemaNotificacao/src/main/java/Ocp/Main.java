import Ocp.Notificador;

public class Main {
    public static void main(String[] args) {
        Notificador notificador = new Notificador("email");
        notificador.enviarNotificacao("Olá por e-mail!");

        notificador = new Notificador("sms");
        notificador.enviarNotificacao("Olá por SMS!");

        notificador = new Notificador("push");
        notificador.enviarNotificacao("Olá por notificação push!");
    }
}
