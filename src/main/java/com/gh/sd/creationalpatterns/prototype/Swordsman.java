package com.gh.sd.creationalpatterns.prototype;

import static com.gh.sd.creationalpatterns.prototype.State.ATTACKING;
import static com.gh.sd.creationalpatterns.prototype.State.IDLE;

// Doesn't support cloning - a unique game unit
public class Swordsman extends GameUnit {

    private State state = IDLE;

    public void attack() {
        this.state = ATTACKING;
    }

    @Override
    public String toString() {
        return "Swordsman " +
            "state= " + state +
            " @ " + getPosition().toString();
    }

    @Override
    protected void reset() {
        state = IDLE;
    }
}
