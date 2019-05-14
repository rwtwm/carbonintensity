package com.sparta.waj;

import com.sparta.waj.utility.PropertiesReader;
import org.junit.Assert;
import org.junit.Test;

public class PropertiesTests
{
    @Test
    public void factorsTest()
    {
        Assert.assertEquals(PropertiesReader.getFactorsUrl(),"http://api.carbonintensity.org.uk/intensity/factors");
    }

    @Test
    public void intensityTest()
    {
        Assert.assertEquals(PropertiesReader.getIntensityUrl(), "http://api.carbonintensity.org.uk/intensity/");
    }






}
