package mycollection;

import java.text.SimpleDateFormat;
import java.util.*;

public class PostManager {
    private final ArrayList<HashMap<String, Object>> boardTable = new ArrayList<>();
    private final SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");

    public void displayBoard(){
        if (boardTable.isEmpty()){
            System.out.println("게시글이 없습니다.");
        } else {
            System.out.println("게시판 목록");
            for(HashMap<String, Object> post : boardTable) {
                System.out.println("번호:" + post.get("BOARD_NO"));
                System.out.println("제목:" + post.get("TITLE"));
                System.out.println("내용:" + post.get("CONTENT"));
                System.out.println("작성자:" + post.get("USER_NAME"));
                System.out.println("작성일:" + post.get("REG_DATE"));
            }
        }

    }
    public void createPost(){
        HashMap<String,Object> post = new HashMap<>();
        int maxBoardNo =0;

        for (HashMap<String,Object> existingPost : boardTable){
            int boardNo = (int)existingPost.get("BOARD_NO");
            if (boardNo>maxBoardNo){
                maxBoardNo = boardNo;
            }
        }
        Scanner scanner = new Scanner(System.in);
        post.put("BOARD_NO",maxBoardNo + 1);
        System.out.println("제목 : ");
        post.put("TITLE",scanner.nextLine());
        System.out.println("내용 : ");
        post.put("CONTENT", scanner.nextLine());
        System.out.println("작성자: ");
        post.put("USER_NAME", scanner.nextLine());
        post.put("REG_DATE", new Date());

        boardTable.add(post);
        System.out.println("작성하신 게시글이 등록되었습니다.");
    }
}
