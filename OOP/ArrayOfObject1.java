package Object_Oriented_Programing;

public class ArrayOfObject1 {

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Product 1", 9.99, 5);
        products[1] = new Product("Product 2", 19.99, 3);
        products[2] = new Product("Product 3", 29.99, 1);

        for (Product product : products) {
            System.out.println(product.getName() +" "+ product.getPrice() +""+ product.getQuantity() );
        }
        //Get total value of products;
        System.out.println("Total Value of Products: " + Product.totalValue(products));

        System.out.println("==============Before Sorting============");
        for (Product product : products) {
            System.out.println(product.getName() +" "+ product.getPrice() +""+ product.getQuantity() );
        }
        Product.sortByPrice(products);
        System.out.println("==============After Sorting============");
        for (Product product : products) {
            System.out.println(product.getName() +" "+ product.getPrice() +""+ product.getQuantity() );
        }
        System.out.println("============================");

        Product.howManyproduct15( products);

        Product.productsPriceMoreThan15(products,2);
        }

    }

    class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }



        public static double totalValue(Product[] products){
            double totalValue=0;
            for (Product product:products) {
                totalValue+=product.getPrice() * product.getQuantity();
            }
            return totalValue;
        }
        /*   double total=0;
        for (int i = 0; i < products.length; i++) {
            total=total+(products[i].getQuantity()*products[i].getPrice());
        }
        System.out.println("Total Value of Products: " + total);*/

        //Sorting array of object by price with ascending.
        public static Product[] sortByPrice(Product[] array){ //9 19 29
           // Product product1=array[0];
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j].getPrice() < array[i].getPrice()) {
                       Product product1 = array[i];
                        array[i] = array[j];
                        array[j] = product1;
                    }
                }
            }
            return array;
        }
        public static Product[] sorttByPrice(Product[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j].getPrice() > array[j + 1].getPrice()) {
                        Product temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            return array;
        }

        public static void howManyproduct15(Product[] products){
            int counter=0;
            for (int i = 0; i < products.length; i++) {
                if (products[i].getPrice() > 15)
                    counter++;
            }
            System.out.println(counter);
        }

        public static void productsPriceMoreThan15(Product[] products,int length){

            Product[] newProduct = new Product[length];

            int index=0;

            for (int i = 0; i < products.length; i++) { //9 19 29

                if (products[i].getPrice() > 15) {
                    newProduct[index]=products[i];
                    index++;
                }
            }
            for (Product product:newProduct) {
                System.out.println(product.getName() +" "+product.getPrice() +" " + product.getQuantity() );
            }
        }
        // Alternative way that we do not want to assign the length of new array.
        /*   public static void productsPriceMoreThan15(Product[] products) {
                Product[] newProduct = new Product[products.length];
                int j = 0;
                for (int i = 0; i < products.length; i++) {
                    if (products[i].getPrice() > 15) {
                        newProduct[j] = products[i];
                        j++;
                    }
                }
                for (Product product : newProduct) {
                    if (product != null) {
                        System.out.println(product.getName() + " " + product.getPrice() + " " + product.getQuantity());
                    }
                }
            }*/
    }


