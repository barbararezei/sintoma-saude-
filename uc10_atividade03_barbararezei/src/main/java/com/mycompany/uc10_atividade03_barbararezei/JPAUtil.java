
package com.mycompany.uc10_atividade03_barbararezei;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class JPAUtil {
    
    private static String PERSISTENCE_UNIT = "sintomasaude-pu";
    
    private static EntityManager gerente;
    private static EntityManagerFactory fabrica;
    
    public static EntityManager conectar()
    {
    
    if(fabrica == null || !fabrica.isOpen()) 
    {
    fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
    }
    
    if(gerente == null || !gerente.isOpen())
    {
        
      gerente = fabrica.createEntityManager();
    
    }
   
    return gerente;
   }
    
    
    
    
    public static void desconectar()
    {
          if(gerente.isOpen() && gerente != null)
          {
              gerente.close();
              fabrica.close();
          }
   
    
    }
}
