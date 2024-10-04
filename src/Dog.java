public class Dog extends Animal{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    void name() {
        System.out.println(name);
    }
    private String sound;

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    void sound() {
        System.out.println(sound);
    }
}
