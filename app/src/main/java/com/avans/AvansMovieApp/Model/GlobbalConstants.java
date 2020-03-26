package com.avans.AvansMovieApp.Model;




import java.util.Locale;
import java.util.UUID;

public class GlobbalConstants {


    public static final String API_KEY_V3 = "b966d45d0ab662f523ce11044a9394ef"; // maybe putting the api key in plaintext in here is a bad idea
    public static final String API_KEY_V4 = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJiOTY2ZDQ1ZDBhYjY2MmY1MjNjZTExMDQ0YTkzOTRlZiIsInN1YiI6IjVlNzM1YTMyY2FiZmU0MDAxMTFjMTFmMiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.T24irmS_96EdKafis4i9hGzqpmeLHS4jlNa-DzNioXg";

    public static final String V3_BASE_PATH = "/3";
    public static final String V3_BASE_URL = "https://api.themoviedb.org" + V3_BASE_PATH;

    public static final String V4_BASE_PATH = "/4";
    public static final String V4_BASE_URL = "https://api.themoviedb.org" + V3_BASE_PATH;




    //private String id =  Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    public static String DEVICE_ID = UUID.randomUUID().toString(); // make this persistent
    public static String LANG = Locale.getDefault().toLanguageTag(); // in ISO 639-1 format as specified by the API




    public static String SESSION_TOKEN;


    public static void setSessionToken(String sessionToken) {
        GlobbalConstants.SESSION_TOKEN = sessionToken;
    }

    public static void setdeviceId(String deviceId) {
        GlobbalConstants.DEVICE_ID = deviceId;
    }

    public static void setLanguage(String language) {
        GlobbalConstants.LANG = language;
    }
}