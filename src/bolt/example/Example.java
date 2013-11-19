package bolt.example;

import pw.caple.bolt.api.*;

public class Example extends Application {

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