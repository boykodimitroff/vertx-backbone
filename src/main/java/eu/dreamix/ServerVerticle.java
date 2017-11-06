import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;

import static io.vertx.ext.sync.Sync.fiberHandler;

/**
 * @author Boyko Dimitrov on 11/6/17.
 */
public class ServerVerticle extends AbstractVerticle {

    @Override
    public void start() {
        HttpServer server = vertx.createHttpServer();
        Router router = Router.router(vertx);

        initRoutes(router);

        server.requestHandler(router::accept).listen(8080);
    }

    private void initRoutes(Router router) {
        MainDispatcher mainDispatcher = new MainDispatcher();

        router.route(HttpMethod.GET, "/ping").handler(fiberHandler(mainDispatcher::ping));
    }
}
