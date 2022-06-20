package hiber.model;

import javax.persistence.*;
import java.beans.Transient;

@Entity
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "model")
    String model;
    @Column(name = "series")
    int series;
//    @OneToOne
//    User user;



    public String getModel() {        return model;    }
    public int getSeries() {        return series;    }
    public void setSeries(int series) {        this.series = series;    }
    public void setModel(String model) {        this.model = model;    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public Car(){}
    public Car(String model, int series/*, User user*/) {
        this.model = model;
        this.series = series;
//        this.user = user;
    }

    @Override
    public String toString() {
        return  "model='" + model + '\'' +
                ", series=" + series;
    }
}
