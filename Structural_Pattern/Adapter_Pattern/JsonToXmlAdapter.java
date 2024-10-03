package Structural_Pattern.Adapter_Pattern;

public class JsonToXmlAdapter implements XmlDataProvider {
    private JsonDataProvider jsonDataProvider;

    public JsonToXmlAdapter(JsonDataProvider jsonDataProvider) {
        this.jsonDataProvider = jsonDataProvider;
    }

    @Override
    public String getXmlData() {
        String json = jsonDataProvider.getJsonData();

        // Simple manual parsing assuming the JSON structure is known and fixed
        String name = json.substring(json.indexOf("\"name\":") + 8, json.indexOf("\",", json.indexOf("\"name\":")));
        String status = json.substring(json.indexOf("\"status\":") + 10, json.lastIndexOf("\""));

        return "<data><name>" + name + "</name><status>" + status + "</status></data>";
    }
}
