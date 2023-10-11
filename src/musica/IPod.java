package musica;

public class IPod implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocar Música iPod");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar Música iPod");
    }

    @Override
    public void selecinarMusica() {
        System.out.println("Selecionar Música iPod");
    }
}
