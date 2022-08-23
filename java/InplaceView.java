
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
public class InplaceView  {

    private String text = "PrimeFaces";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}
