package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Sley on 10/26/2017.
 */

public class User {

    // list the attributes
    public String name ;
    public long uid;
    public String screenName;
    public String profileImageUrl;

    public String tagLine;
    public String followersCount;
    public String followingCount;

    //deserialize the JSON
    public static User fromJSON(JSONObject json) throws JSONException {
        User user = new User();

    //extract and fill the value
        user.name = json.getString("name");
        user.uid = json.getLong("id");
        user.screenName = json.getString("screen_name");
        user.profileImageUrl = json.getString("profile_image_url");
        user.tagLine = json.getString("description");
        user.followersCount = json.getString("followers_count");
        user.followingCount = json.getString("friends_count");
        return user;


    }
}
