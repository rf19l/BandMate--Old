package edu.fsu.cs.bandmate;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.ParseException;
import com.parse.SaveCallback;

import java.util.ArrayList;
import java.util.Objects;

import java.io.File;


@ParseClassName("Profile")
public class Profile extends ParseObject {
    public static final String KEY_PROFILEPICTURE="ProfilePicture";
    public static final String KEY_USER="user";
    public static final String KEY_NAME="Name";
    public static final String KEY_USERNAME="username";
    public static final String KEY_GENRE="Genre";
    public static final String KEY_PRIMARYINSTRUMENT = "primary_instrument";
    public static final String KEY_PRIMARYGENRE = "primary_genre";
    public static final String KEY_SECONDARYINSTRUMENTS = "secondary_instrument";
    public static final String KEY_SECONDARYGENRE = "secondary_genre";
    public static final String KEY_BIRTHDAY = "birthday";
    public static final String KEY_GENDER = "gender";
    public static final String KEY_CONVERSATIONS = "conversations";
    public static final String KEY_MP3="MP3";
    public static final String KEY_BIO="Bio";


    //TODO: Refactor "getImage" to "getProfilePicture" after merge for consistency
    public ParseFile getImage(){
        return getParseFile(KEY_PROFILEPICTURE);
    }
    public ParseFile getProfilePicture(){
        return getParseFile(KEY_PROFILEPICTURE);
    }
    public ParseFile getProfileMP3(){
        return getParseFile(KEY_MP3);
    }

    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }
    public String getName(){
        return (String) Objects.requireNonNull(getParseUser(KEY_USER)).get(KEY_NAME);
    }

    //public String getGenre(){return getString(KEY_GENRE);}
    public String getBio(){return getString(KEY_BIO);}
    public String getGenre(){return (String) Objects.requireNonNull(getParseUser(KEY_USER)).get(KEY_PRIMARYGENRE);}
    public String getBirthday(){return (String) Objects.requireNonNull(getParseUser(KEY_USER)).get(KEY_BIRTHDAY);}
    public String getPrimaryInstrument(){return (String) Objects.requireNonNull(getParseUser(KEY_USER)).get(KEY_PRIMARYINSTRUMENT);}
    public ArrayList<String> getSecondaryInstruments(){return (ArrayList<String>) Objects.requireNonNull(getParseUser(KEY_USER)).get(KEY_SECONDARYINSTRUMENTS);}
    public String getGender(){return (String) Objects.requireNonNull(getParseUser(KEY_USER)).get(KEY_GENDER);}

    public void putUser(ParseUser user){
        this.put(KEY_USER,user);
    }
    public void putName(String name){
        this.put(KEY_NAME,name);
    }
    public void putGenre(String genre){
        this.put(KEY_GENRE,genre);
    }

    public void putBio(String bio){
        this.put(KEY_BIO,bio);
    }
    public void putProfilePicture(ParseFile parseFileProfilePic){
        this.put(KEY_PROFILEPICTURE,parseFileProfilePic);
    }
    public void putProfileMP3(ParseFile parseFileProfileMP3){
        this.put(KEY_MP3,parseFileProfileMP3);
    }
}
