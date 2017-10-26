package br.edu.ifpb.ads.pos.atv.xml.reader.parcer;

import br.edu.ifpb.ads.pos.atv.xml.reader.model.Computador;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 23/10/2017, 21:08:23
 */
public class ParserJAXB implements ParserXML<Computador> {

    File computadorXsd = new File("src/main/java/br/edu/ifpb/ads/pos/atv/xml/reader"
            + "/files/computador.xsd");
    File outputFile = new File("src/main/java/br/edu/ifpb/ads/pos/atv/xml/reader"
            + "/files/outputFile.xml");
    
    @Override
    public Computador toObject(File computadorXmlFile) {

        try {
            SchemaFactory schemaFactory = SchemaFactory
                    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory
                    .newSchema(computadorXsd);

            JAXBContext jaxbContext = JAXBContext.newInstance(Computador.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            unmarshaller.setSchema(schema);

            Computador computador = (Computador) unmarshaller.unmarshal(computadorXmlFile);
            System.out.println(computador);

            return computador;
        } catch (JAXBException | SAXException e) {
            Logger.getLogger(ParserJAXB.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return null;
    }

    @Override
    public void toXML(Computador computador) {
        try {
            
            JAXBContext jaxbContext = JAXBContext.newInstance(Computador.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION,
                    "http://www.w3schools.com computador.xsd");

            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(computadorXsd);
            marshaller.setSchema(schema);

            marshaller.marshal(computador, outputFile);
            marshaller.marshal(computador, System.out);

        } catch (JAXBException | SAXException e) {
            Logger.getLogger(ParserJAXB.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
