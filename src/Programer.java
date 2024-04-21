class Programer extends Employee {
    private String programmingLanguage;
    private String position;

    public Programer(String name1, String name2, String address, double birthday, String programmingLanguage) {
        super(name1, name2, address, birthday);
        this.position = position;
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public String getPosition() {
        return position;
    }
}
