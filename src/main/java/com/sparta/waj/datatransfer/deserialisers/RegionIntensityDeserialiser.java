package com.sparta.waj.datatransfer.deserialisers;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.waj.datatransfer.dtos.RegionIntensityDTO;

import java.io.IOException;

public class RegionIntensityDeserialiser
{
    private RegionIntensityDTO regIntDTO;

    public RegionIntensityDeserialiser(String inputString)
    {
        ObjectMapper mapper = new ObjectMapper();

        try
        {
            regIntDTO = mapper.readValue(inputString, RegionIntensityDTO.class);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public RegionIntensityDTO getDTO()
    {
        return regIntDTO;
    }

}
