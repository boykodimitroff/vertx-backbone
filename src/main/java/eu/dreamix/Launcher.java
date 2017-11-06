import io.vertx.core.Vertx;

/**
 * @author Boyko Dimitrov on 11/6/17.
 */
public class Launcher {

    public static void main(String args[]) {
        Vertx.vertx().deployVerticle(new ServerVerticle());
    }
}
