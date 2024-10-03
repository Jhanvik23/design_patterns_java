package Behavioral_Pattern.Command_Pattern;

public class RemoteControl {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        lightOn.execute();
        lightOff.execute();
    }
}

