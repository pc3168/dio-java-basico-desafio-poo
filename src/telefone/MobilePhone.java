package telefone;

public class MobilePhone implements AparelhoTelefonico{

    @Override
    public void ligar() {
        System.out.println("ligar Mobile Phone");
    }

    @Override
    public void atender() {
        System.out.println("Atender Mobile Phone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz Mobile Phone");
    }
}
