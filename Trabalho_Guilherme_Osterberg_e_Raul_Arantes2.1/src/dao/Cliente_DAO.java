 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.TesteJDBC;
import bean.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guilh
 */
public class Cliente_DAO extends DAO_Abstract {

   
    @Override
    public void insert(Object object) {
        Cliente cliente = (Cliente) object;
   String url, user, password;
        url ="jdbc:mysql://127.0.0.1:3306/guilherme_osterberg";
        user ="root";
        password ="";
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO cliente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            
            pstm.setInt(1, cliente.getIdCliente());
            pstm.setString(2,cliente.getNome());
            pstm.setString(3, cliente.getSobreNome());
            pstm.setString(4, cliente.getCpf());
            pstm.setString(5, cliente.getEndereco());
            pstm.setString(6, cliente.getPais());
            pstm.setString(7, cliente.getBairro());
            pstm.setString(8, cliente.getCidade());
            pstm.setString(9, cliente.getTelefone());
            pstm.setString(10, cliente.getCelular());
            pstm.setString(11, cliente.getEmail());
            pstm.setString(12, cliente.getDesconto());
            pstm.setInt(13, cliente.getFk_usuarios());
            pstm.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
    
    }

    @Override
    public void update(Object object) {
        
             Cliente cliente = (Cliente) object;
   String url, user, password;
        url ="jdbc:mysql://127.0.0.1:3306/guilherme_osterberg";
        user ="root";
        password ="";
       
        try {
           Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            Statement stm;
            stm = cnt.createStatement();
            String sql = "UPDATE cliente SET nome=?, sobreNome=?, cpf=?, endereco=?, pais=?, bairro=?, cidade=?, telefone=?, celular=?, email=?, desconto=?, fk_usuarios=? where idCliente=?";
            stm.executeLargeUpdate(sql);
            PreparedStatement pstm = cnt.prepareStatement(sql);
            
            pstm.setInt(13, cliente.getIdCliente());
            pstm.setString(1,cliente.getNome());
            pstm.setString(2, cliente.getSobreNome());
            pstm.setString(3, cliente.getCpf());
            pstm.setString(4, cliente.getEndereco());
            pstm.setString(5, cliente.getPais());
            pstm.setString(6, cliente.getBairro());
            pstm.setString(7, cliente.getCidade());
            pstm.setString(8, cliente.getTelefone());
            pstm.setString(9, cliente.getCelular());
            pstm.setString(10, cliente.getEmail());
            pstm.setString(11, cliente.getDesconto());
            pstm.setInt(12, cliente.getFk_usuarios());
            pstm.executeLargeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
        
    }

    @Override
    public void delete(Object object) {
  Cliente cliente = (Cliente) object;
        try {
            String url, user, password;
            url = "jdbc:mysql://127.0.0.1:3306/guilherme_osterberg";
            user = "root";
            password = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pstm;
            String sql = "delete from cliente where idcliente=?";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1,cliente.getIdCliente());
            pstm.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object list(int id) {
         Cliente cliente = new Cliente();
   String url, user, password;
        url ="jdbc:mysql://127.0.0.1:3306/guilherme_osterberg";
        user ="root";
        password ="";
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM cliente WHERE idCliente= ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            
            if (rs.next()==true)
                
            {
            cliente.setIdCliente(rs.getInt("idCliente"));
            cliente.setNome(rs.getString("nome"));
            cliente.setSobreNome(rs.getString("sobreNome"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setEndereco(rs.getString("endereco"));
            cliente.setPais(rs.getString("pais"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setCidade(rs.getString("cidade"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setCelular(rs.getString("celular"));
            cliente.setEmail(rs.getString("email"));
            cliente.setDesconto(rs.getString("desconto"));
            cliente.setFk_usuarios(rs.getInt("fk_usuarios"));
            }
            pstm.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };return cliente;

    }

    @Override
    public List listAll() {
         List lista = new ArrayList();
        try {
            String url, user, password;
        url ="jdbc:mysql://127.0.0.1:3306/guilherme_osterberg";
        user ="root";
        password ="";
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pstm;
            String sql = "select * from cliente";
            pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();            
            while (rs.next() == true) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(rs.getInt("idCliente"));
            cliente.setNome(rs.getString("nome"));
            cliente.setSobreNome(rs.getString("sobreNome"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setEndereco(rs.getString("endereco"));
            cliente.setPais(rs.getString("pais"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setCidade(rs.getString("cidade"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setCelular(rs.getString("celular"));
            cliente.setEmail(rs.getString("email"));
            cliente.setDesconto(rs.getString("desconto"));
            cliente.setFk_usuarios(rs.getInt("fk_usuarios"));
                lista.add(cliente);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

        
        
        
        
        

    }
    