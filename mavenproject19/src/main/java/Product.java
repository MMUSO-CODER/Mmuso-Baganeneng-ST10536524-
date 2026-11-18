    public class Product implements IProducts {

    // Single-dimensional array for product names
    private final String[] productNames;
    // Two-dimensional array for sales: [product][month]
    private final int[][] sales;

    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }

    // Q1.2 - Method for total products sold
    public int getTotalProductsSold() {
        int total = 0;
        for (int[] sale : sales) {
            for (int j = 0; j < sale.length; j++) {
                total += sale[j];
            }
        }
        return total; 
     
    }

    // Method for average products sold
    public double getAverageProductsSold() {
        int total = getTotalProductsSold();
        int count = sales.length * sales[0].length; // 3 products x 3 months = 9
        return (double) total / count;
    }

    //  Method for most popular product (highest total sales)
    public String getMostPopularProduct() {
        int maxTotal = 0;
        int maxIndex = 0;

        for (int i = 0; i < sales.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
               }
            
            if (productTotal > maxTotal) {
                maxTotal = productTotal;
                maxIndex = i;
            }
        }
        // Returns e.g. Cozy Nights Monarch(63)
        return productNames[maxIndex] + "(" + maxTotal + ")";
    }

    // Helper to get total per product if you need it
    public int getProductTotal(int productIndex) {
        int total = 0;
        for (int j = 0; j < sales[productIndex].length; j++) {
            total += sales[productIndex][j];
        }
        return total;
    }
}

        
        
                
                
               


