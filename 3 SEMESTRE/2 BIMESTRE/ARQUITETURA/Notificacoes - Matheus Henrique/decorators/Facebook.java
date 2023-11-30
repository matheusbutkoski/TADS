package decorators;

import modelo.Notificacao;

public class Facebook extends NotificacaoDecorator {

    public Facebook(Notificacao notificacao) {
        super(notificacao);
        
    }

    @Override
    public void enviar(){
        super.enviar();
        System.out.println("Enviando Notificacao no Facebook");
    }

    
}
