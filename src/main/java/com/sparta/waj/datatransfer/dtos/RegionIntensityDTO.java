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

    public Map<String, Object>[] getGenerationMix(int period)
    {
        return (Map<String, Object>[]) getHalfHourlyData().get(period).get("generationmix");
    }

    public int findMixIndex(String mixType, int period)
    {
        int i = 0;
        for (Map mixMap: getGenerationMix(period))
        {
            if (mixMap.get("fuel") == mixType){
                return i;
            }
            i++;
        }

        return -1;
    }


}
