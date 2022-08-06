import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        //System.out.println(curso1);
        //System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devVeronica = new Dev();
        devVeronica.setNome("Veronica");
        devVeronica.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscrito Veronica" + devVeronica.getContudosInscritos());
        devVeronica.progredir();
        devVeronica.progredir();
        System.out.println("---");

        System.out.println("Conteúdos concluidos Veronica" + devVeronica.getConteudosConcluidos());
        System.out.println("Conteúdos inscrito Veronica" + devVeronica.getContudosInscritos());
        System.out.println("XP:"+ devVeronica.calcularTotalXp());

        System.out.println("-----------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscrito Joao" + devJoao.getContudosInscritos());
        devJoao.progredir();
        devVeronica.progredir();
        devVeronica.progredir();
        System.out.println("---");

        System.out.println("Conteúdos concluidos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos inscrito Joao" + devJoao.getContudosInscritos());
        System.out.println("XP:"+ devJoao.calcularTotalXp());





    }
}
