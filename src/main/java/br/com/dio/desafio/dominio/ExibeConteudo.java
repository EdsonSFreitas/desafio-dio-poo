package br.com.dio.desafio.dominio;

import java.util.Set;

/**
 * @author Edson da Silva Freitas
 * {@code @created} 24/04/2023
 * {@code @project} desafio-dio-poo
 */
public class ExibeConteudo {

    public static String conteudosInscritos(Dev dev, Set<Conteudo> conteudos) {
        if (dev.getNome() == null || conteudos == null) {
            throw new IllegalArgumentException("Os parâmetros dev ou conteudos do construtor não podem ser nulos");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nConteúdos inscritos para: ").append(dev.getNome()).append(" ");
        sb.append(conteudos);
        return sb.toString();
    }

    public static String conteudosConcluidos(Dev dev, Set<Conteudo> conteudos) {
        if (dev.getNome() == null || conteudos == null) {
            throw new IllegalArgumentException("Os parâmetros dev ou conteudos do construtor não podem ser nulos");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nConteúdos concluídos para: ").append(dev.getNome()).append(" ");
        sb.append(conteudos);
        return sb.toString();
    }
}