package com.sparta.waj.datatransfer.deserialisers;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.waj.datatransfer.dtos.IntensityFactorDTO;

import java.io.IOException;

public class IntensityFactorDeserialiser
{
    private IntensityFactorDTO intensityFactorDTO;

    public IntensityFactorDeserialiser(String inputString)
    {
        ObjectMapper ifMapper = new ObjectMapper();

        try
        {
            intensityFactorDTO = ifMapper.readValue(inputString, IntensityFactorDTO.class);
        } catch (IOException e)
        {
            e.printStackTrace();
        }


    }

    public IntensityFactorDTO getIntensityFactorDTO()
    {
        return intensityFactorDTO;
    }
}
