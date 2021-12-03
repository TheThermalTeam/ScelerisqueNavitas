package io.github.TheThermalTeam.scelerisque_navitas.common.core;

public class heat {
    //Create a container for blocks that has to update their heat values

    //Check on neighbour change event if the neighbour is a heat source
    //If the blocks input heat unit is higher than possible output heat unit then add the block to the container
    //If the blocks input heat unit is lower than possible output heat unit then remove the block from the container

    //Input heat unit/tick is determined as follows:
    double Teq=0;
    double Tstart=0;
    int timeRequired = (block_capacity/(Math.sqrt(block_tranferCoef*neighbour_transferCoef)))*Math.log((Teq-Tstart)/(0.01*Teq))/Math.log(Math.exp(1));
}
