void main() {
    IO.println("Cafe");
    String unicode = "Cafe";
    String emoji = "Java rocks!";
    IO.println(unicode);
    IO.println(emoji);
    byte[] bytes = {72, 101, 108, 108, 111}; // ASCII for "Hello"
    String fromBytes = new String(bytes);
    IO.println(fromBytes);
}