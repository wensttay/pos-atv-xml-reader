package br.edu.ifpb.ads.pos.atv.xml.reader.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 23/10/2017, 21:08:23
 */
@XmlType(propOrder = {"marca", "modelo", "cor", "processador"})
@XmlRootElement(name = "computador")
public class Computador {

    private String marca;
    private String modelo;
    private String cor;
    private Processador processador;

    public Computador() {
        processador = new Processador();
    }

    public Computador(String marca, String modelo, String cor, Processador processador) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.processador = processador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "Computador{" + "marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", processador=" + processador + '}';
    }
    
}
