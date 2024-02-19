import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        MettierProduitImpl mettierProduit= new MettierProduitImpl(new ArrayList<>());
        mettierProduit.add(new Produit(1,"p1",1300000,3));
        mettierProduit.add(new Produit(2,"p2",1600000,2));
        mettierProduit.add(new Produit(3,"p3",1500000,4));
        //System.out.println(mettierProduit.getById(3L));
        mettierProduit.deleteByID(3L);
        List<Produit> produits=mettierProduit.getALL();
        for (Produit produit:produits){
        System.out.println(produit);

}
    }

}
