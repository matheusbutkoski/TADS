package decorators;

import modelo.Notificacao;

public class WhatsApp extends NotificacaoDecorator {

    public WhatsApp(Notificacao notificacao) {
        super(notificacao);
        
    }

    @Override
    public void enviar(){
        super.enviar();
        System.out.println("Enviando Notificacao no WhatsApp");
    }

    
}