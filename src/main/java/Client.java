public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("STate #1");
        originator.setState("STate #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("STate #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("STate #4");

        System.out.println("Current State: " + originator.getState());
        originator.getSTateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getSTateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());


    }
}
