/*
 public int saleAnalyze(int sale[][], double price[], double benchmark) 會對 sale[][] 內的銷售進行分析，回傳為總銷售額大於 benchmark 的分店數量。 sale[i][j] 記錄分店 i, 在產品 j 上的銷售量, price[k] 紀錄 產品 k 的價格（每個分店的都一樣）。產品的總銷售是各產品的銷售量乘以價格後的加總。

程式需檢查 (1) 兩個陣列在產品的數量上需要一致 (2) 產品的銷售量必須介於 0-1000。

請完成程式，並用 JUnit 進行完整測試，對於例外的情況需要進行測試。

例：sale: [ [800, 80, 90], [0, 10, 20] ] 
weight: [200, 30, 20]
benchmark: 10,000
 */
package Fruit;

public class Sales {
    public int saleAnalyze(int sales[][], double price[], double benchmark) throws Exception {

        int branch_count = sales.length; // 分店數量
        int product_count = price.length; // 產品數量
        boolean no_branch = (branch_count == 0 ? true : false);
        boolean no_product = (product_count == 0 ? true : false);

        if (no_branch || no_product) {
            throw new Exception("no branch or no product");
        } else {
            for (int[] branch : sales) {
                if (branch.length != product_count)
                    throw new Exception("not consistent");
            }
        }

        double subtotal = 0;
        int branch_idx = 0;
        int res = 0; // result; number of branch whose market totol is over benchmark

        for (int[] branch : sales) {
            subtotal = 0;
            for (double pr : price) {
                subtotal += pr * branch[branch_idx];
            }
            if (subtotal >= benchmark)
                res++;
        }
        return res;
    }
}
