package jinny.study.designpattern.gumballmachine.server;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이 품절");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("알맹이 품절");
    }

    @Override
    public void turnCrank() {
        System.out.println("알맹이 품절");
    }

    @Override
    public void dispense() {
        System.out.println("알맹이 품절");
    }
}
