public class ManagementMain {

    public static void main(String[] args) {

        BookService bookService = new BookService();

        while(true) {




            int no = 1;
            switch (no) {
                case 1 : bookService.regit(); break;
                case 2 : bookService.search(); break;
                case 3 : bookService.modify(); break;
                case 4 : bookService.delete(); break;
                case 9 :
                    System.out.println("프로그램 종료.");
                    return;
                default: break;
            }
        }
    }
}
