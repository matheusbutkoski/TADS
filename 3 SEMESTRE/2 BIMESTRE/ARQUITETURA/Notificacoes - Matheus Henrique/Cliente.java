
import decorators.Facebook;
import decorators.SMS;
import decorators.WhatsApp;
import modelo.Notificacao;
import modelo.NotificacaoBase;

public class Cliente {

    public static void main(String[] args) {

        Notificacao NotificacaoBase = new NotificacaoBase();

        System.out.println("---NOTIFICACAO FACEBOOK---");
        Notificacao notificacaoFacebook = new Facebook(NotificacaoBase);
        notificacaoFacebook.enviar();
        System.out.println("");

        System.out.println("---NOTIFICACAO SMS---");
        Notificacao notificacaoSMS = new SMS(NotificacaoBase);
        notificacaoSMS.enviar();
        System.out.println("");

        System.out.println("---NOTIFICACAO WHATSAPP---");
        Notificacao notificacaoWhatsApp = new WhatsApp(NotificacaoBase);
        notificacaoWhatsApp.enviar();
        System.out.println("");

        System.out.println("---NOTIFICACAO FACEBOOK e SMS---");
        Notificacao notificacaoFacebookSMS = new Facebook(new SMS(NotificacaoBase));
        notificacaoFacebookSMS.enviar();
        System.out.println("");

        System.out.println("---NOTIFICACAO FACEBOOK e WHATSAPP---");
        Notificacao notificacaoFacebookWhatsAPP = new Facebook(new WhatsApp(NotificacaoBase));
        notificacaoFacebookWhatsAPP.enviar();
        System.out.println("");

        System.out.println("---NOTIFICACAO SMS e WHATSAPP---");
        Notificacao notificacaoSMSWhatsAPP = new SMS(new WhatsApp(NotificacaoBase));
        notificacaoSMSWhatsAPP.enviar();
        System.out.println("");

        System.out.println("---NOTIFICACAO SMS e WHATSAPP e FACEBOOK---");
        Notificacao notificacaoCompleta = new Facebook(new SMS(new WhatsApp(NotificacaoBase)));
        notificacaoCompleta.enviar();
        System.out.println("");

    }
    
}
