
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.RateEvent;

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
public class RatingView {

    private Integer rating;
    private Integer rating1=3;

    public Integer getRating1() {
        return rating1;
    }

    public void setRating1(Integer rating1) {
        this.rating1 = rating1;
    }
    

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

     
}
