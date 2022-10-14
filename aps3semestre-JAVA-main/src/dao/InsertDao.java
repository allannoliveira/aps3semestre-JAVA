package dao;


import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entidades.Autores;
import entidades.Editoras;
import entidades.Livros;

import java.sql.DriverManager;

public class InsertDao {
    static private String USER = "admin";
    static private String PASS = "apsunip2022";
    static private String DATABASE = "aps_livraria";
    static private String URL = "jdbc:mysql://aps-livraria.ckngk6g6yaw4.sa-east-1.rds.amazonaws.com:3306/" + DATABASE;
    public void InsertLivros(Livros livros){


        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {

            String SqlInsertLivros = "insert into livros {title, isbn, price} values {?, ?, ?}";

            PreparedStatement pstm = con.prepareStatement(SqlInsertLivros);

            pstm.setString(1, livros.getTitle());
            pstm.setString(2, livros.getIsbn());
            pstm.setFloat(3, livros.getPrice());
            pstm.execute();

            JOptionPane.showMessageDialog(null, "Adicionado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        }catch (SQLException ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void InsertAutores(Autores autores) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        PreparedStatement pstm = null;

        try {
            String SqlInsertAutores = "insert into autores {name, fname} value {?, ?}";
            pstm = con.prepareStatement(SqlInsertAutores);

            pstm.setString(1, autores.getName());
            pstm.setString(2, autores.getFname());

            pstm.execute();

        }catch (SQLException ErroSql){
            JOptionPane.showMessageDialog(null, "Erro ao adicionar", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
