package com.squorpikkor.app.whostheboss;

/**
 * Педаль эффектов BOSS
 */
class Pedal {

    /**
     * Имя (Distortion)
     */
    String name;
    /**
     * Короткое имя (DS-1)
     */
    String shortName;
    /**
     * Ссылка на картинку
     */
    int image;
    /**
     * Год начала продаж
     */
    int yearStart;
    /**
     * Год окончания продаж, если = 0, значит ещё продается
     */
    int yearEnd;
    /**
     * моё отношение: хочу купить, есть такая, не нужна, хочу такую, но дорого, есть более лучшая (не всегда более новая) версия, не знаю зачем и т.д. Будет задаваться static final String
     */
    String status;
    /**
     * Описание
     */
    String description;

    public Pedal(String name, String shortName, int image, int yearStart, int yearEnd) {
        this.name = name;
        this.shortName = shortName;
        this.image = image;
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
}
