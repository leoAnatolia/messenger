package com.ozgur.sitmapinar.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

    private long   id;
    private String message;
    private Date   created;

    public Message() {
    }

    public Message(final long id, final String message, final String author) {

        this.id = id;
        this.message = message;
        this.author = author;
        this.created = new Date();
    }

    private String author;

    public long getId() {
        return this.id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(final Date created) {
        this.created = created;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

}
