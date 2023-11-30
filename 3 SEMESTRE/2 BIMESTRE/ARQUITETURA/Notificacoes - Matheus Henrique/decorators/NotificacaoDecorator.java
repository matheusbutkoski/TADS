package decorators;

import modelo.Notificacao;

public class NotificacaoDecorator implements Notificacao {
    
    public Notificacao notificacao;

    public NotificacaoDecorator(Notificacao notificacao){
        this.notificacao = notificacao;
    }

    public void enviar(){
        this.notificacao.enviar();
    }
}
