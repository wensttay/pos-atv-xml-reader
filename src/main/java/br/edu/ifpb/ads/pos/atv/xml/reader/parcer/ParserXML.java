package br.edu.ifpb.ads.pos.atv.xml.reader.parcer;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 23/10/2017, 21:08:23
 */
public interface ParserXML<T> {

    public void toXML(T obj);

    public T toObject();

}
