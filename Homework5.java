class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public Computer(String cpu, String memory, String hd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }
    public void turnOn() {
        System.out.println("Turning on the computer."); // [cite: 1655]
    }
    public void printInfo() {
        System.out.println("The spec of the computer"); // [cite: 1657]
        System.out.println("CPU: " + this.cpu); // [cite: 1658]
        System.out.println("Memory: " + this.memory); // [cite: 1659]
        System.out.println("HDD: " + this.hd); // [cite: 1660]
        System.out.println("Color: " + this.color); // [cite: 1661]
        System.out.println("Power: " + this.power); // [cite: 1662]
    }
}

class Monitor {
    private String monitorSize;
    private String color;
    private String power;

    public Monitor(String monitorSize, String color, String power) {
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }
    public void turnOn() {
        System.out.println("Turning on the monitor."); // [cite: 1656]
    }
    public void printInfo() {
        System.out.println("The spec of the monitor"); // [cite: 1663]
        System.out.println("Size: " + this.monitorSize); // [cite: 1664]
        System.out.println("Color: " + this.color); // [cite: 1665]
        System.out.println("Power: " + this.power); // [cite: 1666]
    }
}

class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }
    public void turnOn() {
        this.computer.turnOn();
        this.monitor.turnOn();
    }
    public void printInfo() {
        this.computer.printInfo();
        this.monitor.printInfo();
    }
}

public class Homework5 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("32인치", "검은색", "45W");
        Computer computer = new Computer("Core i7", "32GB", "2TB", "흰색", "700W");
        PersonalComputer pc = new PersonalComputer(computer, monitor);

        pc.turnOn();
        pc.printInfo();
    }
}