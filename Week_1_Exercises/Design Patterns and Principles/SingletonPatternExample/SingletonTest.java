public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Logger 1 message.");
        logger2.log("Logger 2 message.");

         //Check if both loggers are the same instance
        System.out.println(logger1 == logger2);  
    }
}
