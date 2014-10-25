
package br.com.dbs.java.mps.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Janaína
 */
public class Playlist {
    
    private String nome;
    private Integer quantidadeDeExecucoes;
    private Date dataUltimaExecucao;
    private Date dataCriacao;
    private Integer duracaoTotal;
    private final List<Musica> musicas = new ArrayList<>();

   
    
     public void adicionaMusica(Musica musica) {
        musicas.add(musica);
    }   
    
      /**
     * @return the musicas
     */
    public List<Musica> getMusicas() {
        return musicas;
    } 
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the quantidadeDeExecucoes
     */
    public Integer getQuantidadeDeExecucoes() {
        return quantidadeDeExecucoes;
    }

    /**
     * @return the dataUltimaExecucao
     */
    public Date getDataUltimaExecucao() {
        return dataUltimaExecucao;
    }

    /**
     * @return the dataCriacao
     */
    public Date getDataCriacao() {
        return dataCriacao;
    }

    /**
     * @return the duracaoTotal
     */
    public Integer getDuracaoTotal() {
        return duracaoTotal;
    }

 
    
}
