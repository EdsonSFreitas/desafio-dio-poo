package br.com.dio.desafio.dominio;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ExibeConteudoTest {
    /**
     * Method under test: {@link ExibeConteudo#conteudosInscritos(Dev, Set)}
     */
    @Test
    void testConteudosInscritos() {
        Dev dev = new Dev();
        try {
            System.out.println(ExibeConteudo.conteudosInscritos(dev, new HashSet<>()));
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNull(dev.getNome());
        }
    }

    /**
     * Method under test: {@link ExibeConteudo#conteudosInscritos(Dev, Set)}
     */
    @Order(1)
    @DisplayName("Primeiro teste por ordem numerida para fins de exemplo")
    @Test
    void testConteudosInscritos2() {
        Dev dev = new Dev();
        assertThrows(IllegalArgumentException.class, () -> ExibeConteudo.conteudosInscritos(dev, new HashSet<>()));
    }

    /**
     * Method under test: {@link ExibeConteudo#conteudosInscritos(Dev, Set)}
     */
    @Test
    void testConteudosInscritos4() {
        Dev dev = new Dev();
        dev.setNome("teste");
        assertThrows(IllegalArgumentException.class, () -> ExibeConteudo.conteudosInscritos(dev, null));
    }

    /**
     * Method under test: {@link ExibeConteudo#conteudosInscritos(Dev, Set)}
     */
    @Test
    void testConteudosInscritos5() {
        Dev dev = new Dev();
        dev.setNome("teste");
        ExibeConteudo.conteudosInscritos(dev, new HashSet<>());
        assertEquals("teste", dev.getNome());
    }

    /**
     * Method under test: {@link ExibeConteudo#conteudosInscritos(Dev, Set)}
     */
    @Order(2)
    @Test
    void testConteudosInscritosCompleto7() {
        Curso cursoTest = new Curso("Test Curso Java", "Test Descrição Curso Java", 8);
        Mentoria mentoriaTest = new Mentoria("Test Mentoria de Java", "Test Descricao Mentoria Java", LocalDate.now());
        Bootcamp bootcampTest = new Bootcamp();
        bootcampTest.setNome("Test Bootcamp Java Dev");
        bootcampTest.setDescricao("Test Descrição do Bootcamp Java");
        bootcampTest.getConteudos().add(cursoTest);
        bootcampTest.getConteudos().add(mentoriaTest);
        Dev freitasTest = new Dev();
        freitasTest.setNome("Test Os parâmetros dev ou conteudos do construtor não podem ser nulos");
        freitasTest.inscreverBootcamp(bootcampTest);
        String conteudos = ExibeConteudo.conteudosInscritos(freitasTest, freitasTest.getContInscritos());
        assertNotNull(conteudos);
        assertFalse(conteudos.isEmpty());
    }

    /**
     * Method under test: {@link ExibeConteudo#conteudosConcluidos(Dev, Set)}
     */
    @Test
    void testConteudosConcluidos() {
        Dev dev = new Dev();
        try {
            ExibeConteudo.conteudosConcluidos(dev, new HashSet<>());
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNull(dev.getNome());
        }
    }

    /**
     * Method under test: {@link ExibeConteudo#conteudosConcluidos(Dev, Set)}
     */
    @Test
    void testConteudosConcluidos2() {
        Curso cursoTest = new Curso("Test Curso Java", "Test Descrição Curso Java", 8);
        Mentoria mentoriaTest = new Mentoria("Test Mentoria de Java", "Test Descricao Mentoria Java", LocalDate.now());
        Bootcamp bootcampTest = new Bootcamp();
        bootcampTest.setNome("Test Bootcamp Java Dev");
        bootcampTest.setDescricao("Test Descrição do Bootcamp Java");
        bootcampTest.getConteudos().add(cursoTest);
        bootcampTest.getConteudos().add(mentoriaTest);
        Dev freitasTest = new Dev();
        freitasTest.setNome("Test Os parâmetros dev ou conteudos do construtor não podem ser nulos");
        freitasTest.inscreverBootcamp(bootcampTest);
        freitasTest.progredir();
        String conteudosConcluidos = ExibeConteudo.conteudosConcluidos(freitasTest, freitasTest.getContConcluidos());
        assertNotNull(conteudosConcluidos);
        assertFalse(conteudosConcluidos.isEmpty());
    }

    /**
     * Method under test: {@link ExibeConteudo#conteudosConcluidos(Dev, Set)}
     */
    @Test
    void testConteudosConcluidos4() {
        Dev dev = new Dev();
        assertThrows(IllegalArgumentException.class, () -> ExibeConteudo.conteudosConcluidos(dev, new HashSet<>()));
    }

    /**
     * Method under test: {@link ExibeConteudo#conteudosConcluidos(Dev, Set)}
     */
    @Test
    void testConteudosConcluidos5() {
        Dev dev = new Dev();
        dev.setNome("foo");
        assertThrows(IllegalArgumentException.class, () -> ExibeConteudo.conteudosConcluidos(dev, null));
    }

    /**
     * Method under test: {@link ExibeConteudo#conteudosConcluidos(Dev, Set)}
     */
    @Test
    void testConteudosConcluidos6() {
        Dev dev = new Dev();
        dev.setNome("teste");
        System.out.println(ExibeConteudo.conteudosConcluidos(dev, new HashSet<>()));
        assertEquals("teste", dev.getNome());
    }
}