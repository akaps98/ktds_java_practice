package com.ktdsuniversity.edu.bulletinasm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post implements Printable {
    private int postIdx;
    private String title;
    private LocalDate writtenDate;
    private LocalTime writtenTime;
    private String author;
    private String content;
    private List<Comment> comments;

    public Post(String title, String author, String content) {
        this.title = title;
        this.writtenDate = LocalDate.now();
        this.writtenTime = LocalTime.now();
        this.author = author;
        this.content = content;
        this.comments = new ArrayList<>();
    }

    public Post(int postIdx, String title, String author, String content) {
        this.postIdx = postIdx;
        this.title = title;
        this.writtenDate = LocalDate.now();
        this.writtenTime = LocalTime.now();
        this.author = author;
        this.content = content;
        this.comments = new ArrayList<>();
    }

    public Post(int postIdx, String title, LocalDate writtenDate, LocalTime writtenTime, String author, String content) {
        this.postIdx = postIdx;
        this.title = title;
        this.writtenDate = writtenDate;
        this.writtenTime = writtenTime;
        this.author = author;
        this.content = content;
        this.comments = new ArrayList<>();
    }

    public void loadComments(String filePath, String fileName) {
        File file = new File(filePath, fileName);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // date formatting
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // time formatting

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] eachComment = line.split("\\|");

                int postId = Integer.parseInt(eachComment[0]);

                if (postId != this.postIdx) { // current comment is not belong to this post
                    continue;
                }

                int commentIdx = Integer.parseInt(eachComment[1]);
                String content = eachComment[2];
                String author = eachComment[3];
                LocalDate date = LocalDate.parse(eachComment[4], dateFormatter);
                LocalTime time = LocalTime.parse(eachComment[5], timeFormatter);

                Comment comment = new Comment(commentIdx, content, author, date, time);
                this.comments.add(comment);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getPostIdx() {
        return postIdx;
    }

    public void setPostIdx(int postIdx) {
        this.postIdx = postIdx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String printFormattedString() {
        StringBuilder sb = new StringBuilder();

        sb.append("-".repeat(70));

        sb.append("\nIndex: ").append(this.postIdx)
                .append("\nTitle: ").append(this.title)
                .append("\nAuthor: ").append(this.author)
                .append(" | Written on ").append(this.writtenDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy, ")))
                .append(this.writtenTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")))
                .append("\nContent: ").append(this.content)
                .append("\nComment:\n");

        if(this.comments.isEmpty()) {
            sb.append("There is no comment. Be a first commenter on this post!\n");
            return sb.toString();
        }

        for(Comment comment: comments) {
            sb.append(comment.printFormattedString());
        }

        return sb.toString();
    }
}
