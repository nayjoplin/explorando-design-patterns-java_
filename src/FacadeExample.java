// FacadeExample.java
public class FacadeExample {
    private final CPU cpu = new CPU();
    private final Memory memory = new Memory();
    private final Disk disk = new Disk();

    public void startSystem() {
        cpu.start();
        memory.load();
        disk.read();
        System.out.println("Sistema iniciado com sucesso!");
    }
}
