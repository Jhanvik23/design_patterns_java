package Structural_Pattern.Adapter_Pattern;

public class AdapterTest {
    public static void main(String[] args) {
        JsonDataProvider jsonData = new JsonDataProvider();
        XmlDataProvider xmlAdapter = new JsonToXmlAdapter(jsonData);

        System.out.println(xmlAdapter.getXmlData());
    }
}
