public class Manufacturer {
    private String name;
    private String country;

    public Manufacturer() {
        this.name = "";
        this.country = "Viet Nam";
    }

    public Manufacturer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}