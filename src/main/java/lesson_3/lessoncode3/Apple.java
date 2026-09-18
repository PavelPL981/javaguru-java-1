package lesson_3.lessoncode3;

public class Apple {

    private String sort;
    private String color;
    private int weight;

    public Apple(String sort, String color, int weight) {
        this.sort = sort;
        this.color = color;
        this.weight = weight;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "sort='" + sort + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
