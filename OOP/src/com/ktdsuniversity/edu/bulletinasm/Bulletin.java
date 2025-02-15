package com.ktdsuniversity.edu.bulletinasm;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Bulletin {
    private final String FILE_PATH = "/Users/tony/Desktop";
    private final String POST_DB_NAME = "postDB.txt";
    private final String COMMENT_DB_NAME = "commentDB.txt";
    private List<Post> posts;

    public Bulletin(String filePath, String fileName) {
        this.posts = new ArrayList<>();

        loadPosts(filePath, fileName);
    }

    private void loadPosts(String filePath, String fileName) {
        File file = new File(filePath, fileName);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // date formatting
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // time formatting

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while((line = br.readLine()) != null) {
                String[] eachContact = line.split("\\|");

                int postId = Integer.parseInt(eachContact[0]);
                String title = eachContact[1];
                String author = eachContact[2];
                LocalDate writtenDate = LocalDate.parse(eachContact[3], dateFormatter);
                LocalTime writtenTime = LocalTime.parse(eachContact[4], timeFormatter);
                String content = eachContact[5];

                Post eachPost = new Post(postId, title, author, content);
                eachPost.setWrittenDate(writtenDate);
                eachPost.setWrittenTime(writtenTime);

                eachPost.loadComments(this.FILE_PATH, this.COMMENT_DB_NAME); // same file path

                posts.add(eachPost);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // 1. 게시글 목록 조회
    public String listAllPosts() {
    	File file = new File(this.FILE_PATH, this.POST_DB_NAME);
        List<Post> registeredPosts = new ArrayList<>();

        // current posts should be reloaded to prevent the cases when the post is deleted or modified
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] eachContact = line.split("\\|");

                int id = Integer.parseInt(eachContact[0]);
                String title = eachContact[1];
                String author = eachContact[2];
                LocalDate writtenDate = LocalDate.parse(eachContact[3], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                LocalTime writtenTime = LocalTime.parse(eachContact[4], DateTimeFormatter.ofPattern("HH:mm:ss"));
                String content = eachContact[5];

                Post post = new Post(id, title, author, content);
                post.setWrittenDate(writtenDate);
                post.setWrittenTime(writtenTime);

                registeredPosts.add(post);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < registeredPosts.size(); i++) {
            Post post = registeredPosts.get(i);
            sb.append("\nIndex: ").append(i + 1)
                    .append(" | 제목: ").append(post.getTitle())
                    .append(" | 작성자: ").append(post.getAuthor())
                    .append(" | 작성일시: ").append(post.getWrittenDate())
                    .append(", ").append(post.getWrittenTime())
                    .append("\n");
        }

        return sb.toString();
    }

    // 현재 입력한 index가 유효한지 판단하는 메소드. null 리턴 시 입력한 index는 유효하지 않음
    public Post isInputIndexValid(int postIndex) {
        File file = new File(this.FILE_PATH, this.POST_DB_NAME);
        List<Post> registeredPosts = new ArrayList<>();

        // current posts should be reloaded to prevent the cases when the post is deleted or modified
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] eachContact = line.split("\\|");

                int id = Integer.parseInt(eachContact[0]);
                String title = eachContact[1];
                String author = eachContact[2];
                LocalDate writtenDate = LocalDate.parse(eachContact[3], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                LocalTime writtenTime = LocalTime.parse(eachContact[4], DateTimeFormatter.ofPattern("HH:mm:ss"));
                String content = eachContact[5];

                Post post = new Post(id, title, author, content);
                post.setWrittenDate(writtenDate);
                post.setWrittenTime(writtenTime);

                registeredPosts.add(post);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        boolean isPostExists = false;

        for(Post eachPost : registeredPosts) {
            if(eachPost.getPostIdx() == postIndex) {
                isPostExists = true;
                return eachPost;
            }
        }

        return null;
    }

    // 2. 게시글 내용 조회
    public Post showDesignatedPost(int postIndex) {
        if(isInputIndexValid(postIndex) == null) {
            return null;
        }
        return isInputIndexValid(postIndex);
    }

    // 게시글의 마지막 글의 index를 알기 위한 메소드; writePost에 사용하기 위함
    public int getLastPostIdx() {
        File file = new File(this.FILE_PATH, this.POST_DB_NAME);
        int lastPostIdx = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] eachPost = line.split("\\|");
                lastPostIdx = Integer.parseInt(eachPost[0]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return lastPostIdx + 1;
    }

    // 3. 게시글 등록
    public void writePost(Post post) {
        int currentIdx = getLastPostIdx();
        File file = new File(this.FILE_PATH, this.POST_DB_NAME);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) { // use 'append' to overwrite in DB
            writer.write(currentIdx + "|"
                    + post.getTitle() + "|"
                    + post.getAuthor() + "|"
                    + post.getWrittenDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "|"
                    + post.getWrittenTime().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "|"
                    + post.getContent());
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // 4. 게시글 수정
    public void modifyPost(int postIndex, String modifiedTitle, String modifiedContent) {
        if(isInputIndexValid(postIndex) == null) {
            System.out.println("해당 게시글은 존재하지 않습니다.");
            return;
        }

        File file = new File(this.FILE_PATH, this.POST_DB_NAME);
        List<Post> registeredPosts = new ArrayList<>();

        // current posts should be reloaded to prevent the cases when the post is deleted or modified
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] eachContact = line.split("\\|");

                int id = Integer.parseInt(eachContact[0]);
                String title = eachContact[1];
                String author = eachContact[2];
                LocalDate writtenDate = LocalDate.parse(eachContact[3], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                LocalTime writtenTime = LocalTime.parse(eachContact[4], DateTimeFormatter.ofPattern("HH:mm:ss"));
                String content = eachContact[5];

                Post post = new Post(id, title, author, content);
                post.setWrittenDate(writtenDate);
                post.setWrittenTime(writtenTime);

                // selected post
                if(id == postIndex) {
                    post.setTitle(modifiedTitle);
                    post.setContent(modifiedContent);
                    post.setWrittenDate(LocalDate.now()); // modified date
                    post.setWrittenTime(LocalTime.now()); // modified time
                }

                registeredPosts.add(post);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for(Post post : registeredPosts) {
                String eachPost = post.getPostIdx() + "|" +
                                  post.getTitle() + "|" +
                                  post.getAuthor() + "|" +
                                  post.getWrittenDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "|" +
                                  post.getWrittenTime().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "|" +
                                  post.getContent();
                bw.write(eachPost);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("MODIFICATION SUCCESSES!!!");
    }

    // 5. 게시글 삭제
    public void deletePost(int postIndex) {
        if(isInputIndexValid(postIndex) == null) {
            System.out.println("해당 게시글은 존재하지 않습니다.");
            return;
        }

        File file = new File(this.FILE_PATH, this.POST_DB_NAME);
        List<Post> registeredPosts = new ArrayList<>();

        // current posts should be reloaded to prevent the cases when the post is deleted or modified
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] eachPost = line.split("\\|");

                int id = Integer.parseInt(eachPost[0]);
                String title = eachPost[1];
                String author = eachPost[2];
                LocalDate writtenDate = LocalDate.parse(eachPost[3], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                LocalTime writtenTime = LocalTime.parse(eachPost[4], DateTimeFormatter.ofPattern("HH:mm:ss"));
                String content = eachPost[5];

                // no need to add the post which will be deleted to 'registeredPost' (kinda deletion process)
                if (id != postIndex) {
                    Post post = new Post(id, title, writtenDate, writtenTime, author, content);
                    registeredPosts.add(post);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // rewrite db
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for(Post post : registeredPosts) {
                String eachPost = post.getPostIdx() + "|" +
                                  post.getTitle() + "|" +
                                  post.getAuthor() + "|" +
                                  post.getWrittenDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "|" +
                                  post.getWrittenTime().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "|" +
                                  post.getContent();
                bw.write(eachPost);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("DELETION SUCCESSES!!!");
    }

    private int getNextCommentId(int postIndex) {
        int lastCommentId = 0;

        File file = new File(this.FILE_PATH, this.COMMENT_DB_NAME);
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                int postId = Integer.parseInt(parts[0]);
                if (postId == postIndex) {
                    lastCommentId = Integer.parseInt(parts[1]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return lastCommentId + 1;
    }

    // 6. 댓글 등록
    public void writeComment(int postIndex, String newCommentContent, String newCommentAuthor) {
        if(isInputIndexValid(postIndex) == null) {
            System.out.println("해당 게시글은 존재하지 않습니다.");
            return;
        }

        int commentId = getNextCommentId(postIndex);

        File file = new File(this.FILE_PATH, this.COMMENT_DB_NAME);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) { // overwrite
            LocalDate currentDate = LocalDate.now();
            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

            writer.write(postIndex + "|"
                    + commentId + "|"
                    + newCommentContent + "|"
                    + newCommentAuthor + "|"
                    + currentDate.format(dateFormatter) + "|"
                    + currentTime.format(timeFormatter));
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("COMMENTING SUCCESSES!!!");
    }

    // 7. 댓글 조회
    public void viewComment(int postIndex) {
        if(isInputIndexValid(postIndex) == null) {
            System.out.println("해당 게시글은 존재하지 않습니다.");
            return;
        }

        File file = new File(this.FILE_PATH, this.COMMENT_DB_NAME);
        List<Comment> registeredComments = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] eachComment = line.split("\\|");

                int postID = Integer.parseInt(eachComment[0]);
                int commentIdx = Integer.parseInt(eachComment[1]);
                String content = eachComment[2];
                String author = eachComment[3];
                LocalDate writtenDate = LocalDate.parse(eachComment[4], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                LocalTime writtenTime = LocalTime.parse(eachComment[5], DateTimeFormatter.ofPattern("HH:mm:ss"));

                // selected post
                if(postID == postIndex) {
                    Comment comment = new Comment(postID, commentIdx, content, author, writtenDate, writtenTime);
                    registeredComments.add(comment);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        if(registeredComments.isEmpty()) {
            System.out.println("There is no comment. Be a first commenter on this post!\n");
        } else {
            for(Comment eachComment : registeredComments) {
                System.out.println(eachComment.printFormattedString());
            }
        }
    }

    // 8. 댓글 삭제
    public void deleteComment(int postIndex, int commentIndex) {
        if(isInputIndexValid(postIndex) == null) {
            System.out.println("해당 게시글은 존재하지 않습니다.");
            return;
        }

        File file = new File(this.FILE_PATH, this.COMMENT_DB_NAME);
        List<Comment> registeredComments = new ArrayList<>();

        boolean isCommentExists = false;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] eachComment = line.split("\\|");

                int postID = Integer.parseInt(eachComment[0]);
                int commentIdx = Integer.parseInt(eachComment[1]);
                String content = eachComment[2];
                String author = eachComment[3];
                LocalDate writtenDate = LocalDate.parse(eachComment[4], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                LocalTime writtenTime = LocalTime.parse(eachComment[5], DateTimeFormatter.ofPattern("HH:mm:ss"));

                // selected comment exists
                if (commentIdx == commentIndex && postID == postIndex) {
                    isCommentExists = true;
                }

                // no need to add the comment which will be deleted to 'registeredComment' (kinda deletion process)
                if (!(commentIdx == commentIndex && postID == postIndex)) {
                    Comment comment = new Comment(postID, commentIdx, content, author, writtenDate, writtenTime);
                    registeredComments.add(comment);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // no selected comment
        if (!isCommentExists) {
            System.out.println("해당 댓글은 존재하지 않습니다.");
            return;
        }

        // ready to delete
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Comment comment : registeredComments) {
                String eachComment = comment.getPostIdx() + "|" +
                        comment.getCommentIdx() + "|" +
                        comment.getAuthor() + "|" +
                        comment.getContent() + "|" +
                        comment.getWrittenDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "|" +
                        comment.getWrittenTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                bw.write(eachComment);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("DELETION SUCCESSES!!!");
    }
}
