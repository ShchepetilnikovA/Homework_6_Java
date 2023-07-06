

public class NoteBook {
    private String color;
    private String system;
    private int memory;
    private int ram;


    public NoteBook (String color, String system, int memory, int ram) {
        this.color = color;
        this.system = system;
        this.memory = memory;
        this.ram = ram;
    }


    public String GetColor() {
        return color;
    }


    public String GetSystem() {
        return system;
    }


    public int GetMemory() {
        return memory;
    }


    public int GetRam() {
        return ram;
    }


    @Override
    public String toString () {
        return "<color: " + color + ", system: " + system + ", memory: " + memory + ", ram: " + ram + ">";
    } 
}