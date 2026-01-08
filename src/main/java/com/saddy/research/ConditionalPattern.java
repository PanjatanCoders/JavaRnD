void main() {
    String str = handleObjects("Selenium");
    IO.println("*".repeat(40));
    IO.println(str);
    IO.println("*".repeat(40));
}

//Old School way of writing code
//String handleObjects(Object object) {
//    if(object instanceof String str) {
//        return "Length of the String is " + str.length();
//    } else if (object instanceof Integer) {
//        Integer i = (Integer) object;
//        return "Integer value is " + i;
//    } else if (object == null) {
//        return "Object is null";
//    } else  {
//        return "Object is " + object.getClass();
//    }
//}

//Modern way of same code using switch
//String handleObjects(Object object) {
//    return switch (object) {
//        case String s -> "Length of the String is:" + s.length();
//        case Integer i -> "Integer value is " + i;
//        case null -> "null object";
//        default -> "Unknown type: " + object.getClass();
//    };
//}

// Guarded patterns - switch-case with condition
String handleObjects(Object object) {
    return switch (object) {
        case String s when  s.isBlank() -> "String is empty";
        case String s -> "String is not empty";
        case Integer i when  i >= 0 -> "Positive number";
        case Integer i -> "Number is not positive";
        default -> "Something else";
    };
}


