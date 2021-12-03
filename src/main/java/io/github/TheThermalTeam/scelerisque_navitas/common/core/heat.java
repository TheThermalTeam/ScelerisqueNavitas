package io.github.TheThermalTeam.scelerisque_navitas.common.core;

public class heat {
    //Create a container for blocks that has to update their heat values

    //Check on neighbour change event if the neighbour is a heat source
    //If the blocks input heat unit is higher than possible output heat unit then add the block to the container
    //If the blocks input heat unit is lower than possible output heat unit then remove the block from the container

    //Input heat unit/tick is determined as follows:
    public static double blocksHeatEmission() {
        for (int i = 0; ) {
            double Teq = 0;
        double Tcurr = 0;
        double heatPerTick = (Math.sqrt(block.coef * neighbour.coef) / block.capacity) * (Teq - Tcurr);
    }
}
