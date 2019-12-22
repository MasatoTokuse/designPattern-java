package mediator;

public class MediatorSample {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colA = new ConcreteColleagueA("A");
        Colleague colB = new ConcreteColleagueB("B");
        Colleague colC = new ConcreteColleagueC("C");
        mediator.addColleague(colA);
        mediator.addColleague(colB);
        mediator.addColleague(colC);
        colA.setMediator(mediator);
        colB.setMediator(mediator);
        colA.run();
        colB.run();
    }
}
