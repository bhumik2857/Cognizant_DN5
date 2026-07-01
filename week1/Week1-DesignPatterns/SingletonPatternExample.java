class Logger {

    private static Logger obj;

    private Logger() {
    }

    public static Logger getInstance() {
        if (obj == null) {
            obj = new Logger();
        }
        return obj;
    }

    public void display(String msg) {
        System.out.println(msg);
    }
}

public class SingletonPatternExample {

    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.display("First Log Message");
        l2.display("Second Log Message");

        if (l1 == l2) {
            System.out.println("Only one object created");
        } else {
            System.out.println("Different objects created");
        }
    }
}