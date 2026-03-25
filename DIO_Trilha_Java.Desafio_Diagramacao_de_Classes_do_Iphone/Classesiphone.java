interface IReprodutor {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

interface ITelefone {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

interface INavegador {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

class iPhone implements IReprodutor, ITelefone, INavegador {

    public iPhone() {
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}

public class Classesiphone {
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();
        
        meuiPhone.tocar();
        meuiPhone.pausar();
        meuiPhone.selecionarMusica("Imagine");
        
        meuiPhone.ligar("123456789");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();
        
        meuiPhone.exibirPagina("www.google.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}

