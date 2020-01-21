
import org.newdawn.slick.*;
import org.newdawn.slick.Image;

public class IslandInvasion extends BasicGame {

    private Image water, land, vIsland, sIsland, cIsland;

    public IslandInvasion(String title) {
        super(title);
    }

    public void init(GameContainer gc) throws SlickException {
        water = new Image("images/water.png");
        land = new Image("images/land.png");
        vIsland = new Image("images/vIsland.png");
        sIsland = new Image("images/sIsland.png");
        cIsland = new Image("images/cIsland.png");
    }

    public void update(GameContainer gc, int i) throws SlickException {

    }

    public void render(GameContainer gc, Graphics g) throws SlickException {

        water.draw(0, 0);
        land.draw(0, 300, 340, 340);
        sIsland.draw(360, 200, 360, 360);
        vIsland.draw(130, 15, 310, 310);
        cIsland.draw(480, 10, 320, 320);

    }

    public static void main(String args[]) throws SlickException {
        IslandInvasion game = new IslandInvasion("Testing Game");
        AppGameContainer app = new AppGameContainer(game);
        app.setDisplayMode(800, 600, false);
        app.setShowFPS(false);
        app.setTargetFrameRate(200);
        app.start();
    }

}
