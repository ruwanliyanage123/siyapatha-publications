package server;

import controller.BookController;
import org.glassfish.jersey.server.ResourceConfig;

public class BookServer extends ResourceConfig {
    public BookServer(){
        register(BookController.class);
    }
}
