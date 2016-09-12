package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 * No setters provided since we are not expecting the words to change
 * Created by curv3r on 9/12/16.
 */
public class Word {

    /**
     * Default translation for the word
     */
    private String defaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String miwokTranslation;

    /**
     * Create a new Word object
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English).
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    /**
     * Get the translation
     *
     * @return default translation
     */
    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    /**
     * Get the miwok translation
     *
     * @return miwok translation
     */
    public String getMiwokTranslation() {
        return miwokTranslation;
    }
}
