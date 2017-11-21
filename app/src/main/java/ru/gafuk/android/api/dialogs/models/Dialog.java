package ru.gafuk.android.api.dialogs.models;

import java.util.ArrayList;

import ru.gafuk.android.api.dialogs.interfaces.IDialog;
import ru.gafuk.android.api.users.models.UserItem;

/**
 * Created by aborz on 18.11.2017.
 */

public class Dialog implements IDialog<Message> {

    private int id;
    private String url;
    private String avatar;
    private boolean online;
    private String nickname;
    private int new_messages;

    private ArrayList<UserItem> users;
    private Message lastMessage;

    public Dialog() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getNew_messages() {
        return new_messages;
    }

    public void setNew_messages(int new_messages) {
        this.new_messages = new_messages;
    }

    public Message getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(Message message) {
        this.lastMessage = message;
    }
}
