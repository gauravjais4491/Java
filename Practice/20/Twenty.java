import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Twenty {
    public static void main(String[] args) {
        ArrayList<Product> productsLists=new ArrayList<Product>();
        productsLists.add(new Product(1,"HP",200000f));
        productsLists.add(new Product(2,"Leneovo",500000f));
        productsLists.add(new Product(3,"ASUS",800000f));
        productsLists.add(new Product(4,"DELL",100000f));
        productsLists.add(new Product(5,"Apple Laptop",1000000f));
        List<Float> productPriceList2=productsLists.stream().filter(p -> p.price>300000).map(a -> a.price).collect(Collectors.toList());
        System.out.println(productPriceList2);
    }
}
class Product{
    int id;
    String name;
    float price;
    public Product(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
