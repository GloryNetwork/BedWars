package com.andrei1058.bedwars.arena.tasks;

import com.andrei1058.bedwars.api.arena.GameState;
import com.andrei1058.bedwars.api.arena.generator.IGenerator;
import com.andrei1058.bedwars.api.arena.team.ITeam;
import com.andrei1058.bedwars.arena.Arena;

public class ForgeTask implements Runnable {

    private Arena arena;

    public ForgeTask(Arena arena) {
        this.arena = arena;
    }

    public Arena getArena() {
        return arena;
    }

    @Override
    public void run() {
        if(arena.getStatus() != GameState.playing) return;
        for (ITeam team : arena.getTeams()) {
            for (IGenerator generator : team.getGenerators()) {
                generator.spawn();
            }
        }
    }
}
