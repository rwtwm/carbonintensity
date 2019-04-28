package com.sparta.waj.htmlmanagement;

import com.sparta.waj.utility.PropertiesReader;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpManager
{
    CloseableHttpResponse response;
    CloseableHttpClient client;

    public HttpManager()
    {
        client = HttpClients.createDefault();
    }

    public String getIntensityFactor()
    {
        HttpGet getFactors = new HttpGet(PropertiesReader.getFactorsUrl());
        updateResponse(getFactors);
        return getResponseBody();
    }

    public String getIntensity()
    {
        HttpGet getIntensity = new HttpGet(PropertiesReader.getIntensityUrl());
        updateResponse(getIntensity);
        return getResponseBody();
    }

    public String getRegional()
    {
        HttpGet getRegional = new HttpGet(PropertiesReader.getRegionalUrl());
        updateResponse(getRegional);
        return getResponseBody();
    }

    private void updateResponse(HttpGet messageTarget)
    {
        try
        {
            response = client.execute(messageTarget);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private String getResponseBody()
    {
        String responseBody = null;

        try
        {
            responseBody = EntityUtils.toString(response.getEntity());
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        return responseBody;
    }

    public void close()
    {
        try
        {
            response.close();
            client.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }


}
