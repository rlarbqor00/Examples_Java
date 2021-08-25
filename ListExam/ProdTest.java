package ListExam;

import java.util.ArrayList;
import java.util.List;

public class ProdTest {
    public void getInfo(List list) {
        Product prod = null;
        String code = null;
        String name = null;
        String color = null;
        int qty = 0;
        
        for(int i=0; i<list.size(); i++) {
            prod=(Product)list.get(i);

            code=prod.getCode();
            name=prod.getName();
            color=prod.getColor();
            qty=prod.getQty();

            System.out.println("제품번호 : " + code);
            System.out.println("제품이름 : " +name);
            System.out.println("제품색상 : " +color);
            System.out.println("제품수량 : " +qty);
            System.out.println();

        }
    }
    public static void main(String[] args) {
        ArrayList pList = new ArrayList();
        Product p1 =new Product();
        Product p2 = new Product("0002", "노트북", "White", 200);
        Product p3 = new Product("0003", "태블릿", "Red", 30);

        pList.add(p1);
        pList.add(p2);
        pList.add(p3);

        ProdTest p =new ProdTest();

        p.getInfo(pList);

        
    }
    



    
    
}
