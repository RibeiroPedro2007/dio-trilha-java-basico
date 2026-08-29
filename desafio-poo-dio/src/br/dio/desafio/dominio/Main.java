package br.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descricao generica");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1= new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição d amentoria de java");
        mentoria1.setCargaHoraria(8);
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);

    }
}
