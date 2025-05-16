
package com.mycompany.uc10_atividade03_barbararezei;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class pacienteJPA {
    
    
     public static void cadastrar(paciente p )
    {
    EntityManager manager = JPAUtil.conectar();
        
  
    
    try{
       manager.getTransaction().begin();
       manager.persist(p);
       manager.getTransaction().commit();
    
   }catch(Exception e )
   {
       manager.getTransaction().rollback();
   }finally
    {
        JPAUtil.desconectar();
    }
    }
     
     
    
    public static List<paciente> listar()
    {
        List<paciente> lista = new ArrayList<paciente>();
        EntityManager manager = JPAUtil.conectar();
        
        try
        {
            Query sql =  manager.createQuery("SELECT p FROM paciente p ");
            lista = sql.getResultList();
            
        }catch(Exception e)
        {
            manager.getTransaction().rollback();
            
        }finally
        {
            JPAUtil.desconectar();
        }
        return lista;
        
    }
    
    
    
    
       public static List<paciente> listarbusca(String busca)
    {
       
        EntityManager manager = JPAUtil.conectar();
        List pac= null;
        
        try
        {
            Query sql =  manager.createQuery("SELECT p FROM paciente p " +"WHERE (:nome is null OR p.nome LIKE :nome) ");
            sql.setParameter("nome",busca.isEmpty() ? null : "%" + busca + "%" );
            
            pac = sql.getResultList();
        }catch(Exception e)
        {
            manager.getTransaction().rollback();
            
        }finally
        {
            JPAUtil.desconectar();
        }
        return pac;
        
    }
       
      public int buscarIdPorNome(String nome) {
        String sql = "SELECT idpaciente FROM paciente WHERE nome = ?";
        int idpaciente = -1;
        
        try {
            
            conecao con = new conecao();
            con.conectar();
            
            PreparedStatement stmt = con.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()) {
                idpaciente = rs.getInt("idpaciente");
            }
        }catch (SQLException se) {
            System.err.println("Erro ao buscar o idpaciente do paciente: " + se.getMessage());
        }
        return idpaciente;
    }
    
    
}
