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
     * Audio resource ID
     */
    private int audioResourceId;

    /**
     * Image resource id for the word
     */
    private int imageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English).
     * @param miwokTranslation   is the word in the Miwok language
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the drawable resource ID for the image associated with the word
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
        this.audioResourceId = audioResourceId;
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

    /**
     * Return the image resource ID of the word
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * @return whether or not there is an image for this word
     */
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * @return the audio resource ID of the word
     */
    public int getAudioResourceId() {
        return audioResourceId;
    }
}
