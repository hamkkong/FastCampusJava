package mycollection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Board {
    ArrayList<HashMap<String,Object>> boardTable = new ArrayList<>();
    SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Board board = new Board();
        /*
        ArrayList와 HashMap을 샤용해 게시판 테이블을 만들고,
        조회, 등록, 수정 , 삭제가 가능한 게시판을 만들어 주세요.

        번호, 제목, 내용, 작성자, 작성일
        목록에서는 조회, 등록, 종료
        상세화면에서는 수정, 삭제, 목록
         */
        board.start();
    }
    private void start(){
        while (true){
            System.out.println("게시판 목록");
            System.out.println("1. 조회");
            System.out.println("2. 등록");
            System.out.println("3. 종료");
            System.out.println("선택 : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayBoard();
                    break;
                case 2:
                    createPost();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해 주십시오.");

            }
         }
    }

    private void displayBoard(){
        if(boardTable.isEmpty()){
            System.out.println("게시글이 없습니다.");
        } else {
            System.out.println("게시판 목록");
            for (HashMap<String, Object> post : boardTable) {
                System.out.println("번호:" + post.get("BOARD_NO"));
                System.out.println("제목:" + post.get("TITLE"));
                System.out.println("내용:" + post.get("CONTENT"));
                System.out.println("작성자:" + post.get("USER_NAME"));
                System.out.println("작성일:" + post.get("REG_DATE"));
            }
        }
    }
    private  void createPost(){
        HashMap<String, Object> post = new HashMap<>();
        int maxBoardNo = 0;

        // Find the maximum BOARD_NO
        for (HashMap<String, Object> existingPost : boardTable){
        int boardNo = (int) existingPost.get("BOARD_NO");
        if(boardNo > maxBoardNo){
            maxBoardNo = boardNo;
            }
        }

        post.put("BOARD_NO", maxBoardNo + 1);
        System.out.println("제목 : ");
        post.put("TITLE", scanner.nextLine());
        System.out.println("내용 : ");
        post.put("CONTENT", scanner.nextLine());
        System.out.println("작성자 : ");
        post.put("USER_NAME", scanner.nextLine());
        post.put("REG_DATE", new Date());

        boardTable.add(post);

        System.out.println("작성하신 게시글이 등록되었습니다.");

    }
}
