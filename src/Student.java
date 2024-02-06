public class Student {
    private int age;
    private String firstName;
    private String lastName;
    private int year;
    private Address address;
    public Student(int age, String firstName, String lastName, int year, Address address){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.address = address;
    }
    public int getAge() {return age;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getYear() {return year;}
    public Address getAddress() {return address;}
    public void setAge(int x) {age = x;}
    public void setFirstName(String x) {firstName = x;}
    public void setLastName(String x) {lastName = x;}
    public void setYear(int x) {year = x;}
    public void setAddress(Address x) {address = x;}
    private void addOneAge(){
        age = age + 1;
    }
    public int birthday(){
        addOneAge();
        return age;
    }
    public String toString(){
        return(firstName+" "+lastName+", age "+age+", year "+year+", "+address);
    }
}
