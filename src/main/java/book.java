public class book {

    private String name;
    private String description;
    private int number;
    private String cost;
    private int yearofrelease;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getYearofrelease() {
        return yearofrelease;
    }

    public void setYearofrelease(int yearofrelease) {
        this.yearofrelease = yearofrelease;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", number=" + number +
                ", cost='" + cost + '\'' +
                ", yearofrelease=" + yearofrelease +
                '}';
    }
}

