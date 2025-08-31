package service2;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Llanta {

    private int rin;

    public Llanta(int rin) {

        setRin(rin);
    }

    public Llanta() {

        this(0);
    }

    public int getRin() {
        return rin;
    }

    public void setRin(int rin){

        this.rin = (rin > 0) ? 10:rin;
    }

    @Override
    public boolean equals ( Object obj ){
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Llanta b = (Llanta) obj;
        return toString().equals(b.toString());
    }

}