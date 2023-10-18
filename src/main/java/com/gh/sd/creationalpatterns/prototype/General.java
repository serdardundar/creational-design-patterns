package com.gh.sd.creationalpatterns.prototype;

import static com.gh.sd.creationalpatterns.prototype.State.IDLE;
import static com.gh.sd.creationalpatterns.prototype.State.MORAL_BOOST;

public class General extends GameUnit {
    private State state = IDLE;

    public void boostMorale() {
        this.state = MORAL_BOOST;
    }

    @Override
    public String toString() {
        return "General " +
            "state=" + state +
            " @ " + getPosition();
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }
}
