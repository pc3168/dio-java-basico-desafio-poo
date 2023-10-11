package smartphone;

import internet.NavegadorNaInternet;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {


    @Override
    public void ligar() {
        System.out.println("ligar iPhone");
    }

    @Override
    public void atender() {
        System.out.println("Atender iPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz iPhone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir Página iPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar Nova Aba iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Página iPhone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar Música iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar Música iPhone");
    }

    @Override
    public void selecinarMusica() {
        System.out.println("Selecionar Música iPhone");
    }


}
