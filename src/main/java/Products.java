public class Products {
    private String Name;
    private int CalorificValue;
    private int Amount;

    Products() {
    }

    public Products(String Name, int CalorificValue, int Amount) {
        this.Name = Name;
        this.CalorificValue = CalorificValue;
        this.Amount = Amount;
    }

     public void displayInfo(){
        System.out.printf("Name: %s CalorificValue: %d Amount: %d \n", Name, CalorificValue, Amount);
    }

    @Override
    public String toString() {
        return "Products{" +
                "Name=" + Name + '\'' +
                " CalorificValue=" + CalorificValue +
                " Amount=" + Amount +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCalorificValue() {
        return CalorificValue;
    }

    public void setCalorificValue(int calorificValue) {
        CalorificValue = calorificValue;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }
}