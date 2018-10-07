package pl.sdacademy.jvm.valuePassing;

public class TestPassingValue {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user);
        testPassingVal1(user);
        System.out.println(user);

        int testInt = 10;
        testPassingValInt(testInt);
        System.out.println(testInt);
    }

    private static void testPassingVal1(User user) {
        user = new User();
        user.setMessage("Changed");
    }

    private static void testPassingValInt(int testInt) {
        testInt = 20;
    }

    private static class User {
        private String message = "Hi";

        public String getMessage() {
            return message;
        }

        void setMessage(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return message;
        }
    }
}