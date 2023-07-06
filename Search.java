import java.util.*;






public class Search {
    

    public static HashMap<String, Object> getSettings() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Object> filter = new HashMap<>();
        System.out.println("Hello? I can help choose notebook for you!");
        
        System.out.print("Select some characteristic: \n 1 - color\n 2 - system\n 3 - memory \n 4 - ram \n");
        int operation = scanner.nextInt();
        
        if (operation == 1) {
            System.out.print("Input value: ");
            filter.put("color", scanner.next());
        }
        if (operation == 2) {
            System.out.print("Input value: ");
            filter.put("system", scanner.next());
        }
        if (operation == 3) {
            System.out.print("Input value: ");
            filter.put("memory", scanner.nextInt());
        }
        if (operation == 4) {
            System.out.print("Input value: ");
            filter.put("ram", scanner.nextInt());
        }
        
        scanner.close();

        
        
        return filter;
    }


    public static void filter (HashSet<NoteBook> nbSet, HashMap<String, Object> charact) {
        if(charact.containsKey("color")){
            for (NoteBook item : nbSet) {
                if (item.GetColor().contains((String)charact.get("color"))) {
                    System.out.print(item);
                }
            }
        }
        if(charact.containsKey("system")){
            for (NoteBook item : nbSet) {
                if (item.GetSystem().contains((String)charact.get("system"))) {
                    System.out.print(item);
                }
            }
        }
        if(charact.containsKey("memory")){
            for (NoteBook item : nbSet) {
                if (item.GetMemory() >= (Integer) charact.get("memory")) {
                    System.out.print(item);
                }
            }
        }
        if(charact.containsKey("ram")){
            for (NoteBook item : nbSet) {
                if (item.GetRam() >= (Integer) charact.get("ram")) {
                    System.out.print(item);
                }
            }
        }
    }
    

    public static void main(String[] args) {
        HashSet<NoteBook> nbSet = new HashSet<NoteBook>();
        nbSet.add(new NoteBook("grey", "linux", 512, 1024));
        nbSet.add(new NoteBook("black", "windows", 256, 2048));
        nbSet.add(new NoteBook("white", "windows", 1024, 3096));
        nbSet.add(new NoteBook("white", "linux", 512, 3096));
        nbSet.add(new NoteBook("grey", "windows", 1024, 1024));
        
        filter(nbSet, getSettings());
    }
}
