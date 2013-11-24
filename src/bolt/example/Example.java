package bolt.example;

import java.io.File;
import pw.caple.bolt.api.*;

public class Example extends Application {

    @Override
    public void configure(BoltConfig config) {
        File file = new File(getStartupPath(), "web");
        config.addContent(file);
    }

    @Override
    public void onShutdown() {
		
    }

    @Override
    public void onStartup() {
		
    }
	
    @Protocol
    static void hello(Client client) {
        client.call("setBGColor", "red");
    }
}