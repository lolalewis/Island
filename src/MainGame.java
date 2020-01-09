
import org.newdawn.slick.*;
import org.newdawn.slick.Image;

public class MainGame extends BasicGame {

    private Image water, land;

    public MainGame(String title) {
        super(title);
    }

    public void init(GameContainer gc) throws SlickException {
        water = new Image("images/water.png");
        land = new Image("images/land.png");
    }

    public void update(GameContainer gc, int i) throws SlickException {

    }

    public void render(GameContainer gc, Graphics g) throws SlickException {
        water.draw(0, 0);
        land.draw(0,0);
    }

    public static void main(String args[]) throws SlickException {
        MainGame game = new MainGame("Testing Game");
        AppGameContainer app = new AppGameContainer(game);
        app.setDisplayMode(800, 600, false);
        app.setShowFPS(false);
        app.setTargetFrameRate(200);
        app.start();
    }

}
