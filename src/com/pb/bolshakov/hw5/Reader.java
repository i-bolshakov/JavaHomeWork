package com.pb.bolshakov.hw5;

public class Reader {
    private final String readerFIO;
    private final int readerNumTick;
    private final String readerFacult;
    private final String readerDatBirth;
    private final String readerNumPhone;

    public Reader(String readerFIO, int readerNumTick, String readerFacult, String readerDatBirth, String readerNumPhone) {
        this.readerFIO = readerFIO;
        this.readerNumTick = readerNumTick;
        this.readerFacult = readerFacult;
        this.readerDatBirth = readerDatBirth;
        this.readerNumPhone = readerNumPhone;
    }

    public String getReaderFIO() {
        return readerFIO;
    }

    public String toString() {
        final StringBuilder SB = new StringBuilder();
        SB.append(readerFIO);
        SB.append("(номер читательского билета: ").append(readerNumTick);
        SB.append(", факультет: ").append(readerFacult);
        SB.append(", дата рождения: ").append(readerDatBirth);
        SB.append(", телефон: ").append(readerNumPhone);
        SB.append(")");
        return SB.toString();
    }

    public void takeBook(int countBook) {
        System.out.printf("%s взял(а) %d книг(и)\n", getReaderFIO(), countBook);
    }

    public void takeBook(String ... titles) {
        String listTitles = "";
        int len = titles.length;
        for (int i = 0; i < len; i++) {
            listTitles =  listTitles + titles[i];
            if (i + 1 != len) {
                listTitles = listTitles + ", ";
            }
        }
        System.out.printf("%s взял(а) книг(и): %s\n", getReaderFIO(), listTitles);
    }

    public void takeBook(Book ... books) {
        String listBooks = " ";
        int len = books.length;
        for (int i = 0; i < len; i++) {
            listBooks = listBooks + books[i];
            if (i + 1 != len) {
                listBooks += ", ";
            }
        }
        System.out.printf("%s взял(а) книг(и): %s\n", getReaderFIO(), listBooks);
    }

    public void returnBook(int countBook) {
        System.out.printf("%s вернул(а) %d книг(и)\n", getReaderFIO(), countBook);
    }

    public void returnBook(String... titles) {
        String listTitles = " ";
        int len = titles.length;
        for (int i = 0; i < len; i++) {
            listTitles = listTitles + titles[i];
            if (i + 1 != len) {
                listTitles += ", ";
            }
        }
        System.out.printf("%s вернул(а) книг(и): %s\n", getReaderFIO(), listTitles);
    }

    public void returnBook (Book ... books) {
        String listBooks = " ";
        int len = books.length;
        for (int i = 0; i < len; i++) {
            listBooks = listBooks + books[i];
            if (i + 1 != len) {
                listBooks += ", ";
            }
        }
        System.out.printf("%s вернул(а) книг(и): %s\n", getReaderFIO(), listBooks);
    }
}

