package bukkit.anfanzer.anfcore.util;

import bukkit.anfanzer.anfcore.core.AnfCore;
import org.bukkit.ChatColor;

/**
 * Server helper class:
 * @author Anfanzer
 */
public class ServerHelper
{
    private static final AnfCore main = AnfCore.instance;

    public static void sendConsoleMessage(ChatColor color, String message)
    {
        main.getServer().getConsoleSender().sendMessage(color + "[" + main.getDescription().getName() + "]" + message);
    }
}
