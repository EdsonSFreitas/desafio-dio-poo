package br.com.dio.desafio.dominio;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
class CursoTest {
     /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Curso#Curso(int)}
     *   <li>{@link Curso#setCargaHoraria(int)}
     * </ul>
     */
    @DisplayName("testContrutorNull")
    @Test
    void testConstructorGetDescricao() {
        Curso curso = new Curso(1);
        curso.setCargaHoraria(1);
        assertNull(curso.getDescricao());
    }

    /**
     * Method under test: {@link Curso#Curso(String, String, int)}
     */

    @Test
    void testConstructorGetDescricaoGetTitulo() {
        Curso curso = new Curso("Titulo", "Descricao", 1);
        assertEquals("Descricao", curso.getDescricao());
        assertEquals("Titulo", curso.getTitulo());
    }

    /**
     * Method under test: {@link Curso#Curso(String, String, int)}
     */
    @DisplayName("Testa se titulo e descricao sao nulos")
    @Test
    void testConstructorTituloDescricaoNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            Curso curso = new Curso(null, null, 1);
        });
        Curso curso = null;
        assertNull(curso);
    }

    /**
     * Method under test: {@link Curso#Curso(String, String, int)}
     */
    @Test
    @Disabled("Explorando anotações do Junit")
    void testConstructorDescricaoNull() {
           new Curso("teste desativado proposiltamente", null, 1);
    }

    /**
     * Method under test: {@link Curso#calcularXp()}
     */
    @Test
    void testCalcularXp() {
        assertEquals(10.0d, (new Curso(1)).calcularXp());
    }
}