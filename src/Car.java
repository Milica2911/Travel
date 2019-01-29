
public class Car {

    private String model;
    private int maxSpeed;
    private double weight;
    private String licence;

    private double mileage;
    private int currentFuel;
    private int maxFuel;
    private int consumption; // per 1 km

    public Car() {
        this.model = "Demo";
        this.maxSpeed = 120;
        this.weight = 1000;
        this.licence = "testing drive";
        this.mileage = 0;
        this.maxFuel = 50;
        this.consumption = 1;
        this.currentFuel = 50;

    }

    ;
    
    public Car(String customModel, String customLicence) {
        this.model = customModel;
        this.licence = customLicence;
    }

    ;
    
    public Car(String model, int maxSpeed, double weight, String license, double mileage, int currentFuel, int maxFuel, int consumption) {
       this.model = model;
       this.maxSpeed = maxSpeed;
       this.weight = weight;
       this.licence = licence;
       this.mileage = mileage;
       this.currentFuel = currentFuel;
       this.maxFuel = maxFuel;
       this.consumption = consumption;
   }
    
    
    public void printAttributes() {

        System.out.println("Model: " + this.model);
        System.out.println("Maksimalna brzina: " + this.maxSpeed);
        System.out.println("Tezina je: " + this.weight);
        System.out.println("Registracija: " + this.licence);
        System.out.println("Kilometraza: " + this.mileage);
        System.out.println("Potrosnja: " + this.consumption);
        System.out.println("Stanje rezervoara: " + this.currentFuel);
        System.out.println("");
    };
    
    public void setWeight(double customWeight) {
        this.weight = customWeight;
    };
    
    public double getWeight() {
        return this.weight;
    };
    
    public void setConsumption(int customConsumption){
        this.consumption = customConsumption;
    };
    
    public void travel(int distance) {
        if (this.currentFuel > distance * this.consumption) {
            this.mileage = this.mileage + distance;
            this.currentFuel = this.currentFuel - this.consumption * distance;
        } else {
            System.out.println("Nema dovoljno goriva za taj put!");
        }
        
    }
    
    public void fuelUp() {
        System.out.println("U automobil " + this.model + " je sipano " + (this.maxFuel - this.currentFuel) + " litara goriva.");
        this.currentFuel = this.maxFuel;
    }
    
    public void fuelUp2() {
        double fuiled = this.maxFuel - this.currentFuel;
        System.out.println("U automobil " + this.model + " je sipano " + fuiled + " litara goriva.");
         
    }
    
    
    
    
    
    
    
    

}
