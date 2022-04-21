package com.bkitsolution;

public class javaLanguage {
    private String nameLanguages;

    public javaLanguage(String nameLanguages) {
        this.nameLanguages = nameLanguages;
    }

    public String getNameLanguages() {
        return nameLanguages;
    }

    @Override
    public String toString() {
        return "javaLanguage{" +
                "nameLanguages='" + nameLanguages + '\'' +
                '}';
    }
}
