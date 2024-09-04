package Ocp;

public class Notificador {
    private Notificacao notificacao;

    public Notificador(String tipoNotificacao) {
        this.notificacao = NotificacaoFactory.criarNotificacao(tipoNotificacao);
    }

    public void enviarNotificacao(String mensagem) {
        notificacao.enviar(mensagem);
    }
}
