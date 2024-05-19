package homework2.task3;

public class Computer {
    static class Processor {
        private String model;

        public String getDetails() {
            return model;
        }
    }

    class RAM {
        private int size;

        public String getDetails() {
            return Integer.toString(size);
        }
    }
}
