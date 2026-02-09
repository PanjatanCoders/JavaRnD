import static java.lang.IO.println;

void main() {
    println("Hello World");
    List<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("World");

    Map<String, Integer> map = new HashMap<>();
    map.put("Hello", 1);
    map.put("World", 2);

    println(list);
    println(map);
}

class A extends Person{
    public A(String name, int age) {
        // Validate BEFORE calling super — now legal in Java 25!
        if (age < 18 ){
            throw new IllegalArgumentException();
        }
        super(name, age);
    }
}
class Person{
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}