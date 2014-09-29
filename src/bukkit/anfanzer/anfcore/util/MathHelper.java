package bukkit.anfanzer.anfcore.util;

import java.util.Random;

/**
 * Math helper class:
 * @author Anfanzer
 */
public class MathHelper
{
    public static final double GOLDEN_RATIO = 1.618033988749895;

    public static int randomFromRange(int lower, int upper)
    {
        return new Random().nextInt((upper - lower) + 1) + lower;
    }
}
