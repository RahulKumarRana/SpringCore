package GameApp;

public class SuperContra implements GamingConsole{
    String game="contra";
    @Override
    public void jump() {
        System.out.println(game+" is jumping");
    }

    @Override
    public void down() {
        System.out.println(game+" is down");
    }

    @Override
    public void left() {
        System.out.println(game+" is left");
    }

    @Override
    public void right() {
        System.out.println(game+" is right");
    }
}
