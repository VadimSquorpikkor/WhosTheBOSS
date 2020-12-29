package com.squorpikkor.app.whostheboss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Педаль эффектов BOSS
 */
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



    /**
     * Имя (Distortion)
     */
    private final String name;
    /**
     * Короткое имя (DS-1)
     */
    private final String shortName;
    /**
     * Ссылка на картинку
     */
    private final int image;
    /**
     * Ссылка на картинку
     */
    private int smallImage;
    /**
     * Год начала продаж
     */
    private final int yearStart;
    /**
     * Год окончания продаж, если = 0, значит ещё продается
     */
    private final int yearEnd;
    /**
     * моё отношение: хочу купить, есть такая, не нужна, хочу такую, но дорого, есть более лучшая (не всегда более новая) версия, не знаю зачем и т.д. Будет задаваться static final String
     */
    private String status;
    /**
     * Описание
     */
    private String description;

    private ArrayList<Integer> Category;

    public Pedal(String name, String shortName, int image, int smallImage, int yearStart, int yearEnd) {
        this.name = name;
        this.shortName = shortName;
        this.image = image;
        this.smallImage = smallImage;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.Category = new ArrayList<>();
    }

    public Pedal(String name, String shortName, int image, int smallImage, int yearStart, int yearEnd, int cat1) {
        this.name = name;
        this.shortName = shortName;
        this.image = image;
        this.smallImage = smallImage;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.Category = new ArrayList<>();
        Category.add(cat1);
    }

    public Pedal(String name, String shortName, int image, int smallImage, int yearStart, int yearEnd, int cat1, int cat2) {
        this.name = name;
        this.shortName = shortName;
        this.image = image;
        this.smallImage = smallImage;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.Category = new ArrayList<>();
        Category.add(cat1);
        Category.add(cat2);
    }

    public Pedal(String name, String shortName, int image, int smallImage, int yearStart, int yearEnd, int cat1, int cat2, int cat3) {
        this.name = name;
        this.shortName = shortName;
        this.image = image;
        this.smallImage = smallImage;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.Category = new ArrayList<>();
        Category.add(cat1);
        Category.add(cat2);
        Category.add(cat3);
    }

    public Pedal(String name, String shortName, int image, int smallImage, int yearStart, int yearEnd, int cat1, int cat2, int cat3, int cat4) {
        this.name = name;
        this.shortName = shortName;
        this.image = image;
        this.smallImage = smallImage;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.Category = new ArrayList<>();
        Category.add(cat1);
        Category.add(cat2);
        Category.add(cat3);
        Category.add(cat4);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
