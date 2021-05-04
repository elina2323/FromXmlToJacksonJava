package javalessons;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "geoPlugin")
public class Parser {
    @JacksonXmlProperty(localName = "geoplugin_request")
    private String request;
    @JacksonXmlProperty(localName = "geoplugin_status")
    private long status;
    @JacksonXmlProperty(localName = "geoplugin_delay")
    private String delay;
    @JacksonXmlProperty(localName = "geoplugin_credit")
    private String credit;
    @JacksonXmlProperty(localName = "geoplugin_city")
    private String city;
    @JacksonXmlProperty(localName = "geoplugin_region")
    private String region;
    @JacksonXmlProperty(localName = "geoplugin_regionCode")
    private String regionCode;
    @JacksonXmlProperty(localName = "geoplugin_regionName")
    private String regionName;
    @JacksonXmlProperty(localName = "geoplugin_areaCode")
    private String areaCode;
    @JacksonXmlProperty(localName = "geoplugin_dmaCode")
    private String dmaCode;
    @JacksonXmlProperty(localName = "geoplugin_countryCode")
    private String countryCode;
    @JacksonXmlProperty(localName = "geoplugin_countryName")
    private String countryName;
    @JacksonXmlProperty(localName = "geoplugin_inEU")
    private int inEu;
    @JacksonXmlProperty(localName = "geoplugin_euVATrate")
    private long euVatRate;
    @JacksonXmlProperty(localName = "geoplugin_continentCode")
    private String continentCode;
    @JacksonXmlProperty(localName = "geoplugin_continentName")
    private String continentName;
    @JacksonXmlProperty(localName = "geoplugin_latitude")
    private double latitude;
    @JacksonXmlProperty(localName = "geoplugin_longitude")
    private double longitude;
    @JacksonXmlProperty(localName = "geoplugin_locationAccuracyRadius")
    private int locationAccuracyRadius;
    @JacksonXmlProperty(localName = "geoplugin_timezone")
    private String timezone;
    @JacksonXmlProperty(localName = "geoplugin_currencyCode")
    private String currencyCode;
    @JacksonXmlProperty(localName = "geoplugin_currencySymbol")
    private String currencySymbol;
    @JacksonXmlProperty(localName = "geoplugin_currencySymbol_UTF8")
    private String currencySymbol_UTF8;
    @JacksonXmlProperty(localName = "geoplugin_currencyConverter")
    private double currencyConverter;

    public Parser() {
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getDmaCode() {
        return dmaCode;
    }

    public void setDmaCode(String dmaCode) {
        this.dmaCode = dmaCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getInEu() {
        return inEu;
    }

    public void setInEu(int inEu) {
        this.inEu = inEu;
    }

    public long getEuVatRate() {
        return euVatRate;
    }

    public void setEuVatRate(long euVatRate) {
        this.euVatRate = euVatRate;
    }

    public String getContinentCode() {
        return continentCode;
    }

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getLocationAccuracyRadius() {
        return locationAccuracyRadius;
    }

    public void setLocationAccuracyRadius(int locationAccuracyRadius) {
        this.locationAccuracyRadius = locationAccuracyRadius;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getCurrencySymbol_UTF8() {
        return currencySymbol_UTF8;
    }

    public void setCurrencySymbol_UTF8(String currencySymbol_UTF8) {
        this.currencySymbol_UTF8 = currencySymbol_UTF8;
    }

    public double getCurrencyConverter() {
        return currencyConverter;
    }

    public void setCurrencyConverter(double currencyConverter) {
        this.currencyConverter = currencyConverter;
    }

    @Override
    public String toString() {
        return "Parser{" + '\n' +
                " request: " + request + '\n' +
                " status: " + status + '\n' +
                " delay: " + delay + '\n' +
                " credit: " + credit + '\n' +
                " city: " + city + '\n' +
                " region: " + region + '\n' +
                " regionCode: " + regionCode + '\n' +
                " regionName: " + regionName + '\n' +
                " areaCode: " + areaCode + '\n' +
                " dmaCode: " + dmaCode + '\n' +
                " countryCode: " + countryCode + '\n' +
                " countryName: " + countryName + '\n' +
                " inEu: " + inEu + "\n" +
                " euVatRate: " + euVatRate + "\n" +
                " continentCode: " + continentCode + '\n' +
                " continentName: " + continentName + '\n' +
                " latitude: " + latitude + "\n" +
                " longitude: " + longitude + "\n" +
                " locationAccuracyRadius: " + locationAccuracyRadius + "\n" +
                " timezone: " + timezone + '\n' +
                " currencyCode: " + currencyCode + '\n' +
                " currencySymbol: " + currencySymbol + '\n' +
                " currencySymbol_UTF8: " + currencySymbol_UTF8 + '\n' +
                " currencyConverter: " + currencyConverter +
                '}';
    }
}
