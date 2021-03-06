package edu.fsu.cs.bandmate;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.ParseException;
import com.parse.SaveCallback;

import java.util.ArrayList;
import java.util.Objects;

@ParseClassName("ConversationList")
public class ConversationList extends ParseObject {
    public ConversationList(){}

    public static final String KEY_CONVERSATION = "conversation";
    public static final String KEY_USER = "userId";

    public ArrayList<Conversation> getConversations() {
        return (ArrayList<Conversation>) this.get(KEY_CONVERSATION);

    }
}


