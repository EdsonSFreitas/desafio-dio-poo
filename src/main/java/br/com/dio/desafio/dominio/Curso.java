package br.com.dio.desafio.dominio;


/**
 * @author Edson da Silva Freitas
 * {@code @created} 24/04/2023
 * {@code @project} desafio-dio-poo
 */
public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public Curso(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return getXP_PADRAO() * (cargaHoraria);
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso\n{" +
                "Titulo='" + getTitulo() + '\'' +
                ", Descrição='" + getDescricao() + '\'' +
                ", Carga Horária=" + cargaHoraria +
                '}';
    }
}