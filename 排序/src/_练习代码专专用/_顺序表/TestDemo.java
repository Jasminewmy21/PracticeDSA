package _练习代码专专用._顺序表;

/**
 * 测试
 */
public class TestDemo {
    public static void main(String[] args) {
        MySequenceImpl mySequence = new MySequenceImpl();

        for (int i = 0; i < 10; i++) {
            mySequence.add(i,i);
        }

        System.out.println("在长度10的顺序表里插入数据: ");
        mySequence.display();
        System.out.println("-------------");

        for (int i = 10; i < 20; i++) {
            mySequence.add(i,i);
        }
        System.out.println("扩容: ");
        mySequence.display();
        System.out.println("-------------");

        System.out.println("随机位置插入数据: ");
        mySequence.add(9,"KrisWu");
        mySequence.display();
        System.out.println("-------------");

        System.out.println("search查找一个数据: " + mySequence.search("KrisWu"));
        System.out.println("contains查找一个数据: " + mySequence.contains("KrisWu"));
        System.out.println("-------------");

        System.out.println("查找某一个位置的值: " + mySequence.get(9));
        System.out.println("-------------");

        System.out.println("删除一个数据: " + mySequence.remove("KrisWu"));
        mySequence.display();
        System.out.println("-------------");

        System.out.println("得到顺序表的长度: " + mySequence.size());
    }
}
