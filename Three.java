public class Three extends Two{
    public Three() {
        super();
    }

    public void methodThree() {
        methodOne();
        methodTwo();
        System.out.println("method three does something");
    }
}
