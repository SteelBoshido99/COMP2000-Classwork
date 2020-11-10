import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("64bcd223-944d-478f-9ee0-7867a63866cd")
public abstract class Page {
    @objid ("5009c92b-328c-4c4e-ac91-d44b12883b65")
    public void changePage(Page newPage) {
    }

    @objid ("b19133ce-1ed5-4828-bc96-12d65711c472")
    public abstract void display();

}
