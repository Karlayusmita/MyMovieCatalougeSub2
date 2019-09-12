package com.example.mymoviecatalougesub2;

import android.os.Parcel;
import android.os.Parcelable;

public class TV implements Parcelable {
    private String poster;
    private String title;
    private String overview;
    private String network;
    private String runtime;
    private String genre;

    public TV(){

    }

    protected TV(Parcel in) {
        poster = in.readString();
        title = in.readString();
        overview = in.readString();
        network = in.readString();
        runtime = in.readString();
        genre = in.readString();
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static final Creator<TV> CREATOR = new Creator<TV>() {
        @Override
        public TV createFromParcel(Parcel in) {
            return new TV(in);
        }

        @Override
        public TV[] newArray(int size) {
            return new TV[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(poster);
        dest.writeString(title);
        dest.writeString(overview);
        dest.writeString(network);
        dest.writeString(runtime);
        dest.writeString(genre);
    }
}
