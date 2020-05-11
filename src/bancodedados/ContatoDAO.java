/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author darlo
 */

import java.sql.Date;

public class ContatoDAO {
    //conexao com o BD
    private  Connection connection;
    
    public ContatoDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Contato contato){
        //comanto sql para inserçao de dados 
        String sql = "insert into contatos"
                + "(nome,endereco,dataNascimento)"
                + " values(?,?,?)";
        try{
            //prepared statement para inserçao dos dados
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //setando os valores
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEndereco());
            stmt.setDate(3, new Date(
                    contato.getDataNascimento().getTimeInMillis()));
            
            //executando 
            stmt.execute();
            stmt.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
        
    }
    
    public List<Contato> getLista(){
        try{
            List<Contato> contatos = new ArrayList<>();
            PreparedStatement stmt = connection.prepareStatement("select * from contatos");
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                //criando o objeto Contato
                Contato c = new Contato();
                c.setId(rs.getLong("id"));
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("endereco"));
                
                //configurando o Calendar para armazenar a data de nascimento
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dataNascimento"));
                c.setDataNascimento(data);
                
                //adicionando o contato obtido à lista
                contatos.add(c);
            }
            
            rs.close();
            stmt.close();
            return contatos;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public Optional<Contato> pesquisar(int id){
        //contato a ser retornado
        Contato c = null;
        try{
            PreparedStatement stmt = connection.prepareStatement("select * from contatos where id = " + id);
            ResultSet rs =  stmt.executeQuery();
            
            while(rs.next()){
                //setando o resultado da busca
                c = new Contato();
                c.setId(rs.getLong("id"));
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("endereco"));
                
                //formatando data de nascimento
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dataNascimento"));
                c.setDataNascimento(data);
            }
            
            rs.close();
            stmt.close();
            return Optional.ofNullable(c);
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void altera(Contato c){
      
        try{
            PreparedStatement stmt = connection
                    .prepareStatement("update contatos set nome=?,"
                            + "endereco=?,dataNascimento=? where id=?");
            
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEndereco());
            stmt.setDate(3, new Date(c.getDataNascimento().getTimeInMillis()));
            stmt.setLong(4, c.getId());
            
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void remove(Long id){
        try{
            PreparedStatement stmt = connection.prepareStatement("delete from contatos where id=?");
            stmt.setLong(1,id);
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
