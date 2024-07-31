package projetodesistemas.ExercicioPadraoComposite;

import projetodesistemas.ExercicioPadraoComposite.Model.*;

public class MainCliente {
    public static void main(String[] args) {
        Caixa caixaPrincipal = new Caixa();
        Caixa caixaMartelo = new Caixa();
        Caixa caixaDupla = new Caixa();
        Caixa caixaTelefoneFones = new Caixa();
        Caixa caixaCarregador = new Caixa();
        Martelo martelo = new Martelo("Martelo", 38.00);
        Telefone telefone = new Telefone("Telefone", 1800.00);
        FonesDeOuvido fonesDeOuvido = new FonesDeOuvido("Fone de ouvido", 70.00);
        Carregador carregador = new Carregador("Carregador", 40.00);

        caixaMartelo.addChildren(martelo);
        caixaTelefoneFones.addChildren(telefone);
        caixaTelefoneFones.addChildren(fonesDeOuvido);
        caixaCarregador.addChildren(carregador);
        caixaDupla.addChildren(caixaCarregador);
        caixaDupla.addChildren(caixaTelefoneFones);
        caixaPrincipal.addChildren(caixaDupla);
        caixaPrincipal.addChildren(caixaMartelo);

        System.out.println("Valor da caixa: " + caixaPrincipal.somaValores());
    }
}