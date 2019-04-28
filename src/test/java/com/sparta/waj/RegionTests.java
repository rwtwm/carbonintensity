package com.sparta.waj;

import com.sparta.waj.datatransfer.deserialisers.RegionIntensityDeserialiser;
import com.sparta.waj.datatransfer.dtos.RegionIntensityDTO;
import com.sparta.waj.htmlmanagement.HttpManager;
import org.junit.Test;

public class RegionTests
{

    @Test
    public void regIntTest(){

        HttpManager manager = new HttpManager();
        String testJsonSting =  manager.getRegional("2019-01-04");
        RegionIntensityDeserialiser deserialiser = new RegionIntensityDeserialiser(testJsonSting);
        deserialiser.getDTO().getData();
        deserialiser.getDTO().getHalfHourlyData();
        System.out.println(deserialiser.getDTO().getIntensityVal(4));

    }
}
