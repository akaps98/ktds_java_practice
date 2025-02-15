package com.ktdsuniversity.edu.bulletinasm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bulletin bulletin = new Bulletin("/Users/tony/Desktop", "postDB.txt");
        Scanner input = new Scanner(System.in);

        while(true) { // run program
            System.out.println("-".repeat(70));
            System.out.println("기능을 선택하세요.");
            System.out.println("1. 게시글 목록 조회");
            System.out.println("2. 게시글 내용 조회");
            System.out.println("3. 게시글 등록");
            System.out.println("4. 게시글 수정");
            System.out.println("5. 게시글 삭제");
            System.out.println("6. 댓글 등록");
            System.out.println("7. 댓글 조회");
            System.out.println("8. 댓글 삭제");
            System.out.println("0. 종료");
            System.out.print("기능 번호를 입력하세요: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1: // 게시글 목록 조회
                    System.out.println(bulletin.listAllPosts());
                    break;
                case 2: // 게시글 내용 조회
                    System.out.print("게시글 번호 입력: ");
                    int inputPostIndex = input.nextInt();

                    Post selectedPost = bulletin.showDesignatedPost(inputPostIndex);

                    if(selectedPost == null) {
                        System.out.println("존재하지 않는 게시글입니다.");
                    } else {
                        System.out.println(selectedPost.printFormattedString());
                    }
                    break;
                case 3: // 게시글 등록
                    String newTitle;
                    String newAuthor;

                    while(true) {
                        System.out.print("제목을 입력하세요: ");
                        newTitle = input.nextLine().trim();

                        if (!newTitle.isEmpty()) {
                            break;
                        }

                        System.out.println("제목은 필수 입력값입니다. 다시 입력해주세요.");
                    }

                    while(true) {
                        System.out.print("작성자를 입력하세요: ");
                        newAuthor = input.nextLine().trim();

                        if (!newAuthor.isEmpty()) {
                            break;
                        }

                        System.out.println("작성자는 필수 입력값입니다. 다시 입력해주세요.");
                    }

                    System.out.print("내용을 입력하세요: ");
                    String newContent = input.next().trim();

                    Post newPost = new Post(newTitle, newAuthor, newContent);
                    bulletin.writePost(newPost);

                    System.out.println("DONE!");
                    break;
                case 4: // 게시글 수정
                    System.out.print("수정하려는 게시글 번호를 입력하세요. ");
                    int modifiedPostIndex = input.nextInt();

                    String modifiedTitle;

                    while(true) {
                        System.out.print("수정할 제목을 입력하세요: ");
                        modifiedTitle = input.next().trim();

                        if(!modifiedTitle.isEmpty()) {
                            break;
                        }

                        System.out.println("수정할 제목은 필수 입력값입니다. 다시 입력해주세요.");
                    }

                    System.out.print("수정할 내용을 입력하세요: ");
                    String modifiedContent = input.next().trim();



                    bulletin.modifyPost(modifiedPostIndex, modifiedTitle, modifiedContent);
                    break;
                case 5: // 게시글 삭제
                    System.out.print("삭제하려는 게시글 번호를 입력하세요. ");
                    int deletingPostIndex = input.nextInt();

                    System.out.println(deletingPostIndex + "번 게시글을 삭제합니다.\n계속 진행할까요? (y/n)");
                    String doubleCheckPostDeletion = input.next();

                    if(doubleCheckPostDeletion.equalsIgnoreCase("y")) {
                        bulletin.deletePost(deletingPostIndex);
                    } else {
                        System.out.println("삭제가 취소되었습니다.");
                    }

                    break;
                case 6: // 댓글 등록
                    System.out.print("댓글을 등록하려는 게시물 번호를 입력하세요. ");
                    int commentingPostIndex = input.nextInt();

                    String newCommentContent;
                    String newCommentAuthor;

                    while(true) {
                        System.out.print("댓글 내용을 입력하세요: ");
                        newCommentContent = input.nextLine().trim();

                        if (!newCommentContent.isEmpty()) {
                            break;
                        }

                        System.out.println("댓글 내용은 필수 입력값입니다. 다시 입력해주세요.");
                    }

                    while(true) {
                        System.out.print("댓글 작성자를 입력하세요: ");
                        newCommentAuthor = input.nextLine().trim();

                        if (!newCommentAuthor.isEmpty()) {
                            break;
                        }

                        System.out.println("댓글 작성자는 필수 입력값입니다. 다시 입력해주세요.");
                    }

                    bulletin.writeComment(commentingPostIndex, newCommentContent, newCommentAuthor);

                    break;
                case 7: // 댓글 조회
                    System.out.print("댓글을 조회하려는 게시물 번호를 입력하세요. ");
                    int viewPostCommentIndex = input.nextInt();

                    bulletin.viewComment(viewPostCommentIndex);
                    break;
                case 8: // 댓글 삭제
                    System.out.print("댓글을 삭제하려는 게시물 번호를 입력하세요. ");
                    int deleteCommentPostIndex = input.nextInt();

                    System.out.print("댓글의 번호를 입력하세요. ");
                    int deleteCommentCommentIndex = input.nextInt();

                    System.out.println(deleteCommentPostIndex + "번 게시글의 " + deleteCommentCommentIndex + "번 댓글을 삭제합니다.\n계속 진행할까요? (y/n)");

                    String doubleCheckCommentDeletion = input.next();

                    if(doubleCheckCommentDeletion.equalsIgnoreCase("y")) {
                        bulletin.deleteComment(deleteCommentPostIndex, deleteCommentCommentIndex);
                    } else {
                        System.out.println("삭제가 취소되었습니다.");
                    }

                    break;
                case 0: // 시스템 종료
                    System.out.println("게시판을 종료합니다.");
                    input.close();
                    return;
                default: // 존재하지 않는 기능
                    System.out.println("존재하지 않는 기능입니다. 다시 입력하세요.");
            }
        }
    }
}
