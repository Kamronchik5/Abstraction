public class Cat extends Animal{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void name() {
        System.out.println(name);
    }
    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    void sound() {
        System.out.println(sound);
    }
}
