package com.example.videosharingwebsite;

import java.util.ArrayList;
import java.util.List;

public class WebsiteUser {

    private String username;

    private double balance;

    private List<PurchasedVideo> boughtVideos;

    public WebsiteUser(String username, double balance) {
        this.username = username;
        this.balance = balance;
        this.boughtVideos = new ArrayList<>();
    }

    public void purchasedVideo(PurchasedVideo video) {
        if(video.isFree()) {
            System.out.println("The Video is free.");
        }else{
            if(balance >= video.getPrice()) {
                balance -= video.getPrice();
                boughtVideos.add(video);
                System.out.println("Successful purchase.");
            }else{
                System.out.println("Not enough money in your balance.");
            }
        }
    }

    public void watchVideo(Video video) {
        if(video.isFree() || boughtVideos.contains(video)) {
            video.play();
            System.out.println("video play");
        }else{
            System.out.println("You have to pay for the video.");
        }
    }

}
