package com.squorpikkor.app.whostheboss;

/**
 * Педаль эффектов BOSS
 */
class Pedal {

    /**
     * Имя (Distortion)
     */
    private String name;
    /**
     * Короткое имя (DS-1)
     */
    private String shortName;
    /**
     * Ссылка на картинку
     */
    private int image;
    /**
     * Ссылка на картинку
     */
    private int smallImage;
    /**
     * Год начала продаж
     */
    private int yearStart;
    /**
     * Год окончания продаж, если = 0, значит ещё продается
     */
    private int yearEnd;
    /**
     * моё отношение: хочу купить, есть такая, не нужна, хочу такую, но дорого, есть более лучшая (не всегда более новая) версия, не знаю зачем и т.д. Будет задаваться static final String
     */
    private String status;
    /**
     * Описание
     */
    private String description;

    public Pedal(String name, String shortName, int image, int yearStart, int yearEnd) {
        this.name = name;
        this.shortName = shortName;
        this.image = image;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
    }

    public Pedal(String name, String shortName, int image, int smallImage, int yearStart, int yearEnd) {
        this.name = name;
        this.shortName = shortName;
        this.image = image;
        this.smallImage = smallImage;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
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
}
