void main() {
    int statusCode = 302;

    IO.println("*".repeat(40));
    IO.println(classify(statusCode));
}

String classify(int statusCode) {
    return switch (statusCode) {
        case 200        -> "OK";
        case 301, 302  -> "Redirect";
        case 400        -> "Bad Request";
        case 404        -> "Not Found";
        case 500        -> "Server Error";
        case int n when n >= 200 && n < 300 -> "Success";
        case int n when n >= 400 && n < 500 -> "Client Error";
        default         -> "Unknown";
    };
}