import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

/**
 * @author Edson da Silva Freitas
 * {@code @created} 24/04/2023
 * {@code @project} desafio-dio-poo
 */
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java","Descrição Curso Java",8);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso Javascript");
        curso2.setCargaHoraria(4);
        Mentoria mentoria = new Mentoria("Mentoria de Java","Descricao Mentoria Java", LocalDate.now());
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
        StringBuilder sb = new StringBuilder();
        sb.append("\nConteúdos inscritos para: ").append(freitas.getNome()).append(" ").append(freitas.getContInscritos());
        freitas.progredir();
        freitas.progredir();
        System.out.println(sb);
        sb.setLength(0);
        sb.append("\nConteúdos concluídos para: ").append(freitas.getNome()).append(" ").append(freitas.getContConcluidos());
        System.out.println(sb);
        sb.setLength(0);
        sb.append("XP: ").append(freitas.calcularTotalXp());
        System.out.println(sb);

        System.out.println("********************");
        Dev silva = new Dev();
        silva.setNome("Edson Silva ");
        silva.inscreverBootcamp(bootcamp);
        StringBuilder sbSilva = new StringBuilder();
        sbSilva.append("\nConteúdos inscritos para: ").append(silva.getNome()).append(" ").append(silva.getContInscritos());
        silva.progredir();
        System.out.println(sbSilva);
        sbSilva.setLength(0);
        sbSilva.append("\nConteúdos concluídos para: ").append(silva.getNome()).append(" ").append(silva.getContConcluidos());
        System.out.println(sbSilva);
        sbSilva.setLength(0);
        sbSilva.append("XP: ").append(silva.calcularTotalXp());
        System.out.println(sbSilva);
    }
}