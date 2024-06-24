package ExcelRudimentario;

public class Celda implements Comparable<Celda>{
    private String id;
    private Double value;
    
    public Celda(String id, Double value){
        this.id = id;
        this.value = value;
    }
    
    public Celda(String id){
        this(id, 0.00);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    
    @Override
    public int compareTo(Celda o) {
        if(this.value < o.getValue()){
            return -1;
        }else if(this.value > o.getValue()){
            return 1;
        }else{
            return 0;
        }
    }
}
