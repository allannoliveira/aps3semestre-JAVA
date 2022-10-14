package dao;

import entidades.Autores;
import entidades.Editoras;
import entidades.Livros;

import java.util.List;

public interface Dao {

    // MÉTODOS DE BUSCA
    public List<Livros> listarTodosLivros();
    public List<Editoras> listarTodasEditoras();
    public List<Autores> listarTodosAutores();
    // public List<Livros> buscarLivroSelecionado();
    // public List<Editoras> buscarEditoraSelecionada();
    public List<Autores> buscarAutorSelecionado(String name);
    public void InsertLivros(Livros livros);

    void InsertAutores(Autores autores);

    void InsertEditoras(Editoras editoras);
}

