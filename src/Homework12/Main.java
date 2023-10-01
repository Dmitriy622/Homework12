package Homework12;

public class Main {
    public static void main(String... args) {
        Author golden = new Author("Артур", "Голден");
        Author kipling = new Author("Редьярд", "Киплиг");

        Book memoirsOfAGeisha = new Book("Мемуары гейши", 1997, golden);
        Book theJungleBook = new Book("Книга джунглей", 1895, kipling);
        theJungleBook.setPublishingYear(1894); //изменил год с 1895 на 1894

        //Сократили нижнюю часть в классе Book с помощью геттера FullName
        //System.out.println(memoirsOfAGeisha.getTitle() +" " + memoirsOfAGeisha.getPublishingYear() +" " +memoirsOfAGeisha.getAuthor().getName() +" " +memoirsOfAGeisha.getAuthor().getSurname());
        //Теперь код выглядит так:
        System.out.println(memoirsOfAGeisha.getTitle() +" " +memoirsOfAGeisha.getPublishingYear() +" " +memoirsOfAGeisha.getAutorFullName());
        System.out.println(theJungleBook.getTitle() +" " +theJungleBook.getPublishingYear() +" " +theJungleBook.getAutorFullName());

        print(memoirsOfAGeisha);
        print(theJungleBook);

    }
//Но можно сократить запись еще больше и сделать всё в автоматическом режиме
    private static void print(Book book) {
        System.out.println(book.getTitle() +" " +book.getPublishingYear() +" " +book.getAutorFullName());
    }
    //Осталось лишь написать: print(и указать название книги в скобках)

}