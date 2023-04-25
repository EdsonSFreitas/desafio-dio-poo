package br.com.dio.desafio.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ConteudoTest {
    /**
     * Method under test: {@link Conteudo#getTitulo()}
     */
    @Test
    void testGetTitulo() {
        assertEquals("Título não disponível", (new Curso(1)).getTitulo());
    }

    /**
     * Method under test: {@link Conteudo#getTitulo()}
     */
    @Test
    void testGetTitulo2() {
        Curso curso = new Curso(1);
        curso.setTitulo("foo");
        assertEquals("foo", curso.getTitulo());
    }

    /**
     * Method under test: {@link Conteudo#setTitulo(String)}
     */
    @Test
    void testSetTitulo() {
        Curso curso = new Curso(1);
        curso.setTitulo("Titulo");
        assertEquals("Titulo", curso.getTitulo());
    }

    /**
     * Method under test: {@link Conteudo#setTitulo(String)}
     */
    @Test
    void testSetTitulo2() {
        assertThrows(IllegalArgumentException.class, () -> (new Curso(1)).setTitulo(null));
    }

    /**
     * Method under test: {@link Conteudo#getDescricao()}
     */
    @Test
    void testGetDescricao() {
        assertNull((new Curso(1)).getDescricao());
    }

    /**
     * Method under test: {@link Conteudo#setDescricao(String)}
     */
    @Test
    void testSetDescricao() {
        Curso curso = new Curso(1);
        curso.setDescricao("Descricao");
        assertEquals("Descricao", curso.getDescricao());
    }
}