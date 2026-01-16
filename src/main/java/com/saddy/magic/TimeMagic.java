void main() {
    LocalDate today = LocalDate.now();
    IO.println(today.toString());
    IO.println(today.plusDays(10000));
    IO.println(today.plusDays(10000).getDayOfWeek());

//    Calculate your age
    long days = ChronoUnit.DAYS.between(LocalDate.of(1991, 4, 5), today);
    IO.println("You are " + days + " days old.");
}