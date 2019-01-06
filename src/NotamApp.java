import input.source.adapter.XmlInput;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.util.ArrayList;
import java.util.List;

public class NotamApp {

    public List<Notam> createNotamList(){
        XmlInput xmlNotamFile = new XmlInput();
        Document notamDocument = xmlNotamFile.convertXmlToDocument();
        NodeList nList = notamDocument.getElementsByTagName("Notam");
        List<Notam> notamList = new ArrayList<Notam>();

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            Element eElement = (Element) nNode;

            String number = eElement.getElementsByTagName("Series").item(0).getTextContent() + eElement.getElementsByTagName("Number").item(0).getTextContent()
                    + "/" + eElement.getElementsByTagName("Year").item(0).getTextContent();
            String lowerAltitude = eElement.getElementsByTagName("Lower").item(0).getTextContent();
            String upperAltitude = eElement.getElementsByTagName("Upper").item(0).getTextContent();
            String notamDescription = eElement.getElementsByTagName("ItemE").item(0).getTextContent();
            String startDate = eElement.getElementsByTagName("StartValidity").item(0).getTextContent();
            String endDate = eElement.getElementsByTagName("EndValidity").item(0).getTextContent();
            String trafficType = eElement.getElementsByTagName("Traffic").item(0).getTextContent();
            String coordinates = eElement.getElementsByTagName("Coordinates").item(0).getTextContent();
            String radius = eElement.getElementsByTagName("Radius").item(0).getTextContent();
            String notamType = eElement.getElementsByTagName("Scope").item(0).getTextContent();

            Notam notam = new Notam(number,notamDescription,upperAltitude,lowerAltitude,coordinates,startDate,endDate,radius,notamType,trafficType);

            notamList.add(notam);
        }

        return notamList;
    }
}
