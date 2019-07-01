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
            {"Lead, ODA", "ODA/PLEAD_USD"},{"Cobalt, LME", "LME/PR_CO"},
            {"Iridium", "JOHNMATT/IRID"},{"Rhodium", "JOHNMATT/RHOD"},
            {"Ruthenium", "JOHNMATT/RUTH"}, {"Nickel, ODA", "ODA/PNICK_USD"},
            {"Tin, ODA", "ODA/PTIN_USD"}, {"Zinc, ODA", "ODA/PZINC_USD"},
            {"Barley, Western Canada (ODA)", "ODA/PBARL_USD"}, {"Corn, CBOT Corn Futures", "CHRIS/CME_C1"},
            {"Oats, CBOT Oats Futures", "CHRIS/CME_O1"}, {"Rice, Thailand (ODA)", "ODA/PRICENPQ_USD"},
            {"Rice, CBOT Rice Futures", "CHRIS/CME_RR1"}, {"Soybean, CBOT Soybean Futures", "CHRIS/CME_S1"},
            {"Soybean, CBOT Soybean Meal Futures", "CHRIS/CME_SM1"}, {"Wheat, CBOT Soybean Oil Futures", "CHRIS/CME_BO1"},
            {"Wheat, Gulf of Mexico", "ODA/PWHEAMT_USD"}, {"Wheat, CBOT Wheat Futures", "CHRIS/CME_W1"},
            {"Dairy, CME Milk Futures", "CHRIS/CME_DA1"}, {"Cattle, Beef (ODA)", "ODA/PBEEF_USD"},
            {"Cattle, CME Live Cattle Futures", "CHRIS/CME_LC1"}, {"Poulty, Chicken, Georgia (ODA)", "ODA/PPOULT_USD"},
            {"Pork, Pork, Chicago (ODA)", "ODA/PPORK_USD"}, {"Pork, CME Lean Hog Futures", "CHRIS/CME_LN1"},
            {"Fats, Lamb", "ODA/PLAMB_USD"}, {"Wool", "ODA/PWOOLC_USD"},
            {"Salmon", "ODA/PSALM_USD"}, {"Shrimp", "ODA/PSHRI_USD"},
            {"Fishmeal", "ODA/PFISH_USD"}, {"NYMEX RBOB Gasoline Futures", "CHRIS/CME_RB1"},
            {"NYMEX Crude Oil Futures", "CHRIS/CME_CL1"}, {"ICE Brent Crude Oil Futures", "CHRIS/ICE_B1"},
            {"Dubai Crude Oil", "ODA/POILDUB_USD"}, {"Brent Crude Oil", "ODA/POILBRE_USD"},
            {"US All Grades Conventional Gas", "FRED/GASALLCOVW"}, {"Conventional Gasolines: U.S. Gulf Coast, Regular", "FRED/DGASUSGULF"},
            {"US Premium Conventional Gas", "FRED/GASPRMCOVW"}, {"NYMEX Natural Gas Futures", "CHRIS/CME_NG1"},
            {"ICE UK Natural Gas Futures", "CHRIS/ICE_M1"}, {"Coal", "ODA/PCOALAU_USD"},
            {"Arabica Coffee", "ODA/PCOFFOTM_USD"}, {"Robusta Coffee", "ODA/PCOFFROB_USD"},
            {"Coffee Futures", "CHRIS/ICE_KC1"}, {"Cocoa beans", "ODA/PCOCO_USD"},
            {"Cocoa Futures", "CHRIS/ICE_CC1"}, {"Tea", "ODA/PTEA_USD"},
            {"US Imports Sugar", "US Imports Sugar"}, {"Groundnuts (Peanuts)", "ODA/PGNUTS_USD"},
            {"Oranges", "ODA/PORANG_USD"}, {"Orange Juice Futures", "CHRIS/ICE_OJ1"},
            {"Bananas", "ODA/PBANSOP_USD"}, {"Olive Oil", "ODA/POLVOIL_USD"},
            {"Rapeseed Oil", "ODA/PROIL_USD"},{"Sunflower Oil", "ODA/PSUNO_USD"},
            {"Palm Oil", "ODA/PPOIL_USD"},{"Hard Logs", "ODA/PLOGSK_USD"},
            {"Soft Logs", "ODA/PLOGORE_USD"},{"Soft Sawnwood", "ODA/PSAWORE_USD"},
            {"Hard Sawnwood", "ODA/PSAWMAL_USD"},{"Lumber Futures", "CHRIS/CME_LB1"},
            {"Rubber", "ODA/PRUBB_USD"},{"Cotton", "ODA/PCOTTIND_USD"}



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
