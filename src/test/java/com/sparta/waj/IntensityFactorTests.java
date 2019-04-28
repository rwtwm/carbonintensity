package com.sparta.waj;

import com.sparta.waj.datatransfer.deserialisers.IntensityFactorDeserialiser;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class IntensityFactorTests
{
    private static final String STUB_LOC = "resources/intensityfactorsdemo.json";
    private String ifJson;

    @Before
    public void getJsonString()
    {
        File inputFile = new File(STUB_LOC);
        ifJson = inputFile.toString();
        System.out.println(ifJson);
    }

    @Test
    public void intensityLoad()
    {

        IntensityFactorDeserialiser deserialiser = new IntensityFactorDeserialiser(ifJson);
    }

}
