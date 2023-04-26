package dasturlash.uz;

import java.util.List;

public class Book {
    private String title;
    private List<String> headers;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", headers=" + headers + '}';
    }
}
