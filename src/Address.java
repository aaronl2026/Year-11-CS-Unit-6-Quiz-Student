public class Address {
    private String district;
    private String street;
    private int streetNumber;
    public Address(String district, String street, int streetNumber){
        this.district = district;
        this.street = street;
        this.streetNumber = streetNumber;
    }
    public String getDistrict() {return district;}
    public String getStreet() {return street;}
    public int getStreetNumber() {return streetNumber;}
    public void setDistrict(String x) {district = x;}
    public void setStreet(String x) {street = x;}
    public void setStreetNumber(int x) {streetNumber = x;}
    public String toString(){
        return(streetNumber+" "+street+", "+district);
    }
}
