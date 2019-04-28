package com.sparta.waj.datatransfer.dtos;

import java.util.List;
import java.util.Map;

/**
 * Currently only runs on the London region, but should work for any individual region
 */
public class RegionIntensityDTO
{
    private Map<String, Object> data;
    private List<Map> halfHourlyData;

    public Map<String, Object> getData()
    {
        return data;
    }

    public List<Map> getHalfHourlyData()
    {
        return (List<Map>) data.get("data");
    }

    public Map<String, Object> getIntensity(int period)
    {
        return (Map<String, Object>) getHalfHourlyData().get(period).get("intensity");
    }

    public int getIntensityVal(int period)
    {
        return (int) getIntensity(period).get("forecast");
    }


}
