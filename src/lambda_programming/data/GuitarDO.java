package lambda_programming.data;

public class GuitarDO {
    String type;
    String cost;

    public GuitarDO(String type, String cost) {
        this.type = type;
        this.cost = cost;
    }

    public GuitarDO() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
