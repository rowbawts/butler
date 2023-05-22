package com.okseby.butler.commands;

import ca.tristan.easycommands.commands.EventData;
import ca.tristan.easycommands.commands.slash.SlashExecutor;
import ca.tristan.easycommands.database.MySQL;

public class ShutdownCmd extends SlashExecutor {
    @Override
    public String getName() {
        return "shutdown";
    }

    @Override
    public String getDescription() {
        return "Shuts down the bot";
    }

    @Override
    public boolean isOwnerOnly() {
        return false;
    }

    @Override
    public void execute(EventData data, MySQL mySQL) {
        data.reply("Goodbye!", false).queue();
        data.getJda().shutdown();
    }

}
