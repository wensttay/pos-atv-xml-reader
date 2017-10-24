package br.edu.ifpb.ads.pos.atv.xml.reader.parcer;

import br.edu.ifpb.ads.pos.atv.xml.reader.model.Computador;
import br.edu.ifpb.ads.pos.atv.xml.reader.model.Processador;
import com.thoughtworks.xstream.XStream;
import java.io.File;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 23/10/2017, 21:08:23
 */
public class ParserXstream implements ParserXML<Computador> {
    
    File computadorXml = new File("src/main/java/br/edu/ifpb/ads/pos/atv/xml/reader"
            + "/parcer/examples/computador.xml");
    
    private final XStream stream;

    public ParserXstream() {
        this.stream = new XStream();
        this.stream.alias("computador", Computador.class);
        this.stream.alias("processador", Processador.class);
    }
    
    @Override
    public Computador toObject() {
        File file = computadorXml;
        Computador computador = (Computador) stream.fromXML(file);
        System.out.println(computador);
        return computador;
    }

    @Override
    public void toXML(Computador computador) {
        String toXML = stream.toXML(computador);
        System.out.println(toXML);
    }
}
