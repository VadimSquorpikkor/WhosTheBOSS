package com.squorpikkor.app.whostheboss;

import static com.squorpikkor.app.whostheboss.data.DeviceDatabase.DEVICES;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = DEVICES)
public class Device {

    public static final int DISTORTION_OVERDRIVE = 4;
    public static final int DELAY_REVERB = 8;
    public static final int PITCH_MODULATION = 16;//octave, chorus, vibrato, flanger, multi overtone, phase shifter, harmonist, tremolo, rotary, slicer
    public static final int DYNAMICS_FILTER = 32;//equalizer, compressor, dynamic wah
    public static final int ACOUSTIC = 64;
    public static final int BASS_PEDALS = 128;
    public static final int OTHERS = 256;//loop station, synthesizer, vocoder, line selector, noise suppressor, tuner
    public static final int WAZA_CRAFT = 512;
    public static final int AMP_EMULATOR = 1024;
    public static final int CHORUS = 2048;
    public static final int SERIES_10 = 4096;
    public static final int SERIES_20 = 8192;
//    public static final int SERIES_200 = 512;
//    public static final int SERIES_500 = 512;


    public static final int HAVE_GOT = 2;
    public static final int WISH_LIST = 4;

    @PrimaryKey(autoGenerate = true)
    private int id;

    /**Имя (Distortion)*/
    private String name;

    /**Короткое имя (DS-1)*/
    private String shortName;

    private String years;

    /**моё отношение: хочу купить, есть такая, не нужна*/
    private int status;

    /**Категория: ревер, дисторшн, waza craft...*/
    private int category;



    public Device(String name, String shortName, String years, int status, int category) {
        this.name = name;
        this.shortName = shortName;
        this.years = years;
        this.status = status;
        this.category = category;
    }

    /*@Ignore
    public Device(String name, String shortName, String years, int status, int... cats) {
        int category = 0;
        for (int cat:cats) category+=cat;
        this.category = category;

        this.name = name;
        this.shortName = shortName;
        this.years = years;
        this.status = status;
        this.category = category;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }
}
