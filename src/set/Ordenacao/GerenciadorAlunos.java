package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributos
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota){
        alunosSet.add(new Alunos(nome, matricula, nota));
    }

    public void removerAlunoPorMatricula(long matricula){
        Alunos alunoParaRemover = null;
        if(!alunosSet.isEmpty()){
            for(Alunos g : alunosSet){
                if(g.getMatricula() == matricula){
                    alunoParaRemover = g;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        }else{
            System.out.println("O conjunto está vazio");
        }

        if (alunoParaRemover == null){
            System.out.println("Matricula não encontrada");
        }
    }

    public void exibirAlunosPorNome (){
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        if(!alunosSet.isEmpty()){
            System.out.println(alunosPorNome);
        }else{
            System.out.println("O conjunto está vazio");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if(!alunosSet.isEmpty()){
            alunosPorNota.addAll(alunosSet);
            System.out.println(alunosPorNota);
        }else {
            System.out.println("O conjutno está vazio");
        }
    }

    public void exibirAlunos (){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(000L);
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        System.out.println(gerenciadorAlunos.alunosSet);

        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
