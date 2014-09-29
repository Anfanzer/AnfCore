package bukkit.anfanzer.anfcore.core;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * AnfCore main class:
 * @author Anfanzer
 */
public class AnfCore extends JavaPlugin
{
    public static AnfCore instance;

    @Override
    public void onEnable()
    {
        instance = this;
    }
}
