package com.sparta.waj.datatransfer.dtos;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.Map;

public class IntensityFactorDTO
{
    private Map<String, Object>[] data;
    private int biomass;
    private int coal;
    private int dutchImports;
    private int gasCombined;
    private int gasOpen;
    private int hydro;
    private int irishImports;
    private int nuclear;
    private int oil;
    private int other;
    private int pumpedStorage;
    private int solar;
    private int wind;

    @JsonGetter("data")
    public Map<String, Object>[] getData()
    {
        return data;
    }

    @JsonGetter("Biomass")
    public int getBiomass()
    {
        return (int) data[0].get("Biomass");
    }

    @JsonGetter("Coal")
    public int getCoal()
    {
        return (int) data[0].get("Coal");
    }

    @JsonGetter("Dutch Imports")
    public int getDutchImports()
    {
        return (int) data[0].get("Dutch Imports");
    }

    @JsonGetter("Gas (Combined Cycle)")
    public int getGasCombined()
    {
        return (int) data[0].get("Gas (Combined Cycle)");
    }

    @JsonGetter("Gas (Open Cycle)")
    public int getGasOpen()
    {
        return (int) data[0].get("Gas (Open Cycle)");
    }

    @JsonGetter("Hydro")
    public int getHydro()
    {
        return (int) data[0].get("Hydro");
    }

    @JsonGetter("Irish Imports")
    public int getIrishImports()
    {
        return (int) data[0].get("Irish Imports");
    }

    @JsonGetter("Nuclear")
    public int getNuclear()
    {
        return (int) data[0].get("Nuclear");
    }

    @JsonGetter("Oil")
    public int getOil()
    {
        return (int) data[0].get("Oil");
    }

    @JsonGetter("Other")
    public int getOther()
    {
        return (int) data[0].get("Other");
    }

    @JsonGetter("Pumped Storage")
    public int getPumpedStorage()
    {
        return (int) data[0].get("Pumped Storage");
    }

    @JsonGetter("Solar")
    public int getSolar()
    {
        return (int) data[0].get("Solar");
    }

    @JsonGetter("Wind")
    public int getWind()
    {
        return (int) data[0].get("Wind");
    }
}
