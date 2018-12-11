package com.danit.togethertime.entity;

public class Comment {
    public long commentID;
    private long author;
    private long meetingID;

    public long getAuthor() {
        return author;
    }

    public void setAuthor(long author) {
        this.author = author;
    }

    public long getMeetingID() {
        return meetingID;
    }

    public void setMeetingID(long meetingID) {
        this.meetingID = meetingID;
    }
}