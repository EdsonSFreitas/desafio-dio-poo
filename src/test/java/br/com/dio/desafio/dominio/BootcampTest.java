package br.com.dio.desafio.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BootcampTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Bootcamp}
     *   <li>{@link Bootcamp#setDescricao(String)}
     *   <li>{@link Bootcamp#setNome(String)}
     *   <li>{@link Bootcamp#getConteudos()}
     *   <li>{@link Bootcamp#getDesenvolvedoresInscritos()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao("Descricao");
        bootcamp.setNome("Nome");
        assertTrue(bootcamp.getConteudos().isEmpty());
        assertTrue(bootcamp.getDesenvolvedoresInscritos().isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Bootcamp}
     *   <li>{@link Bootcamp#setDescricao(String)}
     *   <li>{@link Bootcamp#setNome(String)}
     *   <li>{@link Bootcamp#getConteudos()}
     *   <li>{@link Bootcamp#getDesenvolvedoresInscritos()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Bootcamp actualBootcamp = new Bootcamp();
        actualBootcamp.setDescricao("Descricao");
        actualBootcamp.setNome("Nome");
        assertTrue(actualBootcamp.getConteudos().isEmpty());
        assertTrue(actualBootcamp.getDesenvolvedoresInscritos().isEmpty());
    }

    /**
     * Method under test: {@link Bootcamp#equals(Object)}
     */
    @Test
    void testEquals() {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao("Descricao");
        bootcamp.setNome("Nome");
        assertNotEquals(bootcamp, null);
    }

    /**
     * Method under test: {@link Bootcamp#equals(Object)}
     */
    @Test
    void testEquals2() {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao("Descricao");
        bootcamp.setNome("Nome");
        assertNotEquals(bootcamp, "Different type to Bootcamp");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Bootcamp#equals(Object)}
     *   <li>{@link Bootcamp#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao("Descricao");
        bootcamp.setNome("Nome");
        assertEquals(bootcamp, bootcamp);
        int expectedHashCodeResult = bootcamp.hashCode();
        assertEquals(expectedHashCodeResult, bootcamp.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Bootcamp#equals(Object)}
     *   <li>{@link Bootcamp#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao("Descricao");
        bootcamp.setNome("Nome");

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setDescricao("Descricao");
        bootcamp2.setNome("Nome");
        assertEquals(bootcamp, bootcamp2);
        int expectedHashCodeResult = bootcamp.hashCode();
        assertEquals(expectedHashCodeResult, bootcamp2.hashCode());
    }

    /**
     * Method under test: {@link Bootcamp#equals(Object)}
     */
    @Test
    void testEquals5() {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao(null);
        bootcamp.setNome("Nome");

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setDescricao("Descricao");
        bootcamp2.setNome("Nome");
        assertNotEquals(bootcamp, bootcamp2);
    }

    /**
     * Method under test: {@link Bootcamp#equals(Object)}
     */
    @Test
    void testEquals6() {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao("Descricao");
        bootcamp.setNome(null);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setDescricao("Descricao");
        bootcamp2.setNome("Nome");
        assertNotEquals(bootcamp, bootcamp2);
    }
}