package org.iesfm.service;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;




public class XmlService {

    public void serializarXml(Map<String, String> capitales) {
        try(StringWriter sw = new StringWriter()) {
            Document doc = getDocument();
            Element ciudades = doc.createElement("ciudades");
            doc.appendChild(ciudades);
            for (Map.Entry<String, String> entry : capitales.entrySet()) {
                Element ciudad = doc.createElement("ciudad");
                ciudad.setAttribute("pais", entry.getKey());
                ciudad.appendChild(doc.createTextNode(entry.getValue()));
                ciudades.appendChild(ciudad);
            }
            DOMSource domSource = new DOMSource(doc);
            Transformer transformer = getTransformer();
            StreamResult sr = new StreamResult(sw);
            transformer.transform(domSource, sr);
            System.out.println(sw.toString());
        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }

    private Transformer getTransformer() throws TransformerConfigurationException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        transformerFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, ""); // Compliant
        transformerFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, ""); // Compliant
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        return transformer;
    }

    private Document getDocument() throws ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, ""); // Compliant
        dbf.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, ""); // Compliant
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();
        doc.setXmlVersion("1.0");
        return doc;
    }
}
