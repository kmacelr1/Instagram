package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("7N2RczwCgq2xB7vwJbVCTwaEh2fq06sdZpbq80oU")
                .clientKey("GRZlr7HUNT5V5U7glYr7VkJHK56cFs5MIWXY1hXT")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
