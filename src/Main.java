public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.add("zero");
        array.add("one");
        array.add("two");
        array.add("three");
        array.add("four");

        System.out.println("Your element: " + array.get(0));
        System.out.println("Yor arrays is empty? - " + array.isEmpty());
        array.add("five", 1);
        System.out.println(array.get(1));
//        array.clear();
//        array.remove(1);
        System.out.println(array.contains("four"));
        System.out.println(array.indexOf("two"));
        System.out.println(array.lastIndexOf("zero"));
        System.out.println(array.toString());
    }
}
