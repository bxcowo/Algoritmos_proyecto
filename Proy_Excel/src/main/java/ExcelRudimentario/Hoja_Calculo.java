package ExcelRudimentario;

import Grafo.*;
import static Grafo.Graph.TYPE.DIRECTED;

public class Hoja_Calculo {
    private Graph<Celda> hoja;
    
    public Hoja_Calculo(){
        this.hoja = new Graph<>(DIRECTED);
        String title;
        
        // Se inicializan vertices desde A1 hasta H20
        for(Character i = 'A'; i <'H'; i++){
            for(int j = 1; j <= 20; j++){
                title = i.toString() + j;
                hoja.getVertices().add(new Vertex<>(new Celda(title)));
            }
        }
    }
    
    public Vertex<Celda> getCelda(String name){
        for(Vertex<Celda> it : hoja.getVertices()){
            if(it.getValue().getId().equals(name)){
                return it;
            }
        }
        return null;
    }
    
    public void addDependencia(Vertex<Celda> from, Vertex<Celda> to, String formula){
        hoja.getEdges().add(new Dependencia(from, to, formula));
    }
    
    public void reiniciarCelda(Vertex<Celda> ver){
        for(Edge<Celda> d : hoja.getEdges()){
            if(d.getToVertex().equals(ver)){
                hoja.getEdges().remove(d);
            }
        }
        ver.getValue().setValue(0.00);
    }
    
    @Override
    public String toString(){
        return hoja.toString();
    }
}
