package com.si5a.findhighschool;

import java.util.ArrayList;

public class DataSMA {

    public static String [][] data = new String[][]{
            {"SMA Negeri 6 Palembang","sma negeri 6 adalah sma yang berada dibanlaaj","https://upload.wikimedia.org/wikipedia/id/thumb/b/b1/Sma6New.png/225px-Sma6New.png","2.963964",",104.766511"
            }
    };

    public static ArrayList<ModelSMA>
    ambilDataSMA(){
        ArrayList<ModelSMA> dataSMA = new ArrayList<>();
        for(String[] varData : data){
            ModelSMA model = new ModelSMA();
            model.setNama(varData[0]);
            model.setTentang(varData[1]);
            model.setFoto(varData[2]);
            model.setLatitude(varData[3]);
            model.setLongitude(varData[4]);

            dataSMA.add(model);
        }
        return dataSMA;
    }
}
