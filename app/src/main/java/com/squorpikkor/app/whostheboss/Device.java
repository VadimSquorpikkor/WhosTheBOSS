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

    /**Ссылка на картинку*/
    private int image;

    /**Ссылка на картинку*/
    private int smallImage;

    /**Год начала продаж*/
    private int yearStart;

    /**Год окончания продаж, если = 0, значит ещё продается*/
    private int yearEnd;

    /**Описание*/
    private int description;

    /**моё отношение: хочу купить, есть такая, не нужна*/
    private int status;

    /**Категория: ревер, дисторшн, waza craft...*/
    private int category;

    private String years;

    @Ignore
    public Device(String name, String shortName, String years, int category) {
        this.name = name;
        this.shortName = shortName;
        this.years = years;
        this.category = category;
    }

    @Ignore
    public Device(String name, String shortName, int yearStart, int yearEnd, int category) {
        this.name = name;
        this.shortName = shortName;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.category = category;
    }

    public Device(String name, String shortName, int image, int smallImage, int yearStart, int yearEnd, int description, int status, int category) {
        this.name = name;
        this.shortName = shortName;
        this.image = image;
        this.smallImage = smallImage;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.description = description;
        this.status = status;
        this.category = category;
    }

    /*@Ignore
    public Device(String name, String shortName, int image, int smallImage, int yearStart, int yearEnd, int description, int status, int... cats) {
        int category = 0;
        for (int cat:cats) category+=cat;
        this.category = category;
        new Device(name, shortName, image, smallImage, yearStart, yearEnd, description, status, category);
    }*/

    /*@Ignore
    public Device(String name, String shortName, int image, int smallImage, int yearStart, int yearEnd, int description, int... cats) {
        int category = 0;
        for (int cat:cats) category+=cat;
        this.category = category;
        new Device(name, shortName, image, smallImage, yearStart, yearEnd, 0, description, category);
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(int smallImage) {
        this.smallImage = smallImage;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    public int getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(int yearEnd) {
        this.yearEnd = yearEnd;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
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
}
