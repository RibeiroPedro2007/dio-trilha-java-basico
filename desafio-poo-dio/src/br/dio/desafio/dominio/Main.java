package br.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descricao generica");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("Curso java");
        curso2.setDescricao("Descricao generica");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1= new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição da mentoria de java");
        mentoria1.setData(LocalDate.now());

        BootCamp bootCamp1= new BootCamp();
        bootCamp1.setNome("Java devops");
        bootCamp1.setDescricao("descrição do bootcamp");
        bootCamp1.getConteudos().add(curso1);
        bootCamp1.getConteudos().add(curso2);
        bootCamp1.getConteudos().add(mentoria1);

        Dev dev1= new Dev();
        dev1.setNome("Pepis");
        dev1.inscrever(bootCamp1);
        dev1.progredir();
        System.out.println(dev1.calcularXp());
        System.out.println(dev1.getConteudoInscritos());
        System.out.println(dev1.getConteudoConcluidos());

        Dev dev2= new Dev();
        dev2.setNome("Pepe");
        dev1.inscrever(bootCamp1);
        System.out.println(dev2.getConteudoInscritos());



    }
}
