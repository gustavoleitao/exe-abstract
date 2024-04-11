public class Product extends Entity{

    private double price;

    private String name;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String fileName() {
        return Util.filename(getClass(),name);
    }

    @Override
    public boolean validar() {
        return price > 0;
    }

    public String getName() {
        return name;
    }
}
