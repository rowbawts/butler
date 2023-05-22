package com.okseby.butler;

import ca.tristan.easycommands.EasyCommands;
import ca.tristan.easycommands.commands.defaults.HelpCmd;
import com.okseby.butler.commands.ShutdownCmd;
import net.dv8tion.jda.api.JDA;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        EasyCommands easyCommands = new EasyCommands();

        JDA jda = easyCommands.addExecutor( // Add your custom commands/executors here!
                new HelpCmd(easyCommands),
                new ShutdownCmd()
	).registerListeners( // Add your custom listeners/events here!
                //new ExampleListener1(),
                //new ExampleListener2()
	).addGatewayIntents(/*leave empty if any*/)
                .addEnabledCacheFlags(/*leave empty if any*/)
                .buildJDA(); // Starts the bot!

        // This is kinda just to suppress an annoying IntelliJ warning.
        System.out.println("JDA Status: " + jda.getStatus());
    }
}
