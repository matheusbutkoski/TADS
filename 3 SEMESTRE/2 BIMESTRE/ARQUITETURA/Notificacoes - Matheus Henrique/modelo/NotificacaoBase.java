package modelo;

public class NotificacaoBase implements Notificacao {

    @Override
    public void enviar() {
        System.out.println("Notificacao base");
      }
}
