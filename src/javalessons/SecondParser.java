package javalessons;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SecondParser {

    public static void main(String[] args) {
        try {
            fromXmlToJacksonJavaClass();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void fromXmlToJacksonJavaClass() throws IOException {
        String url = "http://www.geoplugin.net/xml.gp?ip=212.112.126.196";
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
        Parser parser = xmlMapper.readValue(response.toString(), Parser.class);
        System.out.println(parser);
    }
}
