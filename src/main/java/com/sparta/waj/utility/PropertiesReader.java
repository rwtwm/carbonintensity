package com.sparta.waj.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader
{
    private static final String PROP_LOC ="resources/urlstrings.properties";
    private static final String BASE = "base_url";
    private static final String FACTORS = "factors";
    private static final String INTENSITY = "intensity";
    private static final String REGIONAL = "regional";

    private static String factorsUrl;
    private static String intensityUrl;
    private static String regionalUrl;


    public static String getFactorsUrl()
    {
        if (factorsUrl == null)
        {
            setup();
        }
        return factorsUrl;
    }

    public static String getIntensityUrl()
    {
        if (factorsUrl == null)
        {
            setup();
        }
        return intensityUrl;
    }

    public static String getRegionalUrl()
    {
        if (factorsUrl == null)
        {
            setup();
        }
        return regionalUrl;
    }

    private static void setup(){
        try
        {
            Properties properties = new Properties();
            properties.load(new FileReader(PROP_LOC));

            //TODO load the preference strings from the properties file.
            factorsUrl = properties.getProperty(BASE) + properties.getProperty(FACTORS);
            intensityUrl = properties.getProperty(BASE) + properties.getProperty(INTENSITY);
            regionalUrl = properties.getProperty(BASE) + properties.getProperty(REGIONAL);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
