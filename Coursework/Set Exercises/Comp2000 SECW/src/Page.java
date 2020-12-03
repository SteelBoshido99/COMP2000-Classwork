import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("64bcd223-944d-478f-9ee0-7867a63866cd")
public abstract class Page {
    @objid ("5009c92b-328c-4c4e-ac91-d44b12883b65")
    public void changePage(Page newPage) {
    }

    @objid ("b19133ce-1ed5-4828-bc96-12d65711c472")
    public abstract void display();

    @objid ("cb0d14be-528d-41fb-81f6-c6788d783bc6")
    void set(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this. = value;
    }

    @objid ("5624dde3-e6ad-4ad1-ae6b-ad4cc6e24f41")
    protected interface IDisplayBehavoir {
    }

}
