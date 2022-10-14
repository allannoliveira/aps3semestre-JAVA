package dao;

import entidades.Autores;
import entidades.Editoras;
import entidades.Livros;

public class TesteConexao {
    public static void main(String[] args) {
        ConexaoBD.testaConexao();

        Dao db = new ConexaoBD();

    /*
        for (Editoras editoras: db.listarTodasEditoras()){
            System.out.println(editoras.getName());
        }

        System.out.println("  ");

        for (Livros livros: db.listarTodosLivros()){
            System.out.println(livros.getTitle());
        }

        System.out.println("  ");

        for (Autores autores: db.listarTodosAutores()){
            System.out.println(autores.getName() + " " + autores.getFname());
        }


        for (Autores autores: db.buscarAutorSelecionado("Stein")){
            System.out.println(autores.getName() + " " + autores.getFname());
        }

        Livros livro1 = new Livros("Ladrao", "999", 1040);
        db.InsertLivros(livro1);


        Autores autor1 = new Autores("Mst", "Lula");
        db.InsertAutores(autor1);
        */
    }

}
