package tutorial;

/*
 * 
 * Corrected XML

<?xml version="1.0" encoding="UTF-8"?>
<data>
   <username>admin</username>
   <password>12345</password>
   <interval>1</interval>
   <timeout>90</timeout>
   <startdate>29/07/2015</startdate>
   <enddate>06/01/2013</enddate>
   <ttime>1110</ttime>
</data>
 */

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class XmlReadUpdateWrite {

    public static void main(String argv[]) {

        try {
            String filepath = "file.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory
                    .newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);

            // Get the root element
            Node data= doc.getFirstChild();

            Node startdate = doc.getElementsByTagName("startdate").item(0);

            // I am not doing any thing with it just for showing you
            String currentStartdate = startdate.getNodeValue();

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date today = Calendar.getInstance().getTime();

            startdate.setTextContent(df.format(today));

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory
                    .newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filepath));
            transformer.transform(source, result);

            System.out.println("Done");

        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

