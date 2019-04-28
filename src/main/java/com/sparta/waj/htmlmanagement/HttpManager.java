package com.sparta.waj.htmlmanagement;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

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
        return "";
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
