package br.com.dio.desafio.dominio;

import javax.swing.plaf.PanelUI;
import java.util.*;

public class Dev {

    private String nome;
    private Set<Conteudo> contudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.contudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.contudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.contudosInscritos.remove(conteudo.get());
        }else {
            System.err.println("Você não esta matriculado em nenhum conteudo");
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos.stream().mapToDouble(conteudo-> conteudo.calcularXp()).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getContudosInscritos() {
        return contudosInscritos;
    }

    public void setContudosInscritos(Set<Conteudo> contudosInscritos) {
        this.contudosInscritos = contudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(contudosInscritos, dev.contudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, contudosInscritos, conteudosConcluidos);
    }
}

