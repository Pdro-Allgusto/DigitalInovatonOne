

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Linux");
        curso1.setDescricao("Aprenda como trabalhar com o sistema operacional Linux, um dos mais utilizados do mundo e muito popular entre os desenvolvedores. Ele pode ser usado em desktops, servidores, smartphones e tablets.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Aprenda a trabalhar com a mais nova atualização da linguagem JavaScript, a ES6, desde seus fundamentos até as funções avançadas e novos conceitos aplicados.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JavaScript");
        mentoria.setDescricao("Esta mentoria está desetinada ao esclarecimento de dúvidas sobre o Bootcamp");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Java é uma das linguagens back-end mais utilizada por desenvolvedores de todo o mundo. Neste bootcamp você aprenderá o passo a passo da tecnologia e desenvolverá projetos 100% práticos.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pedro:" + devPedro.getConteudosConcluidos());
        System.out.println("XP:" + devPedro.calcularTotalXp());

    }

}
