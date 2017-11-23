package Java;

import java.io.Serializable;

public class Lion implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sound;

    public Lion(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
