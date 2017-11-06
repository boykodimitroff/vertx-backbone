import co.paralleluniverse.fibers.Suspendable;
import io.vertx.ext.web.RoutingContext;

/**
 * @author Boyko Dimitrov on 11/6/17.
 */
public class MainDispatcher {

    @Suspendable
    public void ping(RoutingContext routingContext) {
        routingContext.response().end("Pong");
    }
}
