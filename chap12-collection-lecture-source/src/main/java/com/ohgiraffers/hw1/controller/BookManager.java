package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.practice.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

    ArrayList<BookDTO> booklist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public BookManager() {}

    public void addBook(BookDTO book) {
        // 해당 BookDTO 객체를 리스트에 담기
    }

    public void deleteBook(int index) {}

    public void searchBook(String title) {}

    public void displayAll() {}


}
