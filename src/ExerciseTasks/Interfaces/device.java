package ExerciseTasks.Interfaces;

public abstract class device {
    private String name;
    private String model;
    private double price;

    public abstract void setName(String name);

    public abstract void setModel(String model);

    public abstract void setPrice(double price);
}
