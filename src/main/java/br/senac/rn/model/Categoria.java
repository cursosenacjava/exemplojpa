package br.senac.rn.model;


public class Categoria {

    private int id;
    private String nome;
    private String descricao;
        
    public Categoria() {
     }
    
    public Categoria (int id, String nome, String descricao){
        this.id = id;
        this.nome = String;
        this.descricao = String;
        
        
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
        
    
    
}
