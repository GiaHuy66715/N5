public class Manufacturer {
    private String name;
    private String origin;

    public Manufacturer() {
        this.name = "";
        this.origin = "";
    }

    public Manufacturer(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
