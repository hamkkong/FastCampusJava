package mycollection;

import java.util.*;

public class BulletinBoard {
    private final Scanner scanner = new Scanner(System.in);
    private final PostManager postManager = new PostManager();

    public void start(){
        while (true){
            System.out.println("게시판 목록");
            System.out.println("1. 조회");
            System.out.println("2. 등록");
            System.out.println("3. 종료");
            System.out.println("선택 : ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // 엔터를 비워줌

            switch (choice){
                case 1:
                    postManager.displayBoard();
                    break;
                case 2:
                    postManager.createPost();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);

                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해 주세요.");

            }
        }
    }
}
