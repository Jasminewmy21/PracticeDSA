package com.itheima._09图书馆里案例;

import java.rmi.registry.LocateRegistry;
import java.util.*;

/**
 *
 */
public class BookSystem {
    /**
     * 1.定义一个集合表示图书馆用于存储书本信息数据:Map<String, List<Book>>
     *   使用Map集合,key是橱柜的栏目类型名称,value是橱柜上的书,用List集合对象存储每一本书
     */
    public static final Map<String, List<Book>> BOOK_STORE = new HashMap<>();
    public static final Scanner SYS_SCANNER = new Scanner(System.in);

    public static void main(String[] args){
        showCommand();
    }

    private static void showCommand() {

        System.out.println("===========欢迎使用图书系统===========");
        System.out.println("1.查看全部书籍");
        System.out.println("2.添加书籍");
        System.out.println("3.删除书籍");
        System.out.println("4.修改书籍");
        System.out.println("5.退出系统");
        System.out.print("请输入你的选择:");

        String command = SYS_SCANNER.nextLine();
        switch (command) {
            case "1":
                queryBook();
                break;
            case "2":
                addBook();
                break;
            case "3":
                deleteBook();
                break;
            case "4":
                updateBook();
                break;
            case "5":
                System.out.println("期待你的下次访问");
                System.exit(0);
                break;
            default:
                System.err.println("输入有误,请重新确认");
        }
        showCommand();
    }

    private static void deleteBook() {
        if(BOOK_STORE.size() == 0){
            System.out.println("暂无数据,无法删除");
            return;
        }

        queryBook();

        System.out.println("===========欢迎删除书本===========");
        while(true) {
            System.out.print("请问你要删除的书的栏目:");
            String type = SYS_SCANNER.nextLine();

            if (BOOK_STORE.containsKey(type)) {
                while(true) {
                    System.out.print("请问你要删除的书名:");
                    String name = SYS_SCANNER.nextLine();
                    //根据栏目和书名去寻找这本书对象
                    Book book = getBookByTypeAndName(type, name);

                    if (book == null) {
                        System.out.println("不存在这本书");
                    }else{
                        List<Book> books = BOOK_STORE.get(type);
                        books.remove(book);
                        System.out.println("删除成功");
                        queryBook();
                        return;
                    }
                }
            } else {
                System.out.println("栏目不存在,请确认.");
            }
        }


    }

    private static void updateBook() {
        if(BOOK_STORE.size() == 0){
            System.out.println("暂无数据,无法修改");
            return;
        }

        queryBook();
        System.out.println("===========欢迎修改书本===========");
        lo:while (true){
            System.out.print("请输入修改书本的栏目:");
            String type = SYS_SCANNER.nextLine();
            if(BOOK_STORE.get(type) == null){
                System.out.println("该栏目没有书,请先添加");
                return;
            }

            if(BOOK_STORE.containsKey(type)){
                while(true){
                    System.out.print("请输入要修改的书名:");
                    String name = SYS_SCANNER.nextLine();
                    //判断该栏目下是否存在该书本对象
                    Book book = getBookByTypeAndName(type,name);
                    if(book == null){
                        System.out.println("书本不存在,请重新输入");
                    }else{
                        System.out.print("请输入新书名:");
                        String newName = SYS_SCANNER.nextLine();

                        double newPrice = 0;
                        while (true){
                            try{
                                System.out.print("请输入新价格:");
                                String Price = SYS_SCANNER.nextLine();
                                newPrice = Double.valueOf(Price);
                                break;
                            }catch (Exception e){
                                System.out.println("价格不合理,请检查.");
                            }
                        }

                        System.out.print("请输入新作者:");
                        String newAuthor = SYS_SCANNER.nextLine();

                        book.setName(newName);
                        book.setPrice(newPrice);
                        book.setAuthor(newAuthor);
                        queryBook();
                        System.out.println("修改成功");
                        break lo;
                    }
                }
            }
        }
    }

    /**
     * 在某个栏目下,根据书名查询这本书对象并返回
     * @param type 栏目名称
     * @param name 书名
     * @return 书本对象
     */
    public static Book getBookByTypeAndName(String type, String name){
        List<Book> books = BOOK_STORE.get(type);
        for(Book book : books){
            if(name.equals(book.getName())){
                return book;
            }
        }
        return null;//没这本书
    }

    private static void queryBook() {
        if(BOOK_STORE.size() == 0){
            System.out.println("暂无数据,无法查看");
            return;
        }

        System.out.println("===========欢迎查询书本===========");
        System.out.println("类型\t\t书名\t\t\t\t价格\t\t作者");
        BOOK_STORE.forEach((type, books) -> {
            System.out.println(type);
            for(Book book : books){
                System.out.println("\t\t\t\t"+book.getName()+"\t\t\t\t"+book.getPrice()+"\t\t\t\t"+book.getAuthor());
            }
        });
    }

    //添加
    private static void addBook() {
        System.out.println("===========欢迎添加书本===========");
        System.out.print("请你输入添加书本的栏目:");
        String type = SYS_SCANNER.nextLine();

        List<Book> books = null;
        //1.判断是否存在该栏目
        if(BOOK_STORE.containsKey(type)){
            books = BOOK_STORE.get(type);
        }else {
            books = new ArrayList<>();
            BOOK_STORE.put(type, books);
        }

        Book book = info();

        books.add(book);
        System.out.println("添加在"+type+"栏目的"+book.getName()+"成功.");
    }

    public static Book info(){
        System.out.print("请输入书名:");
        String name = SYS_SCANNER.nextLine();
        System.out.print("请输入价格:");
        String price = SYS_SCANNER.nextLine();
        System.out.print("请输入作者:");
        String author = SYS_SCANNER.nextLine();

        Book book = new Book(name,Double.valueOf(price),author);

        return book;
    }

}
