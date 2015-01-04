package com.torrentlinks.vgurevich.torrentlinks.providers;

/**
 * Created by vgurevich on 12/26/14.
 */
public class TorrentLink {
    private String id;
    private String text;

    public TorrentLink(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
