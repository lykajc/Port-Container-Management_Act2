import java.util.*;

// Container klase
class Container {
    private final String id;
    private final String Con_desc;
    private final int weight;

    public Container(String id, String Con_desc, int weight){
        this.id = id;
        this.Con_desc = Con_desc;
        this.weight = weight;
    }

    public String toString(){
        return String.format("%s,%s,%dkg", id,Con_desc,weight);
    }
}

//Shipment klase
class Shipment {
    private final String Ship_name;
    private final String Cap_name;

    public Shipment(String Ship_name, String Cap_name){
        this.Ship_name = Ship_name;
        this.Cap_name = Cap_name;
    }

    public String toString(){
        return String.format("%s |Capt. %s", Ship_name, Cap_name);
    }

}

//MAIN CLASS
public class Port_Container_Management {
    private static final ArrayDeque<Container> ConStack = new ArrayDeque<>();
    private static final ArrayDeque<Shipment> ShipQue = new ArrayDeque<>();
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do{
            print_Menu();
            choice = readInt("\nEnter your choice, please: ");

            switch (choice){

                case 1: Store_Container();
                    break;
                case 2: View_PortCon();
                    break;
                case 3: RegisterArrShip();
                    break;
                case 4: ViewWaitingShip();
                    break;
                case 5: LoadNextShip();
                    break;
                case 0: System.out.println("\nExiting program, byebye\n");
                    break;
                default: System.out.println("\nInvalid choice. Try again.\n");
            }
        }while (choice != 0);

    }

    private static void print_Menu() {
        System.out.println("\n====== Welcome to Port Container Management ======\n");
        System.out.println("(1) Store Container (Push)");
        System.out.println("(2) View Port Containers ");
        System.out.println("(3) Register arriving ship (enqueue)");
        System.out.println("(4) View waiting ships");
        System.out.println("(5) Load next ship (pop container + poll ship)");
        System.out.println("(0) Exit System");
    }

    private static void Store_Container(){
        System.out.println("\nEnter Container ID: ");
        String id = scan.nextLine();
        System.out.println("\nEnter Container Description: ");
        String Con_desc = scan.nextLine();
        int weight = readInt("\nPlease Enter Weight in (kg): ");

        Container cons = new Container( id , Con_desc , weight);
        ConStack.push(cons);

        System.out.println("Data Stored: " + cons);
    }

    private static void View_PortCon(){
        System.out.println("\nwatatops->");
        if(ConStack.isEmpty()){
            System.out.println("No Containers is stored");
        }else{
            for(Container con : ConStack){
                System.out.println(con);
            }
        }
        System.out.println("<- Bottomless");
    }

    private static void RegisterArrShip(){
        System.out.println("\nEnter Ship Name: ");
        String Ship_name = scan.nextLine();
        System.out.println("\nEnter Captain Name: ");
        String Cap_name = scan.nextLine();

        Shipment ships = new Shipment( Ship_name , Cap_name);
        ShipQue.add(ships);
        System.out.println("\n Ship Registered: " + ships);
    }

    private static void ViewWaitingShip(){
        System.out.println("\nAtubangs ->");
        if(ShipQue.isEmpty()){
            System.out.println("\nNo Ship is waiting dams");
        }else {
            for(Shipment sheps : ShipQue){
                System.out.println(sheps);
            }
        }
        System.out.println("<-Luyo");
    }

    private static void LoadNextShip(){
        if(ConStack.isEmpty()){
            System.out.println("No container is available to load");
            return;
        }

        if(ShipQue.isEmpty()){
            System.out.println("No ships is available to loading");
            return;
        }
        Container containers = ConStack.pop();
        Shipment shipment = ShipQue.poll();

        System.out.println("\nLoaded: " + containers + " to " + shipment);
        System.out.println("Available Containers: " + ConStack.size());
        System.out.println("Available ships waiting: " + ShipQue.size());
    }

    private static int readInt(String input) {
        while (true) {
            try {
                System.out.print(input);
                return Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter a valid number.");
            }
        }
    }
}
