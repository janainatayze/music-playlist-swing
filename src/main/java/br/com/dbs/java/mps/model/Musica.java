
package br.com.dbs.java.mps.model;

/**
 *
 * @author Janaína
 */
public class Musica {
    
    private String nome;
    private Integer duracao;
    private Cantor cantor;
        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Cantor getCantor() {
        return cantor;
    }

    public void setCantor(Cantor cantor) {
        this.cantor = cantor;
    }
    
}
