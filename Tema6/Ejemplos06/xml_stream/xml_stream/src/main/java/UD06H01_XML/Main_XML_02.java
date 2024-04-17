/*
 * Ahora vamos a hacer lo inverso-> cogeremos el docuemnto y lo leeremos
 */
package UD06H01_XML;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Admin
 */
public class Main_XML_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();//1 es lo mismo que en el ejemplo anterior
            DocumentBuilder builder = factory.newDocumentBuilder();//2igual que en el anterior, incluida la excepción
            
            Document documento = builder.parse("concesionario2.xml");//3 cojo el documento y la excepción de Bloque
            
            NodeList listaCoches = documento.getElementsByTagName("coche");//4 marco la etiqueta coche e importo paquetes
            
            for(int i=0; i<listaCoches.getLength(); i++){//5.recorremos los coches que hay-> también vale un for - each
                Node nodo = listaCoches.item(i);//6 con esto recogemos el nodo (importamos Node)
                if(nodo.getNodeType() == Node.ELEMENT_NODE){
                    Element e = (Element) nodo;//7 importamos y hacemos casting
                    NodeList hijos = e.getChildNodes(); //8 también necesitaremos sus hijos
                    for(int j=0; j<hijos.getLength(); j++){
                        Node hijo = hijos.item(j);
                        if(hijo.getNodeType() == Node.ELEMENT_NODE){//9hay nodos intermedios, de ahí la necesidad
                            //Element eHijo = (Element) hijo; en la siguiente línea cambiaría hijo por eHijo
                            System.out.println("Propiedad: " + hijo.getNodeName() +", valor:" + hijo.getTextContent());//10 ejecutando aquí veo que va tomando forma
                        }
                    }
                    System.out.println("");
                }
                
            }
            
            
            
        } catch (SAXException ex) {
            Logger.getLogger(Main_XML_02.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main_XML_02.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
}
