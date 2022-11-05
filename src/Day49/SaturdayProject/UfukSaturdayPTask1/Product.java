package Day49.SaturdayProject.UfukSaturdayPTask1;

public enum Product {
    COMPUTER("Macbook",1000.5,1200.30),
    IPHONE("Iphone",800.40,875.95),
    TABLET("Ipad",250,285.35),
    PLAYSTATION("PS4",450.10,500.05);

    private final String productname;
    private  final double buyPrice;
    private  final double sellPrice;

    Product(String productname, double buyPrice, double sellPrice) {
        this.productname = productname;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getProductname() {
        return productname;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
