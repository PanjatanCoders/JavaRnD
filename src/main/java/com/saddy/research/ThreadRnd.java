//old way of using Java Thread
//void main() {
//    ExecutorService executor = Executors.newFixedThreadPool(10);
//    executor.submit(() -> {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        IO.println("Task done");
//    });
//}

// New way of Java Thread
void main() {
    try(ExecutorService service = Executors.newVirtualThreadPerTaskExecutor()) {
        for(int i = 0; i < 100000; i++) {
            service.submit(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                IO.println("Done: " + Thread.currentThread().threadId());
            });
        }
    }
}