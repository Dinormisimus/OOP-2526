public class Session {
    private int events = 0;

    public class Tracker{
        public void hit(){events++;}
        public int count(){return events;}
    }

    public Tracker tracker(){
        return new Tracker();
    }
}
