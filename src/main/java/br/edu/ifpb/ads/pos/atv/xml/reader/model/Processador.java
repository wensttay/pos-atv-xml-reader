package br.edu.ifpb.ads.pos.atv.xml.reader.model;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 23/10/2017, 21:08:40
 */
@XmlType(propOrder = {"numeroDeSerie", "geracao", "descricao"})
public class Processador {

    private String numeroDeSerie;
    private String geracao;
    private String descricao;

    public Processador() {
    }

    public Processador(String numeroDeSerie, String geracao, String descricao) {
        this.numeroDeSerie = numeroDeSerie;
        this.geracao = geracao;
        this.descricao = descricao;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getGeracao() {
        return geracao;
    }

    public void setGeracao(String geracao) {
        this.geracao = geracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Processador{" + "numeroDeSerie=" + numeroDeSerie + ", geracao=" + geracao + ", descricao=" + descricao + '}';
    }
    
}
