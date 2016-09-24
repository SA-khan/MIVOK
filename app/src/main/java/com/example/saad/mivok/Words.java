package com.example.saad.mivok;

/**
 * Created by saad on 9/24/2016.
 */
public class Words {

    private String mDefaultTranslation;

    private String mMivokTranslation;

    private int mImageResourceId;

    public Words(String DefaultTranslation, String MivokTranslation){
        mDefaultTranslation = DefaultTranslation;
        mMivokTranslation = MivokTranslation;
    }

    public Words(String DefaultTranslation, String MivokTranslation, int Image){
        mDefaultTranslation = DefaultTranslation;
        mMivokTranslation = MivokTranslation;
        mImageResourceId = Image;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMivokTranslation() {
        return mMivokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
