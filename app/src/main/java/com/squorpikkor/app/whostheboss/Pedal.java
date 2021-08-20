package com.squorpikkor.app.whostheboss;

import java.util.ArrayList;

/**Педаль эффектов BOSS*/
class Pedal {

    public static final int ALL = 0;
    public static final int DISTORTION_OVERDRIVE = 1;
    public static final int DELAY_REVERB = 2;
    public static final int PITCH_MODULATION = 3;//octave, chorus, vibrato, flanger, multi overtone, phase shifter, harmonist, tremolo, rotary, slicer
    public static final int DYNAMICS_FILTER = 4;//equalizer, compressor, dynamic wah
    public static final int ACOUSTIC = 5;
    public static final int BASS_PEDALS = 6;
    public static final int SERIES_20 = 7;
    public static final int SERIES_200 = 8;
    public static final int SERIES_500 = 9;
    public static final int OTHERS = 10;//loop station, synthesizer, vocoder, line selector, noise suppressor, tuner
    public static final int WAZA_CRAFT = 11;
    public static final int AMP_EMULATOR = 12;
    public static final int CHORUS = 13;
    public static final int SERIES_10 = 14;

    /**Имя (Distortion)*/
    private final String name;
    /**Короткое имя (DS-1)*/
    private final String shortName;
    /**Ссылка на картинку*/
    private final int image;
    /**Ссылка на картинку*/
    private final int smallImage;
    /**Год начала продаж*/
    private final int yearStart;
    /**Год окончания продаж, если = 0, значит ещё продается*/
    private final int yearEnd;
    /**моё отношение: хочу купить, есть такая, не нужна, хочу такую, но дорого, есть более лучшая (не всегда более новая) версия, не знаю зачем и т.д. Будет задаваться static final String*/
    private int status;
    /**Описание*/
    private final int description;

    private boolean isFavorite;

    private int id;

    private final ArrayList<Integer> Category;

    public Pedal(String name, String shortName, int image, int smallImage, int yearStart, int yearEnd, int description, int... cats) {
        this.description = description;
        this.name = name;
        this.shortName = shortName;
        this.image = image;
        this.smallImage = smallImage;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.Category = new ArrayList<>();
        for (int cat:cats) Category.add(cat);
    }

    public Pedal(boolean favorite, String name, String shortName, int image, int smallImage, int yearStart, int yearEnd, int description, int... cats) {
        this.isFavorite = favorite;
        this.description = description;
        this.name = name;
        this.shortName = shortName;
        this.image = image;
        this.smallImage = smallImage;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.Category = new ArrayList<>();
        for (int cat:cats) Category.add(cat);
    }

    public Pedal(int id, String name, String shortName, int image, int smallImage, int yearStart, int yearEnd, int description, int... cats) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.shortName = shortName;
        this.image = image;
        this.smallImage = smallImage;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.Category = new ArrayList<>();
        for (int cat:cats) Category.add(cat);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public int getImage() {
        return image;
    }

    public int getYearStart() {
        return yearStart;
    }

    public int getYearEnd() {
        return yearEnd;
    }

    public int getSmallImage() {
        return smallImage;
    }

    public ArrayList<Integer> getCategory() {
        return Category;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getId() {
        return id;
    }
}