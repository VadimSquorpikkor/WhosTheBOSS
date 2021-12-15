package com.squorpikkor.app.whostheboss;

import android.util.Log;

import io.reactivex.internal.operators.flowable.FlowableGenerate;

public class Utils {
    public static int convert(int...dev) {
        int category = 0;
        for (int cat:dev) category+=cat;
        return category;
    }

    public static int getSmallImage(String name) {
        String add = "";
        if (name.contains("_2")) add = "_2";
        name = name.replace("_2", "");

        name = name.toLowerCase();
        name = name.replace("-", "_");
        name = name+"_small";

        name = name+add;

        int resID = getResId(name, "drawable");
        if (resID==0) return R.drawable.no_img;
        return resID;
    }

    public static int getBigImage(String name) {
        String add = "";
        if (name.contains("_2")) add = "_2";
        name = name.replace("_2", "");

        name = name.toLowerCase();
        name = name.replace("-", "_");

        name = name+add;

        int resID = getResId(name, "drawable");
        if (resID==0) return R.drawable.no_img;
        return resID;
    }

    public static String getDescriptionResource(String name) {
        name = name.toLowerCase();
        name = name.replace("-", "_");

        Log.e("TAG", "getDescriptionResource: "+name);

        int resID = getResId(name, "string");

        if (resID==0) return "";
        return App.getContext().getString(resID);
    }

    private static int getResId(String name, String resType) {
        return App.getContext().getResources().getIdentifier(name, resType, App.getContext().getPackageName());
    }
}
