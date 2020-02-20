package com.example.recyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Heroes implements Parcelable {
    private String heroName;
    private String heroDetail;
    private int heroImage;

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroDetail() {
        return heroDetail;
    }

    public void setHeroDetail(String heroDetail) {
        this.heroDetail = heroDetail;
    }

    public int getHeroImage() {
        return heroImage;
    }

    public void setHeroImage(int heroImage) {
        this.heroImage = heroImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.heroName);
        dest.writeString(this.heroDetail);
        dest.writeInt(this.heroImage);
    }

    public Heroes() {
    }

    protected Heroes(Parcel in) {
        this.heroName = in.readString();
        this.heroDetail = in.readString();
        this.heroImage = in.readInt();
    }

    public static final Parcelable.Creator<Heroes> CREATOR = new Parcelable.Creator<Heroes>() {
        @Override
        public Heroes createFromParcel(Parcel source) {
            return new Heroes(source);
        }

        @Override
        public Heroes[] newArray(int size) {
            return new Heroes[size];
        }
    };
}
