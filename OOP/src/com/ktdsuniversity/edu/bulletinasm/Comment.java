package com.ktdsuniversity.edu.bulletinasm;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Comment implements Printable {
    private int postIdx;
    private int commentIdx;
    private String content;
    private String author;
    private LocalDate writtenDate;
    private LocalTime writtenTime;

    public Comment(int commentIdx, String content, String author, LocalDate writtenDate, LocalTime writtenTime) {
        this.commentIdx = commentIdx;
        this.content = content;
        this.author = author;
        this.writtenDate = writtenDate;
        this.writtenTime = writtenTime;
    }

    public Comment(int postIdx, int commentIdx, String content, String author, LocalDate writtenDate, LocalTime writtenTime) {
        this.postIdx = postIdx;
        this.commentIdx = commentIdx;
        this.content = content;
        this.author = author;
        this.writtenDate = writtenDate;
        this.writtenTime = writtenTime;
    }

    public int getPostIdx() {
        return postIdx;
    }

    public void setPostIdx(int postIdx) {
        this.postIdx = postIdx;
    }

    public int getCommentIdx() {
        return commentIdx;
    }

    public void setCommentIdx(int commentIdx) {
        this.commentIdx = commentIdx;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getWrittenDate() {
        return writtenDate;
    }

    public void setWrittenDate(LocalDate writtenDate) {
        this.writtenDate = writtenDate;
    }

    public LocalTime getWrittenTime() {
        return writtenTime;
    }

    public void setWrittenTime(LocalTime writtenTime) {
        this.writtenTime = writtenTime;
    }

    @Override
    public String printFormattedString() {
        return content + " | " + author + " | Commented on " +
                writtenDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ", " +
                writtenTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "\n";
    }
}
