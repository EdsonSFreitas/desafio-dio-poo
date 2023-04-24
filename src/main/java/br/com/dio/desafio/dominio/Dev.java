package br.com.dio.desafio.dominio;

import java.util.*;

/**
 * @author Edson da Silva Freitas
 * {@code @created} 24/04/2023
 * {@code @project} desafio-dio-poo
 */
public class Dev {
    private String nome;
    private final Set<Conteudo> contInscritos = new LinkedHashSet<>();
    private final Set<Conteudo> contConcluidos = new LinkedHashSet<>();

    public double calcularTotalXp() {
        Iterator<Conteudo> iterator = this.contConcluidos.iterator();
        double soma = 0;
        while (iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.contInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDesenvolvedoresInscritos().add(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(contInscritos, dev.contInscritos) && Objects.equals(contConcluidos, dev.contConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, contInscritos, contConcluidos);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.contInscritos.stream()
                .findFirst();
        if (conteudo.isPresent()) {
            this.contConcluidos.add(conteudo.get());
            this.contInscritos.remove(conteudo.get());
        } else {
            System.err.println("Nenhum conteúdo encontrado para sua matricula");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getContInscritos() {
        return contInscritos;
    }

    public Set<Conteudo> getContConcluidos() {
        return contConcluidos;
    }

}