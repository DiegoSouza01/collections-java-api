package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoatualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                c.setNumero(novoNumero);
                contatoatualizado = c;
                break;
            }
        }
        return contatoatualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Lucas a", 13);
        agendaContatos.adicionarContato("Lucas b", 14);
        agendaContatos.adicionarContato("Lucas c", 15);
        agendaContatos.adicionarContato("Lucas d", 16);
        agendaContatos.adicionarContato("Lucas e", 17);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Lucas a"));

        System.out.println("Contatos atualizado:" + agendaContatos.atualizarNumeroContato("Lucas a", 1233));
    }
}
