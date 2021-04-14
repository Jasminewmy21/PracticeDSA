package _12对象的大小;

public class Main {
    public static void main(String[] args) {
        Integer i = new Integer(999999);
        System.out.println(RamUsageEstimator.shallowSizeOf(i));
    }
}
