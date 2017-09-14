
package br.senac.rn.principal;

import br.senac.rn.dao.SexoDAO;
import br.senac.rn.model.Sexo;


public class Principal {
    
    public static void main(String[] args) {
        
        Sexo s1 = new Sexo();
        
                     
        SexoDAO dao = new SexoDAO();
        System.out.println(dao.buscaPorId(1));
        //dao.buscarTodos().stream().forEach((_item) -> {System.out.println("s");});
        
        
        System.exit(0);
    }
}
