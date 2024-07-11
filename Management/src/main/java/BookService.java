import java.util.Scanner;

public class BookService {

    public void regit() {
        System.out.println("[BookService] regit 메소드 실행됨...");
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        BookDTO bookDTO = new BookDTO();
        BookRepository bookRepository = new BookRepository();

        System.out.println("책의 제목을 입력하세요.");
        System.out.print(" >> ");
        bookDTO.name = sc.nextLine();

        System.out.println("책의 저자를 입력하세요.");
        System.out.print(" >> ");
        bookDTO.author = sc.nextLine();

        System.out.println("책의 출판사를 입력하세요.");
        System.out.print(" >> ");
        bookDTO.publisher = sc.nextLine();

        System.out.println("책의 가격을 입력하세요.");
        System.out.print(" >> ");
        bookDTO.price = sc.nextInt();

        bookRepository.listRegit(bookDTO);

        System.out.println("[BookService] regit 메소드 종료됨...");
    }

    public void search() {
        System.out.println("[BookService] search 메소드 종료됨...");
        BookRepository bookRepository = new BookRepository();
        bookRepository.listSearch();
        System.out.println("[BookService] search 메소드 종료됨...");
    }

    public void modify() {
        System.out.println("[BookService] modify 메소드 실행됨...");
        Scanner sc = new Scanner(System.in);

        BookRepository bookRepository = new BookRepository();
        System.out.println("책의 이름을 검색하세요.");
        System.out.print(" >> ");
        String name = sc.nextLine();

        bookRepository.listModify(name);

        System.out.println("[BookService] modify 메소드 종료됨...");
    }

    public void delete() {
        System.out.println("[BookService] delete 메소드 실행됨...");
        Scanner sc = new Scanner(System.in);
        BookRepository bookRepository = new BookRepository();
        System.out.println("삭제하려는 책의 이름을 입력하세요.");
        System.out.print(" >> ");
        String name = sc.nextLine();

        bookRepository.listDelete(name);

        System.out.println("[BookService] delete 메소드 종료됨...");

    }


}
