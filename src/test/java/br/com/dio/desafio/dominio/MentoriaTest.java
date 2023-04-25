package br.com.dio.desafio.dominio;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MentoriaTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Mentoria#Mentoria()}
     *   <li>{@link Mentoria#toString()}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertEquals("\nMentoria\n{Titulo='Título não disponível', Descrição='null', Data=null}",
                (new Mentoria()).toString());
        assertEquals("\nMentoria\n{Titulo='Título não disponível', Descrição='null', Data=1970-01-01}",
                (new Mentoria(LocalDate.of(1970, 1, 1))).toString());
    }

    /**
     * Method under test: {@link Mentoria#Mentoria(String, String, LocalDate)}
     */
    @Test
    void testConstructor2() {
        Mentoria actualMentoria = new Mentoria("Mentoria De Java", "Descricao Mentoria Java", LocalDate.of(1970, 1, 1));

        assertEquals("Descricao Mentoria Java", actualMentoria.getDescricao());
        assertEquals("Mentoria De Java", actualMentoria.getTitulo());
    }

    /**
     * Method under test: {@link Mentoria#calcularXp()}
     */
    @Test
    void testCalcularXp() {
        assertEquals(30.0d, (new Mentoria()).calcularXp());
    }
}