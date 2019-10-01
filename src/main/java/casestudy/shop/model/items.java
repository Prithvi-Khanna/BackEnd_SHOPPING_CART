package casestudy.shop.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "items" )
public class items implements Serializable
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long ProductId;
    private String name ;
    private String description;
    private double price;
    private String img;
    private String category;
    private String subcategory;

    public items(){}

    public items(String name, String description, double price, String img, String category, String subcategory) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.img = img;
        this.category = category;
        this.subcategory = subcategory;
    }

    @Column( nullable = false , columnDefinition = " int default '1'")
    private int active;

    @Embedded
    private Itemdetails itemdetails;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getImg() {return img; }

    public String getCategory() {
        return category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) { this.description = description;    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }


    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Itemdetails getItemdetails() {
        return itemdetails;
    }

    public void setItemdetails(Itemdetails itemdetails) {
        this.itemdetails = itemdetails;
    }

}
