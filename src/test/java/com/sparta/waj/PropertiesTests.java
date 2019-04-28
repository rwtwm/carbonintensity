package com.sparta.waj;

import com.sparta.waj.utility.PropertiesReader;
import org.junit.Assert;
import org.junit.Test;

public class PropertiesTests
{
    @Test
    public void propertiesTest()
    {
        Assert.assertEquals(PropertiesReader.getFactorsUrl(),"api.carbonintensity.org.uk/intensity/factors");
    }

}
