public class Main {
    public static void main(String[] args) {
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(),new ConsoleLogger()};
        for(BaseLogger logger:loggers){
            logger.log("Log mesajı");
        }

        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
