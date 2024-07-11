import java.util.Scanner;

public class ManagementMain {

    public static void main(String[] args) {

        BookService bookService = new BookService();
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("========== Book Main ==========");
            System.out.println("1. 책 추가하기.");
            System.out.println("2. 책 검색하기.");
            System.out.println("3. 책 수정하기.");
            System.out.println("4. 책 삭제하기.");
            System.out.println("9. 프로그램 종료하기.");
            System.out.print(" > ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : bookService.regit(); break;
                case 2 : bookService.search(); break;
                case 3 : bookService.modify(); break;
                case 4 : bookService.delete(); break;
                case 9 :
                    System.out.println("프로그램 종료.");
                    return;
                default:
                    System.out.println("잘못된 숫자를 선택했습니다.");
                    break;
            }
        }
    }
}
