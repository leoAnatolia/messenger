package com.ozgur.sitmapinar.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@XmlRootElement
public class Message {

    private long   id;
    private String message;
    private String author;
    private Date   created;

    public Message() {
    }

    public Message(final long id, final String message, final String author) {

        this.id = id;
        this.message = message;
        this.author = author;
        this.created = new Date();
    }

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

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);

    }

    @Override
    public boolean equals(Object obj)

    {
        if (obj == this) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        Message guest = (Message) obj;

        return ((this.id == guest.id) && (this.message == guest.getMessage()) && (this.author == guest.getAuthor()));
    }

    @Override
    public int hashCode()

    {
        final int prime = 31;
        int result = 1;

        result = (prime * result) + ((this.message == null) ? 0 : this.message.hashCode());
        result = (int) ((prime * result) + this.id);
        result = (prime * result) + ((this.author == null) ? 0 : this.author.hashCode());

        return result;

    }

}