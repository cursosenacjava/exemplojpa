
package br.senac.rn.dao;

import br.senac.rn.model.Categoria;
import br.senac.rn.model.Produto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ProdutoDAO {
     private EntityManager manager;
     private EntityManagerFactory factory;
     
     public ProdutoDAO() {
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
        manager = factory.createEntityManager();
        
        {
        public void inserir(Produto produto)    {
        manager.getTransaction().begin();
        manager.persist(produto);
        manager.getTransaction().commit();
        }
        
        public void excluir(Produto produto)    {
        manager.getTransaction().begin();
        manager.remove(produto);
        manager.getTransaction().commit();
}
    
        public void atualizar(Produto produto) {
        manager.getTransaction().begin();
        manager.merge(produto);
        manager.getTransaction().commit();
        }
        
        
        public void excluir
}
