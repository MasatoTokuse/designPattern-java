package mediator;

public class ConcreteColleagueC extends Colleague {

    public ConcreteColleagueC(String name) {
        super(name);
    }

    public void advice(String msg) {
        System.out.println("ConcreteColleagueC:" + msg);
    }

    public void run() {
        mediator.consultation(this);
    }
}
