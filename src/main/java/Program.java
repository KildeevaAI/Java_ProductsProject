
import java.util.*;

public class Program {

    public static void main(String[] args) {

        Vegetables pr1 = new Vegetables("Огурец", 15, 3);
        Meat pr2 = new Meat("Говядина", 187, 2);
        Vegetables pr3 = new Vegetables("Морковь", 41, 3);
        Meat pr4 = new Meat("Свинина", 259, 2);
        Vegetables pr5 = new Vegetables("Помидор", 18, 3);
        Meat pr6 = new Meat("Курица", 190, 2);
        Vegetables pr7 = new Vegetables("Лук", 41, 3);

        Meal Meal1 = new VegMeal();
        Meal Meal2 = new MeatMeal();
        Meal Meal3 = new VegMeal();


        Meal1.setProducts(new HashSet<Products>(Arrays.asList(pr1, pr5)));
        Meal2.setProducts(new HashSet<Products>(Arrays.asList(pr4, pr6)));
        Meal3.setProducts(new HashSet<Products>(Arrays.asList(pr3, pr5, pr7)));

        Comparator<Products> comparator = new Comparator<Products>() {

            public int compare(Products o1, Products o2) {
                return o1.getCalorificValue() - o2.getCalorificValue();
            }
        };
        List<Products> products = new ArrayList<Products>(Meal1.getProducts());
        Collections.sort(products, comparator);
        System.out.println(products);

        int lowLint = 15;
        int highLint = 100;
        List<Products> requiredCalorificList = findByCalorific(Meal1.getProducts(), lowLint, highLint);

        System.out.println(requiredCalorificList);

    }
    public static List<Products> findByCalorific(Set<Products> t, int lowLint, int highLint) {
        List<Products> result = new ArrayList<Products>();

        for (Products products : t) {
            if (products.getCalorificValue() >= lowLint && products.getCalorificValue() <= highLint) {
                result.add(products);
            }
        }
        return result;
    }

}

