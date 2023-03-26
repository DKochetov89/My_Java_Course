package web.xmltest;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.*;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

public class XMLTest {

    public static void main(String[] args) throws ParserConfigurationException, IOException,
            SAXException, XPathExpressionException {
        // Через фактори и билдер получаем доступ к документу DOM
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().
                parse(new File("simple.xml"));

        // Получаем возможность оперировать с элементами жокумента
        System.out.println(document.getDocumentElement().getTagName());

        // Через фактори и билдер получаем доступ к документу SAX
        DefaultHandler defaultHandler = new DefaultHandler() {
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                // new logic
                super.startElement(uri, localName, qName, attributes);
            }

            @Override
            public void endElement(String uri, String localName, String qName) throws SAXException {
                // new logic
                super.endElement(uri, localName, qName);
            }
        };

        // Получаем возможность оперировать с элементами жокумента
        SAXParserFactory.newInstance().newSAXParser().parse("simple.xml", defaultHandler);

        // Через фактори получаем доступ к определенным элементам по пути
        XPath xPath = XPathFactory.newInstance().newXPath();
        System.out.println(xPath.evaluate("/path/element", document));

        // через нодлист
        NodeList nodeList = (NodeList) xPath.evaluate("/path/element", document, XPathConstants.NODE);
        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println(nodeList.item(i));
        }
    }
}
