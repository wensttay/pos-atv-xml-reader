package br.edu.ifpb.ads.pos.atv.xml.reader;

import br.edu.ifpb.ads.pos.atv.xml.reader.model.Computador;
import br.edu.ifpb.ads.pos.atv.xml.reader.model.Processador;
import br.edu.ifpb.ads.pos.atv.xml.reader.parcer.ParserXML;
import br.edu.ifpb.ads.pos.atv.xml.reader.parcer.ParserXstream;
import java.io.File;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 23/10/2017, 21:16:11
 */
public class Main {

    public static void main(String[] args) {
        File computadorXmlFile = new File("src/main/java/br/edu/ifpb/ads/pos/atv/xml/reader"
                + "/files/computador.xml");
        
        Processador processador = new Processador("2001", "Quinta", "Potente");
        Computador computador = new Computador("Apple", "X1", "Black", processador);

//        ParserXML parser = new ParserJAXB();
        ParserXML parser = new ParserXstream();

        parser.toXML(computador);
        parser.toObject(computadorXmlFile);
    }
}
