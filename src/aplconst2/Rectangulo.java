package aplconst2;
// @author jgarciaamor
 
public class Rectangulo {
    public float base;
    public float altura;
    //constructores
    public Rectangulo(){
        
    }
    public Rectangulo(float ba, float al){
    base = ba;
    altura = al;    
    }
    //metodos de acceso
    public float getBase(){
        return base;
    }
    public void setBase (float ba){
        base=ba;             
    }
    public float getAltura(){
        return altura;
    } 
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float calcularArea (float al, float ba){
        float area= ba *al;
        return area;
        //tamen return ba*al
    }
    public float calcularPerimetro (){
        return 2*(base+altura);
    }
}
