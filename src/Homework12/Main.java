package Homework12;

public class Main {
    public static void main(String... args) {
        Author golden = new Author("Артур", "Голден");
        Author kipling = new Author("Редьярд", "Киплиг");

        Book memoirsOfAGeisha = new Book("Мемуары гейши", 1997, golden);
        Book theJungleBook = new Book("Книга джунглей", 1895, kipling);
        theJungleBook.setPublishingYear(1894); //изменил год с 1895 на 1894

        printInfo(memoirsOfAGeisha);
        printInfo(theJungleBook);

        System.out.println("Сравнение авторов " +golden.equals(kipling));
        System.out.println("Сравнение книг " +memoirsOfAGeisha.equals(theJungleBook));

    }

    private static void printInfo(Book book) {
        System.out.println(book);
        System.out.println(book.hashCode());
    }

}