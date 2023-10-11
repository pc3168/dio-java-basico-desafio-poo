import musica.IPod;
import smartphone.IPhone;
import telefone.MobilePhone;

public class Iniciar {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecinarMusica();

        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

        System.out.println("---------------------------------");

        IPod iPod = new IPod();

        iPod.tocar();
        iPod.pausar();
        iPod.selecinarMusica();

        System.out.println("---------------------------------");

        MobilePhone mobilePhone = new MobilePhone();

        mobilePhone.ligar();
        mobilePhone.atender();
        mobilePhone.iniciarCorreioVoz();
    }

}
