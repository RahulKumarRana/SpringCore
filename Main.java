package GameApp;

public class Main {
    public static void main(String[] args) {
//             MarioGame game = new MarioGame();
//             SuperContra game2=new SuperContra();
//             GameRunner runner=new GameRunner(game);
//        GameRunner runner2=new GameRunner(game2);
//        runner2.run();
//        runner.run();
        PacMan pac=new PacMan();
        GameRunner runer= new GameRunner(pac);
        runer.run();
    }
}
