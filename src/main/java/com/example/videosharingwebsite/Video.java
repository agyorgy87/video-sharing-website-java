package com.example.videosharingwebsite;

abstract class Video {

    private String title;
    private String uploader;
    private double duration;

    public Video(String title, String uploader, double duration) {
        this.title = title;
        this.uploader = uploader;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getUploader() {
        return uploader;
    }

    public double getDuration() {
        return duration;
    }

    public abstract boolean isFree();

    public abstract void play();
}
