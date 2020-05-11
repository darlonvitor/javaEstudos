/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

/**
 *
 * @author darlo
 */
public class JDBCExemplo {
    public static void main(String[] args) throws SQLException{       
              //      o codigo abaixo lança a excessao
              //      java.sql.SQLException: No suitable driver found for 
              //      jdbc:mysql://localhost/dbloja                                                           
            
            Connection connection = new ConnectionFactory().getConnection(); //estabelecendo a conexao com o BD
            
            // string com um comando sql a ser executado
            // os valores que serao obtidos de uma variavel sao preenchidos com '?'
            String sql = "insert into contatos(nome,endereco,dataNascimento) values(?,?,?)";
            
            //obtendo o statement
            PreparedStatement sqmt = connection.prepareStatement(sql);
            
            // preenchendo os valores String da query
            // o primeiro parametro é a posiçao do campo( começando em 1)
            // o segundo é o valor a ser passado
            sqmt.setString(1, "Carlos Eduardo");
            sqmt.setString(2, "Rua das Lágrimas,418,Joinville,SC");
            
            // Nesse exemplo, vamos passar a data atual. 
            // Para isso, vamos passar um long que representa os milissegundos
            // da data atual para dentro de um java.sql.Date,
            // que é o tipo suportado pela API JDBC
            java.sql.Date dataParaGravar = new java.sql.Date(
            Calendar.getInstance().getTimeInMillis());
            sqmt.setDate(3,dataParaGravar);
            
            //executando os comandos de inserçao de dados no BD
            sqmt.execute();
            //fechando o statement
            sqmt.close();
            
            System.out.println("Gravou !!!");
            
            //encerrando a conexao
            connection.close();
            
    }
}
