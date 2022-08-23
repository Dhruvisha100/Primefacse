
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OWNER
 */
@ManagedBean
public class ButtonView {
    
    
    private MenuModel model;
    
    
      
    
    
      public MenuModel getModel() {
        return model;
    }
    
    
    public String save() {
        addMessage("Data saved");
        return null;
    }

    public void update() {
        addMessage("Data updated");
    }

    public void delete() {
        addMessage("Data deleted");
    }

    public void buttonAction() {
        addMessage("Command Link Action Messges!!");
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    private Object DefaultMenuItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
