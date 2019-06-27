package com.example.bazibuhebashige.minerals;
import java.util.Arrays;

import java.lang.System;





public class products {
    String[] food = {"corn", "oats", "rice", "soybeans",
            "rapeseed", "wheat", "milk", "cocoa", "coffee",
            "cotton", "sugar", "bean", "orange"};
    String[] energy = {"oil", "gas", "ethanol", "propane"};
    String[] metal = {"copper", "lead", "zinc", "tin", "aluminium",
            "nickel", "cobalt", "molybdenum", "recycled steel"};
    String[] precious = {"gold", "platinum", "palladium", "silver",
            "diamond"};
    public static String[] alofthem = {"corn", "oats", "rice", "soybeans",
            "rapeseed", "wheat", "milk", "cocoa", "coffee",
            "cotton", "sugar", "bean", "orange", "oil", "gas", "ethanol", "propane", "copper", "lead", "zinc", "tin", "aluminium",
            "nickel", "cobalt", "molybdenum", "recycled steel", "gold", "platinum", "palladium", "silver",
            "diamond"};

    public static String[][] someofthem = {{"Silver, COMEX Silver Futures", "CHRIS/CME_SI1"}, {"Platinum, NYMEX Platinum Futures", "CHRIS/CME_PL1"},
            {"Gold, COMEX Gold Futures", "CHRIS/CME_GC1"}, {"Palladium, NYMEX Palladium Futures", "CHRIS/CME_PA1"},
            {"Aluminum, ODA", "ODA/PALUM_USD"}, {"Copper, ODA", "ODA/PCOPP_USD"},
            {"Copper Futures", "CHRIS/CME_HG1"}, {"Iron Ore, Tianjin (ODA)", "ODA/PIORECR_USD"},
            {"Lead, ODA", "ODA/PLEAD_USD"}, {"Nickel, ODA", "ODA/PNICK_USD"},
            {"Tin, ODA", "ODA/PTIN_USD"}, {"Zinc, ODA", "ODA/PZINC_USD"},
            {"", ""}, {"", ""},
            {"", ""}, {"", ""},
            {"", ""}, {"", ""},
            {"", ""}, {"", ""},
            {"", ""}, {"", ""},
            {"", ""}, {"", ""},
            {"", ""}, {"", ""},
            {"", ""}, {"", ""}

    };




    public static String dataCode(String pName){

        String data=null;
        for(int i=0;i<someofthem.length;i++){

            for(int j=0;j<2;j++){
                if(pName.equals(someofthem[i][0]))
                    data=someofthem[i][1];

            }
        }
        return data;
    }
}
