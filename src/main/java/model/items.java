package model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "items" )
public class items implements Serializable
{
  @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int ProductId;
    private String name ;
    private String details;
    private double price;
    private String image;
    private String category;
    private String subcategory;

    public items(){}

    public items(int productId, String name, String details, double price, String image, String category, String subcategory) {
        ProductId = productId;
        this.name = name;
        this.details = details;
        this.price = price;
        this.image = image;
        this.category = category;
        this.subcategory = subcategory;
    }

    @Column( nullable = false , columnDefinition = " int default '1'")
    private int active;

    @Embedded
    private Itemdetails itemdetails;

    public int getProductId() {
        return ProductId;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public String getCategory() {
        return category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
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
