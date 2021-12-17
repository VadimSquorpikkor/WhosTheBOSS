package com.squorpikkor.app.whostheboss;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SaveLoad {
    //TODO может всё хранить в PreferenceManager.getDefaultSharedPreferences? Надо почитать, в чем разница
    static SharedPreferences mPrefPrivate = App.getContext().getSharedPreferences("pref", Context.MODE_PRIVATE);
    static SharedPreferences mPrefManager = PreferenceManager.getDefaultSharedPreferences(App.getContext());

    public static SharedPreferences getPreferences() {
        return mPrefManager;
    }

    /**Сохранение по ключу*/
    public static void save(String key, int param) {
        mPrefPrivate.edit().putInt(key, param).apply();
    }

    public static void savePref(String key, String param) {
        mPrefManager.edit().putString(key, param).apply();
    }

    public static void savePref(String key, boolean param) {
        mPrefManager.edit().putBoolean(key, param).apply();
    }

    public static void savePref(int keyId, int param) {
        String key = App.getContext().getString(keyId);
        mPrefManager.edit().putString(key, String.valueOf(param)).apply();
    }

    public static void save(String key, float param) {
        mPrefPrivate.edit().putFloat(key, param).apply();
    }

    public static void save(String key, boolean param) {
        mPrefPrivate.edit().putBoolean(key, param).apply();
    }

    /**Загрузка String по ключу*/
    public static String loadString(String key) {
        if (mPrefPrivate.contains(key)) return mPrefPrivate.getString(key, "");
        return "";
    }

    /**Загрузка int по ключу*/
    public static int loadInt(String key) {
        if (mPrefPrivate.contains(key)) return mPrefPrivate.getInt(key, 0);
        return 0;
    }

    /**Загрузка float по ключу*/
    public static float loadFloat(String key) {
        if (mPrefPrivate.contains(key)) return mPrefPrivate.getFloat(key, 0);
        return 0;
    }

    /**Загрузка boolean по ключу*/
    public static boolean loadBoolean(String key) {
        if (mPrefPrivate.contains(key)) return mPrefPrivate.getBoolean(key, false);
        return false;
    }

    /**Загрузка настройки boolean, заданной через preferenceActivity, по ключу из resId*/
    public static boolean getPrefBoolean(int resId) {
        String key = App.getContext().getString(resId);
        if (mPrefManager.contains(key)) return mPrefManager.getBoolean(key, false);
        return false;
    }

    public static boolean getPrefBoolean(String key) {
        if (mPrefManager.contains(key)) return mPrefManager.getBoolean(key, false);
        return false;
    }

    public static boolean getPrefBoolean(String key, boolean defValue) {
        if (mPrefManager.contains(key)) return mPrefManager.getBoolean(key, defValue);
        return defValue;
    }

    /**Загрузка настройки integer, заданной через preferenceActivity, по ключу из resId*/
    public static int getPrefInt(int resId) {
        String key = App.getContext().getString(resId);
        if (mPrefManager.contains(key)) return Integer.parseInt(mPrefManager.getString(key, "0"));
        return 0;
    }

    /**Загрузка настройки integer, заданной через preferenceActivity, по ключу из resId, с возможность задать значение по умолчанию*/
    public static int getPrefInt(int resId, int defValue) {
        String key = App.getContext().getString(resId);
        if (mPrefManager.contains(key)) return Integer.parseInt(mPrefManager.getString(key, String.valueOf(defValue)));
        return defValue;
    }

    /**Загрузка настройки String, заданной через preferenceActivity, по ключу String*/
    public static String getPrefString(String key) {
        if (mPrefManager.contains(key)) return mPrefManager.getString(key, "");
        return "";
    }

    /**Загрузка настройки String, заданной через preferenceActivity, по ключу из resId*/
    public static String getPrefString(int resId) {
        String key = App.getContext().getString(resId);
        if (mPrefManager.contains(key)) return mPrefManager.getString(key, "");
        return "";
    }

    /**Загрузка float по ключу. Задать значение по умолчанию*/
    public static float loadFloat(String key, float defValue) {
        if (mPrefPrivate.contains(key)) return mPrefPrivate.getFloat(key, defValue);
        return defValue;
    }

    /**Сохранение массива по ключу*/
    public static void saveArray(String key, ArrayList<String> list) {
        SharedPreferences.Editor editor = mPrefPrivate.edit();

        //очистить. если не очищать, то в случае, когда размер массива меньше сохраненного ранее, будет оставаться "хвост" предыдущего массива
        int count = 0;
        while (mPrefPrivate.contains(key + count)) {
            editor.remove(key + count);
            count++;
        }

        for (int i = 0; i < list.size(); i++) {
            editor.putString(key + i, list.get(i));
        }
        editor.apply();
    }

    /**Загрузка ArrayList<String> по ключу*/
    public static ArrayList<String> loadStringArray(String key) {
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        while (mPrefPrivate.contains(key + count)) {
            String s = mPrefPrivate.getString(key + count, "");
            list.add(s);
            count++;
        }
        return list;
    }


    /**Сохранение массива по ключу*/
    public static void saveStringSet(String key, Set<String> set) {
        SharedPreferences.Editor editor = mPrefPrivate.edit();
        //очистить. если не очищать, то в случае, когда размер массива меньше сохраненного ранее, будет оставаться "хвост" предыдущего массива
        int count = 0;
        while (mPrefPrivate.contains(key + count)) {
            editor.remove(key + count);
            count++;
        }

        int i=0;
        for (String s:set) {
            editor.putString(key + i, s);
            i++;
        }
        editor.apply();
    }

    /**Загрузка ArrayList<String> по ключу*/
    public static Set<String> loadStringSet(String key) {
        Set<String> set = new HashSet<>();
        int count = 0;
        while (mPrefPrivate.contains(key + count)) {
            String s = mPrefPrivate.getString(key + count, "");
            set.add(s);
            count++;
        }
        return set;
    }
}
