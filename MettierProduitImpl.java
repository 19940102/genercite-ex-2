import java.util.List;

public class MettierProduitImpl  implements  IMetier<Produit,Long> {
List<Produit> produits;

    public MettierProduitImpl(List<Produit> produits) {
        this.produits = produits;
    }

    @Override
    public void add(Produit o) {
      produits.add(o);
    }

    @Override
    public List<Produit> getALL() {
        return produits;
    }

    @Override
    public Produit getById(Long id) {
       for (Produit p:produits){
        if (p.getId() ==id)
       return p;
       }
        return null;
    }

    @Override
    public void deleteByID(Long id) {
 Produit produit =this.getById(id);
 if (produit!= null)
 produits.remove(produit);
    }
}
