package pckg_interface;

public class Superman extends Man implements Fly,RunFast{
    public Superman(String name) {
        super(name);
    }

    public void flyingAbility(){
        System.out.println("Superman can naturally fly...");
    }

    @Override
    public void fastRunningAbility() {
        System.out.println("Superman can run really fast!");
    }
}
