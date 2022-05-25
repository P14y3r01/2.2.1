package hiber.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {


    @Id
    @Column(name = "model")
    String model;
    @Column(name = "series")
    int series;

    public String getModel() {        return model;    }
    public int getSeries() {        return series;    }
    public void setSeries(int series) {        this.series = series;    }
    public void setModel(String model) {        this.model = model;    }

    public Car(){}
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    @Override
    public String toString() {
        return  "model='" + model + '\'' +
                ", series=" + series;
    }
}
