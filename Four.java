public class Four extends Two{
    public Four() {
        super();
    }

    public void methodFour(){
        methodTwo();
        System.out.println("method four does something");
    }

    public void test() {
        FourDemo fd = new FourDemo();
        fd.methodFourDemo();
    }

    private class FourDemo {
        public void methodFourDemo() {
            System.out.println("method fourDemo does somthing");
            methodFour();
        }
    }
}
