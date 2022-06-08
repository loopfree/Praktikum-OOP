// Steven
// 13520131
// Minggu 10: Praktikum 3

class Bike extends NonMotorizedVehicle implements Rideable
{
    public Bike() {
        name = "Bike";
    }

    public Bike(String name) {
        this.name = name;
    }

    public void ride() {
        System.out.println("Riding a " + name);
    }
    
    public String getName() {
        return name;
    }
}