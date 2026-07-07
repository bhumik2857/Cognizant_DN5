class Logger {

    // Single instance
    private static Logger instance;

    // Private constructor
    private Logger() {
    }

    // Method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log method
    public void display(String message) {
        System.out.println("Log: " + message);
    }
}

public class SingletonPatternExample {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.display("Application Started");
        logger2.display("User Logged In");

        if (logger1 == logger2) {
            System.out.println("Singleton Pattern Verified: Only one Logger object exists.");
        } else {
            System.out.println("Multiple Logger objects created.");
        }
    }
}