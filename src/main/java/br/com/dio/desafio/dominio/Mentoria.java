package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * @author Edson da Silva Freitas
 * {@code @created} 24/04/2023
 * {@code @project} desafio-dio-poo
 */
public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(LocalDate data) {
        this.data = data;
    }

    public Mentoria() {
    }

    public Mentoria(String mentoriaDeJava, String descricaoMentoriaJava, LocalDate now) {
        super(mentoriaDeJava,descricaoMentoriaJava);
        this.data = now;
    }

    @Override
    public double calcularXp() {
        return getXP_PADRAO() + 20d;
    }

    @Override
    public String toString() {
        return "\nMentoria\n{" +
                "Titulo='" + getTitulo() + '\'' +
                ", Descrição='" + getDescricao() + '\'' +
                ", Data=" + data +
                '}';
    }
}