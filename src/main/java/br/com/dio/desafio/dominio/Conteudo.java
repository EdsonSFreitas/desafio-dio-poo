package br.com.dio.desafio.dominio;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * @author Edson da Silva Freitas
 * {@code @created} 24/04/2023
 * {@code @project} desafio-dio-poo
 */
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    protected Conteudo() {

    }

    protected Conteudo(@NotNull String titulo, @NotNull String descricao) {
        this.titulo = Objects.requireNonNull(titulo, "O título não pode ser nulo.");
        this.descricao = Objects.requireNonNull(descricao, "A descrição não pode ser nula.");
    }

    public static double getXP_PADRAO() {
        return XP_PADRAO;
    }

    public abstract double calcularXp();

    public @NotNull String getTitulo() {
        if (titulo == null) {
            return "Título não disponível";
        }
        return titulo;
    }

    public void setTitulo(@NotNull String titulo) {
        this.titulo = Objects.requireNonNull(titulo, "O título não pode ser nulo.");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = Objects.requireNonNull(descricao, "A descrição não pode ser nula.");
    }
}