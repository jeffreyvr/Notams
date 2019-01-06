package input.source.adapter;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;


public class XmlInput {
    private File notamXmlFile = new File("pib.xml");

    public Document convertXmlToDocument(){
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document parsedXmlDocument =  dBuilder.parse(notamXmlFile);

            return parsedXmlDocument;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }




}
