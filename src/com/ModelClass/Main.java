package com.ModelClass;

public class Main {

    public static void main(String[] args){

        System.out.println("Hello World");
    }

//1 Question
    public class Book {

    public String title;
    public String author;
    public int numberOfPages;
    }

    //2 Question

    public class Car {

        public String model;
        public int year;
        public boolean isElectric;
    }

//3 Question

    public class Calculator {

        public double result;

        double a;
        double b;



        public double add() {
            result = a + b;
            return result;
        }


        public double subtract() {
            result = a - b;
            return result;
        }


        public double multiply() {
            result = a * b;
            return result;
        }

        public double divide() {

            result = a / b;
            return result;
        }
    }


    //4 Question


    public class BankAccount {

        public String accountHolderName;
        public double balance;


        public void deposit(double amount) {

            }


        public boolean withdraw(double amount) {


            return true;
        }


        public double getBalance() {
            return balance;
        }

    }

    //5 Question

    public class Library {

        public List<Book> books;




        public boolean addBook(Book book) {

            books.add(book);
            return true;
        }

        public boolean removeBook(String title) {

            books.remove(book);
            return true;

        }

        public Book searchBook(String title) {

            return null;

        }


    }


    //6 Question

    public class ShoppingCart {

        public List<Item> items;

        public void addItem() {

        }

        public boolean removeItem() {

            return false;
        }


        public double getTotalPrice() {

        }

    }

    public class Item {

        public String name;
        public double price;
    }


    //7 Question

    public class Student {

        public String name;
        public int age;
    }

    public class Course {

        public String courseName;
        public List<Student> students;
    }


    //8 Question

    public class Player {

        public String name;
        public String position;
    }

    public class Team {

        public String teamName;
        public List<Player> players;
    }





}
