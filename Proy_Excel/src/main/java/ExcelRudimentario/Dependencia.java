package ExcelRudimentario;

import Grafo.Edge;
import Grafo.Vertex;

public class Dependencia extends Edge<Celda>{
    private String formula;

    public Dependencia(Vertex<Celda> from, Vertex<Celda> to, String formula){
        super(0, from, to);
        this.formula = formula;    
    }
    
    public String getFormula(){
        return formula;
    }
}
