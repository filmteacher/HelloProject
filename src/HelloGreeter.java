public class HelloGreeter {

    String greeting;

    public HelloGreeter(String greeting) {
        this.greeting = greeting;
    }

    public void showRepeatGreeting(int numgreets)
        {
           for (int i = 1; i <= numgreets; i++) {
               System.out.println(greeting);
           }
        }
}
