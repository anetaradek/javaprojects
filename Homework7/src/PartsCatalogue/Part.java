package PartsCatalogue;

public class Part {
    private String name;
    private String brand;
    private Integer partNumber;

    public Part(String name, String brand, Integer partNumber) {
        this.name = name;
        this.brand = brand;
        this.partNumber = partNumber;
    }

    public Integer getPartNumber() {
        return partNumber;
    }

    @Override
    public String toString() {
        return "Part{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", partNumber=" + partNumber +
                '}';
    }
}
//For popular automotive service we need to implement catalogue with parts.
//Each part has the next properties: part-number, brand, name.
//We should choose the best option for storing parts in catalogue to have possibility of quick getting them by part-number.