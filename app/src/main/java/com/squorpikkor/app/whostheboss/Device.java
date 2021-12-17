package com.squorpikkor.app.whostheboss;


public class Device {

    public static final int ALL = 1;
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
    //todo public static final int SERIES_200 = 512;
    //todo public static final int SERIES_500 = 512;

    /**Имя (Distortion)*/
    private final String name;

    /**Короткое имя (DS-1) получается из id*/
    private final String id;

    private final String years;

    /**Категория: ревер, дисторшн, waza craft...*/
    private final int category;

    public Device(String name, String id, String years, int category) {
        this.name = name;
        this.id = id;
        this.years = years;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**Смысл сплита: после _ (при наличии, есть только у некоторых) идет версия рисунка (может быть у разных педалей одинаковое короткое имя)*/
    public String getShortName() {
        return id.split("_")[0];
    }

    public int getCategory() {
        return category;
    }

    public String getYears() {
        return years;
    }

    public int getSmallImage() {
        return Utils.getSmallImage(id);
    }

    public int getBigImage() {
        return Utils.getBigImage(id);
    }

    public String getDescription() {
        return Utils.getDescriptionResource(getShortName());
    }
}
