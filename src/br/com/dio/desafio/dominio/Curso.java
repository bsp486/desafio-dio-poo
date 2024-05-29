package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String Descricao;
    private int CargaHoraria;

    public Curso() {
    }

    public int calcularXP(){
        return 0;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", CargaHoraria=" + CargaHoraria +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

}
