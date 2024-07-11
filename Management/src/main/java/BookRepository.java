import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookRepository {

    private List<BookDTO> bookDTOList = new ArrayList<>();

    public void listRegit(BookDTO bookDTO) {
        System.out.println("[BookRepository] listRedit 메소드 실행됨...");
        bookDTOList.add(bookDTO);
        System.out.println("[BookRepository] listRedit 메소드 종료됨...");
    }

    public void listSearch() {
        System.out.println("[BookRepository] listSearch 메소드 실행됨...");
        System.out.println("총 " + bookDTOList.size() + "개의 책이 검색됐습니다.");
        for(BookDTO bookDTO : bookDTOList) {
            System.out.println("{ Name : " + bookDTO.getName() +
                    ", Author : " + bookDTO.getAuthor() +
                    ", Publisher : " + bookDTO.getPublisher() +
                    ", Price : " + bookDTO.getPrice() + "}");
        }
        System.out.println("[BookRepository] listSearch 메소드 종료됨...");
    }

    public void listModify(String name) {
        System.out.println("[BookRepository] listModify 메소드 실행됨...");
        Scanner sc = new Scanner(System.in);
        int no;
        for(BookDTO bookDTO : bookDTOList) {
            if(bookDTO.getName().equals(name)) {
                System.out.println("'" + name + "' 책을 찾았습니다."); // TODO
                System.out.println("1. 책 제목 변경.");
                System.out.println("2. 책 저자 변경.");
                System.out.println("3. 책 출판사 변경.");
                System.out.println("4. 책 가격 변경.");
                System.out.print(" >>> ");
                no = sc.nextInt();

                switch(no){
                    case 1 :
                        System.out.println("책 제목을 변경합니다.");
                        System.out.print(" >>>> ");
                        bookDTO.setName(sc.nextLine());
                        break;
                    case 2 :
                        System.out.println("책 저자를 변경합니다.");
                        System.out.print(" >>>> ");
                        bookDTO.setAuthor(sc.nextLine());
                        break;
                    case 3 :
                        System.out.println("책 출판사를 변경합니다.");
                        System.out.print(" >>>> ");
                        bookDTO.setPublisher(sc.nextLine());
                        break;
                    case 4 :
                        System.out.println("책 가격을 변경합니다.");
                        System.out.print(" >>>> ");
                        bookDTO.setPrice(sc.nextInt());
                        break;
                    default:
                        System.out.println("[Caution] 잘못된 값을 입력하였습니다.");
                        return;
                }
            }
        }
        System.out.println("[BookRepository] listModify 메소드 종료됨...");
    }

    public void listDelete(String name) {
        System.out.println("[BookRepository] listDelete 메소드 실행됨...");
        for(BookDTO bookDTO : bookDTOList) {
            if (bookDTO.getName().equals(name)) {
                System.out.println("[Info] " + name + "을 찾았습니다.");
                bookDTOList.remove(bookDTO);
                System.out.println("[Info] " + name + "을 지웠습니다.");
            }
        }
        System.out.println("[BookRepository] listDelete 메소드 종료됨...");
    }
}
