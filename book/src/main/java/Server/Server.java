package Server;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class Server {
    public static void main(String[] args) {
        int port = 8080;
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(port).build();
        ResourceConfig config = new BookServer();
        JdkHttpServerFactory.createHttpServer(baseUri, config);
        System.out.println("Server started on port " + port);
    }
}
