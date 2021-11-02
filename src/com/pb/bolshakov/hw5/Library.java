package com.pb.bolshakov.hw5;

public class Library {
    private static Book[] books = new Book[10];
    private static int indexBook = 0;
    private static Reader[] readers = new Reader[10];
    private static int indexReader = 0;

    public static void main(String[] args) {

        Book book1 = new Book("Приключения", "Иванов И. И.", 2000);
        Book book2 = new Book("Словарь", "Сидоров А. В.", 1980);
        Book book3 = new Book("Энциклопедия", "Гусев К. В.", 2010);

        Reader reader1 = new Reader("Петров В. В.", 1, "Отличный", "08.03.1939", "38(063)1234567");
        Reader reader2 = new Reader("Скворцов С. С.", 2, "Хороший", "28.06.1949", "38(050)1234567");
        Reader reader3 = new Reader("Пяточкин А. А.", 3, "Лучший", "07.11.1959", "38(067)1234567");

        addBook(book1); addBook(book2); addBook(book3);
        addReader(reader1); addReader(reader2); addReader(reader3);

        System.out.println("\n··· Печатаются все книги ···\n");
        printAllBooks();

        System.out.println("\n··· Печатаются все читатели ···\n");
        printAllReaders();

        System.out.println("\n··· Печатаются все варианты метода \"takeBook\" ···\n");
        reader1.takeBook(4);
        reader2.takeBook(book1.getTitle(), book3.getTitle(), book2.getTitle());
        reader3.takeBook(book2, book1, book3);

        System.out.println("\n··· Печатаются все варианты метода \"returnBook\" ···\n");
        reader2.returnBook(5);
        reader3.returnBook(book3.getTitle(), book2.getTitle(), book1.getTitle());
        reader1.returnBook(book1, book2, book3);
    }
    private static void addBook(Book book) {
        books[indexBook++] = book;
    }

    private static void addReader(Reader reader) {
        readers[indexReader++] = reader;
    }
    public static void printAllBooks() {
        System.out.println("Перечень книг: ");
        for (int i = 0; i < indexBook; i++) {
            System.out.println(" - " + books[i]);
        }
    }
    public static void printAllReaders() {
        System.out.println("Перечень читателей: ");
        for (int i = 0; i < indexReader; i++) {
            System.out.println(" - " + readers[i]);
        }
    }
}