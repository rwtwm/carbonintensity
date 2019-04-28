package com.sparta.waj;

import com.sparta.waj.datatransfer.deserialisers.IntensityFactorDeserialiser;
import com.sparta.waj.htmlmanagement.HttpManager;
import org.junit.Assert;
import org.junit.Test;

public class HTTPIntTests
{
    @Test
    public void intFactE2ETest()
    {
        HttpManager manager = new HttpManager();
        IntensityFactorDeserialiser ifDeserialiser = new IntensityFactorDeserialiser(manager.getIntensityFactor());

        Assert.assertTrue(ifDeserialiser.getIntensityFactorDTO().getCoal() > -1);
        manager.close();
    }


}
