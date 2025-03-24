package ungdung;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XMLService {
    private static final String FILE_NAME = "data.xml";

    // Tạo mới file XML nếu chưa có
    public static void createXMLFile() {
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) return;

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            Element rootElement = doc.createElement("root");
            doc.appendChild(rootElement);

            saveXML(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Đọc danh sách thẻ XML
    public static String readXML() {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) return "File XML chưa tồn tại.";

            Document doc = getDocument();
            NodeList nodeList = doc.getElementsByTagName("element");

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                String name = element.getAttribute("name");
                String content = element.getTextContent();
                result.append("[").append(name).append("]: ").append(content).append("\n");
            }
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "Lỗi khi đọc file XML.";
        }
    }

    // Thêm thẻ XML
    public static void addElement(String name, String content) {
        try {
            Document doc = getDocument();
            Element root = doc.getDocumentElement();

            Element newElement = doc.createElement("element");
            newElement.setAttribute("name", name);
            newElement.setTextContent(content);

            root.appendChild(newElement);
            saveXML(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Cập nhật thẻ XML
    public static void updateElement(String name, String newContent) {
        try {
            Document doc = getDocument();
            NodeList nodeList = doc.getElementsByTagName("element");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                if (element.getAttribute("name").equals(name)) {
                    element.setTextContent(newContent);
                    break;
                }
            }
            saveXML(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Xóa thẻ XML
    public static void deleteElement(String name) {
        try {
            Document doc = getDocument();
            NodeList nodeList = doc.getElementsByTagName("element");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                if (element.getAttribute("name").equals(name)) {
                    element.getParentNode().removeChild(element);
                    break;
                }
            }
            saveXML(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Load file XML
    private static Document getDocument() throws Exception {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        return dBuilder.parse(new File(FILE_NAME));
    }

    // Lưu file XML
    private static void saveXML(Document doc) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(FILE_NAME));
        transformer.transform(source, result);
    }
}

