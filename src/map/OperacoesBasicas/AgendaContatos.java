package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //Adicionar Contatos
        agendaContatos.adicionarContato("Guilherme", 119112);
        agendaContatos.adicionarContato("Camila", 119444);
        agendaContatos.adicionarContato("Geovane", 11918975);
        agendaContatos.adicionarContato("Guilherme Silva", 11909856);
        agendaContatos.adicionarContato("Douglas", 1194559784);
        agendaContatos.adicionarContato("Alice", 119643759);

        agendaContatos.exibirContatos();

        // Remover um contato
        agendaContatos.removerContato("Camila");
        agendaContatos.exibirContatos();

        // Pesquisar número por nome
        //String nomePesquisa = "João";
        //Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        //System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        //String nomePesquisaNaoExistente = "Paula";
        //Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        //System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }
}

