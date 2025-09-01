// App.java
public class App {
    public static void main(String[] args) {
        System.out.println("=== Design Patterns em Java (puro) ===\n");

        // ---------- Singleton ----------
        System.out.println("[Singleton]");
        SingletonExample s1 = SingletonExample.getInstance();
        SingletonExample s2 = SingletonExample.getInstance();
        System.out.println("Mesma instância? " + (s1 == s2));
        System.out.println();

        // ---------- Strategy ----------
        System.out.println("[Strategy]");
        StrategyExample strategy = new StrategyExample();

        strategy.setOperation(new SumOperation());
        System.out.println("10 + 5 = " + strategy.execute(10, 5));

        strategy.setOperation(new MultiplyOperation());
        System.out.println("10 * 5 = " + strategy.execute(10, 5));
        System.out.println();

        // ---------- Facade ----------
        System.out.println("[Facade]");
        FacadeExample facade = new FacadeExample();
        facade.startSystem();

        System.out.println("\n✔ Execução concluída.");
    }
}
