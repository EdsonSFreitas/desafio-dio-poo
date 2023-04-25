package br.com.dio.desafio.dominio;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DevTest {
    /**
     * Method under test: {@link Dev#calcularTotalXp()}
     */
    @Test
    void testCalcularTotalXp() {
        Curso cursoTest = new Curso("Test Curso Java", "Test Descrição Curso Java", 8);
        Mentoria mentoriaTest = new Mentoria("Test Mentoria de Java", "Test Descricao Mentoria Java", LocalDate.now());
        Bootcamp bootcampTest = new Bootcamp();
        bootcampTest.setNome("Test Bootcamp Java Dev");
        bootcampTest.setDescricao("Test Descrição do Bootcamp Java");
        bootcampTest.getConteudos().add(cursoTest);
        bootcampTest.getConteudos().add(mentoriaTest);
        Dev freitasTest = new Dev();
        freitasTest.setNome("Test Nome Dev");
        freitasTest.inscreverBootcamp(bootcampTest);
        freitasTest.progredir();
        assertEquals(80.0d, (freitasTest.calcularTotalXp()));
    }

    /**
     * Method under test: {@link Dev#inscreverBootcamp(Bootcamp)}
     */
    @Test
    void testInscreverBootcamp() {
        Dev dev = new Dev();
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao("Descricao");
        bootcamp.setNome("Nome");
        dev.inscreverBootcamp(bootcamp);
        assertTrue(bootcamp.getDesenvolvedoresInscritos().contains(dev));
        assertEquals(1, bootcamp.getDesenvolvedoresInscritos().size());
        assertTrue(dev.getContInscritos().containsAll(bootcamp.getConteudos()));
    }

    /**
     * Method under test: {@link Dev#inscreverBootcamp(Bootcamp)}
     */
    @Test
    void testInscreverBootcamp2() {
        Dev dev = new Dev();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> dev.inscreverBootcamp(null));
        assertEquals("O conteúdo não pode ser nulo.", exception.getMessage());
    }

    /**
     * Method under test: {@link Dev#progredir()}
     */
    @Test
    void testProgredir() {
        Curso cursoTest1 = new Curso("Test Curso Java", "Test Descrição Curso Java", 8);
        Curso cursoTest2 = new Curso("Test Curso Python", "Test Descrição Curso Python", 3);
        Bootcamp bootcampTest = new Bootcamp();
        bootcampTest.setNome("Test Bootcamp Java Dev");
        bootcampTest.setDescricao("Test Descrição do Bootcamp Java");
        bootcampTest.getConteudos().add(cursoTest1);
        bootcampTest.getConteudos().add(cursoTest2);
        Dev freitasTest = new Dev();
        freitasTest.setNome("Test Nome Dev");
        freitasTest.inscreverBootcamp(bootcampTest);
        freitasTest.progredir();
        assertTrue(freitasTest.getContConcluidos().contains(cursoTest1));
        assertFalse(freitasTest.getContInscritos().contains(cursoTest1));
    }

    /**
     * Method under test: {@link Dev#getContInscritos()}
     */
    @Test
    void testGetContInscritos() {
        assertTrue((new Dev()).getContInscritos().isEmpty());
    }

    /**
     * Method under test: {@link Dev#getContConcluidos()}
     */
    @Test
    void testGetContConcluidos() {
        assertTrue((new Dev()).getContConcluidos().isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Dev}
     *   <li>{@link Dev#setNome(String)}
     *   <li>{@link Dev#getNome()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Dev actualDev = new Dev();
        actualDev.setNome("Nome");
        assertEquals("Nome", actualDev.getNome());
    }

    /**
     * Method under test: {@link Dev#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new Dev(), null);
        assertNotEquals(new Dev(), "Different type to Dev");
        assertNotEquals(new Dev(), 1);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Dev#equals(Object)}
     *   <li>{@link Dev#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        Dev dev = new Dev();
        assertEquals(dev, dev);
        int expectedHashCodeResult = dev.hashCode();
        assertEquals(expectedHashCodeResult, dev.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Dev#equals(Object)}
     *   <li>{@link Dev#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Dev dev = new Dev();
        Dev dev2 = new Dev();
        assertEquals(dev, dev2);
        int expectedHashCodeResult = dev.hashCode();
        assertEquals(expectedHashCodeResult, dev2.hashCode());
    }

    /**
     * Method under test: {@link Dev#equals(Object)}
     */
    @Test
    void testEquals4() {
        Dev dev = new Dev();
        dev.setNome("Nome");
        assertNotEquals(dev, new Dev());
    }
}