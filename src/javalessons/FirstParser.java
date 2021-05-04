package javalessons;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FirstParser {
    public static void main(String[] args){
        try {
            fromXmlToJacksonJava();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void fromXmlToJacksonJava() throws Exception {
        String url = "http://www.geoplugin.net/xml.gp?base_currency=USD";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        XmlMapper xmlMapper = new XmlMapper();
        GeoPlugin geoPlugin = xmlMapper.readValue(response.toString(), GeoPlugin.class);
        System.out.println(geoPlugin);
    }
}
