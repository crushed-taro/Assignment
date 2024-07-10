import java.util.ArrayList;
import java.util.List;

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
        System.out.println("[BookRepository] listSearch 메소드 종료됨...");
        for(BookDTO bookDTO : bookDTOList) {
            if(bookDTO.getName().equals(name)) {
                System.out.println("'" + name + "' 책을 찾았습니다."); // TODO
            }
        }
        System.out.println("[BookRepository] listSearch 메소드 종료됨...");
    }
}
