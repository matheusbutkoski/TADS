package decorators;

import modelo.Notificacao;

public class SMS extends NotificacaoDecorator {

    public SMS(Notificacao notificacao) {
        super(notificacao);
        
    }

    @Override
    public void enviar(){
        super.enviar();
        System.out.println("Enviando Notificacao por SMS");
    }

    
}
