package com.sparta.waj;

import com.sparta.waj.utility.PropertiesReader;
import org.junit.Assert;
import org.junit.Test;

public class PropertiesTests
{
    @Test
    public void factorsTest()
    {
        Assert.assertEquals(PropertiesReader.getFactorsUrl(),"api.carbonintensity.org.uk/intensity/factors");
    }

    @Test
    public void intensityTest()
    {
        Assert.assertEquals(PropertiesReader.getIntensityUrl(), "api.carbonintensity.org.uk/intensity/");
    }

    @Test
    public void regionalTest()
    {
        Assert.assertEquals(PropertiesReader.getRegionalUrl(), "api.carbonintensity.org.uk/regional/intensity/");
    }




}
