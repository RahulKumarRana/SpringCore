package GameApp;

class  GameRunner{
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public  void run(){
        System.out.println(game+" is running.");
        game.jump();
        game.down();
        game.left();
        game.right();
    }
}