package GameApp;

public class PacMan implements GamingConsole{
private  String name = " Pacman";
    @Override
    public void jump() {
        System.out.println(name +" is jumping.");
    }

    @Override
    public void down() {
        System.out.println(name +" is down.");

    }

    @Override
    public void left() {
        System.out.println(name +" is left.");

    }

    @Override
    public void right() {
        System.out.println(name +" is right.");

    }
}
