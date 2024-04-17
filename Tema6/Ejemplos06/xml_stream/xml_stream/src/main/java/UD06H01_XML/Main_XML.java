/*
 * queremos crear un xml concesionario que almacenará información relativa a coches
-tenemos concesionario-> 
    coche->
        matricula->
        marca->
        precio->
-
 */
package UD06H01_XML;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Admin
 */
public class Main_XML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException, TransformerException {//0 las excepciones se irán añadiendo
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();//1 -> importo los paquetes que me pide
        DocumentBuilder builder = factory.newDocumentBuilder();//2 -> importo paquetes y además exception
        DOMImplementation implementation = builder.getDOMImplementation();//3
        
        
        
        Document documento = implementation.createDocument(null, "concesionario", null); //4 hay qie importar el paquete del org
        //hemos puesto dos parámetros a null porque no los necesitamos
        documento.setXmlVersion("1.0");//5 elegimos la versión
        
        Element coches = documento.createElement("coches");//6 hemos creado la etiqueta XML e importo el paquete del org
        Element coche = documento.createElement("coche");//6.1
        
        Element matricula = documento.createElement("matricula");//6.2 hemos creado la etiqueta XML
        
        Text textMatricula = documento.createTextNode("1111AAA");//6.2.1 le ponemos texto (es decir, el valor de la matrícula) e importamos el org
        matricula.appendChild(textMatricula);//6.2.1.1 añadimos a matrícula un appendChild que es el valor de la matrícula
        coche.appendChild(matricula);//6.2.1.1. añadimos al coche la etiqueta matricula
        
        
        Element marca = documento.createElement("marca");//6.3 hemos creado la etiqueta XML
         Text textMarca = documento.createTextNode("Audi");//6.3.1 le ponemos texto (es decir, el nombre de la marca)
        marca.appendChild(textMarca);//6.3.1.1 añadimos a la marca un appendChild que es la marca del coche
        coche.appendChild(marca);//6.3.1.1. añadimos al coche la etiqueta marca

        
        Element precio = documento.createElement("precio");//6.4 hemos creado la etiqueta XML
         Text textPrecio = documento.createTextNode("30000");//6.4.1 le ponemos texto (es decir, el precio)
        precio.appendChild(textPrecio);//6.2.1.1 añadimos a precio un appendChild que es el precio del coche
        coche.appendChild(precio);//6.2.1.1. añadimos al coche la etiqueta precio

        
        coches.appendChild(coche);//7 añadimos el coche-> no está en el documento
        
        documento.getDocumentElement().appendChild(coches); //8 ahora sí está en el documento. falta crearlo
        
        Source source = new DOMSource(documento);//9 importamos paquetes (y ojo al new)
        
        Result result = new StreamResult(new File("concesionario.xml"));//10 creamos el fichero concesionario.xml (importamos varios paquetes)
        
        Transformer transformer = TransformerFactory.newInstance().newTransformer();//11 tenemos otra excepcion en el main
        transformer.transform(source, result);//12 ejecuto y si todo ha ido bien me sale BUILD SUCCESS y habrá aparecido concesionario.xml
        
        //13 sale en una única línea-> clic derecho -> Format lo pone legible
        
    }
    
}
