package Ocp;

import org.junit.Test;
import static org.junit.Assert.*;

public class NotificadorTest {

    @Test
    public void testEmailNotificacao() {
        Notificador notificador = new Notificador("email");
        String resultado = getOutput(notificador, "Olá por e-mail!");
        assertEquals("Enviando e-mail com mensagem: Olá por e-mail!", resultado);
    }

    @Test
    public void testSMSNotificacao() {
        Notificador notificador = new Notificador("sms");
        String resultado = getOutput(notificador, "Olá por SMS!");
        assertEquals("Enviando SMS com mensagem: Olá por SMS!", resultado);
    }

    @Test
    public void testPushNotificacao() {
        Notificador notificador = new Notificador("push");
        String resultado = getOutput(notificador, "Olá por notificação push!");
        assertEquals("Enviando notificação push com mensagem: Olá por notificação push!", resultado);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNotificacaoDesconhecida() {
        new Notificador("desconhecido");
    }

    private String getOutput(Notificador notificador, String mensagem) {
        // Captura o output da impressão
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        notificador.enviarNotificacao(mensagem);

        return outputStream.toString().trim();
    }
}
