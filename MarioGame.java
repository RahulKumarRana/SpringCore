package GameApp;

public class MarioGame implements  GamingConsole{
    private  String CharcterName ="Super man";

    @Override
    public void jump() {
        System.out.println(CharcterName +" is jumping.");
    }

    @Override
    public void down() {
        System.out.println(CharcterName +" is Down.");

    }

    @Override
    public void left() {
        System.out.println(CharcterName +" is going left.");

    }

    @Override
    public void right() {
        System.out.println(CharcterName +" is going right.");

    }
}
