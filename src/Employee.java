class Employee {
    private String name1;
    private String name2;
    private String address;
    private double birthday;

    public Employee(String name1, String name2, String address, double birthday) {
        this.name1 = name1;
        this.name2 = name2;
        this.address = address;
        this.birthday = birthday;
    }
    public String getName1() {
        return name1;
    }
    public String getName2() {
        return name2;
    }
    public String getAddress() {
        return address;
    }
    public double getBirthday() {
        return birthday;
    }

}
