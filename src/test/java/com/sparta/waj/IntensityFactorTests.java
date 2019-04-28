package com.sparta.waj;

import com.sparta.waj.datatransfer.deserialisers.IntensityFactorDeserialiser;
import com.sparta.waj.utility.Utility;
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
        ifJson = Utility.fileToString(STUB_LOC);
    }

    @Test
    public void intensityLoad()
    {
        IntensityFactorDeserialiser deserialiser = new IntensityFactorDeserialiser(ifJson);
        System.out.println(deserialiser.getIntensityFactorDTO().getDutchImports());
    }

}
