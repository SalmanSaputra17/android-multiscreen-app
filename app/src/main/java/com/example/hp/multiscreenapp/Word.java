package com.example.hp.multiscreenapp;

public class Word {

    private String mEnglishTranslation;
    private String mIndonesiaTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String englishTranslation, String indonesiaTranslation) {
        mEnglishTranslation = englishTranslation;
        mIndonesiaTranslation = indonesiaTranslation;
    }

    public Word(String englishTranslation, String indonesiaTranslation, int imageResourceID) {
        mEnglishTranslation = englishTranslation;
        mIndonesiaTranslation = indonesiaTranslation;
        mImageResourceID = imageResourceID;
    }

    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    public String getIndonesiaTranslation() {
        return mIndonesiaTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

}
