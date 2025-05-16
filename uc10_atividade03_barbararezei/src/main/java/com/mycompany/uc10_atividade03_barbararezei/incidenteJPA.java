
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


public class incidenteJPA {
    
     public static void cadastrar(incidente i )
    {
    EntityManager manager = JPAUtil.conectar();
        
  
    
    try{
       manager.getTransaction().begin();
       manager.persist(i);
       manager.getTransaction().commit();
    
   }catch(Exception e )
   {
       manager.getTransaction().rollback();
   }finally
    {
        JPAUtil.desconectar();
    }
    }
     
     
     public static List<incidente> listar()
    {
        List<incidente> lista = new ArrayList<incidente>();
        EntityManager manager = JPAUtil.conectar();
        
        try
        {
            Query sql =  manager.createQuery("SELECT i FROM incidente i  ");
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
        
        
            
            
      
     
     
       public static List<incidente> listarbusca(String busca)
    {
       EntityManager manager = JPAUtil.conectar();
        List pac= null;
        
        try
        {
            Query sql =  manager.createQuery("SELECT i FROM incidente i " +"WHERE (:data is null OR i.data LIKE :data) ");
            sql.setParameter("data",busca.isEmpty() ? null : "%" + busca + "%" );
            
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
     
    
}



