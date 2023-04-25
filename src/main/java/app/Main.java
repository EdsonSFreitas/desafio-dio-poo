package app;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

import static br.com.dio.desafio.dominio.ExibeConteudo.conteudosConcluidos;
import static br.com.dio.desafio.dominio.ExibeConteudo.conteudosInscritos;


/**
 * Projeto simples para entrega de desafio Bootcamp DIO POO
 *
 * @author Edson da Silva Freitas
 * {@code @created} 24/04/2023
 * {@code @project} desafio-dio-poo
 */
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição Curso Java", 8);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso Javascript");
        curso2.setCargaHoraria(4);
        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descricao Mentoria Java", LocalDate.now());
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição do Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("********************");
        Dev freitas = new Dev();
        freitas.setNome("Edson Freitas");
        freitas.inscreverBootcamp(bootcamp);
        System.out.println(conteudosInscritos(freitas, freitas.getContInscritos()));
        freitas.progredir();
        freitas.progredir();
        freitas.progredir();
        System.out.println(conteudosConcluidos(freitas, freitas.getContConcluidos()));
        final StringBuilder sb = new StringBuilder();
        sb.setLength(0);
        sb.append("XP: ").append(freitas.calcularTotalXp());
        System.out.println(sb);
        System.out.println(conteudosInscritos(freitas, freitas.getContInscritos()));

        System.out.println("********************");
        Dev silva = new Dev();
        silva.setNome("Edson Silva ");
        silva.inscreverBootcamp(bootcamp);
        System.out.println(conteudosInscritos(silva, silva.getContInscritos()));
        silva.progredir();
        silva.progredir();
        System.out.println(conteudosConcluidos(silva, silva.getContConcluidos()));
        final StringBuilder sbSilva = new StringBuilder();
        sbSilva.append("XP: ").append(silva.calcularTotalXp());
        System.out.println(sbSilva);
    }
}