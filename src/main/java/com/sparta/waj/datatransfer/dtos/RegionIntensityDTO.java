package com.sparta.waj.datatransfer.dtos;

import java.util.Map;

/**
 * Currently only runs on the London region, but should work for any individual region
 */
public class RegionIntensityDTO
{
    private Map<String, Object>[] data;

    public Map<String, Object>[] getData()
    {
        return data;
    }
}
