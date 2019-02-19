package cn.nukkit.level.generator.biome;

/**
 * @author MagicDroidX
 * Nukkit Project
 */
public class IcePlainsBiome extends SnowyBiome {

    public IcePlainsBiome() {
        super();
        this.setElevation(63, 81);
        this.temperature = 0.25;
        this.rainfall = 0.8;
    }

    @Override
    public String getName() {
        return "Taiga";
    }
}
