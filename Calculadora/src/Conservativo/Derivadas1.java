package Conservativo;


import org.lsmp.djep.djep.DJep;
import org.lsmp.djep.groupJep.values.Polynomial;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class Derivadas1 {

    //Variable que almacena las funciones a derivar
    public static Node derivadaPY;
    public static Node derivadaNZ;
    
    public static Node derivadaPX;
    public static Node derivadaMZ;
    
    public static Node derivadaNX;
    public static Node derivadaMY;
    
    private static String funcion = "";
    // DJep es la clase encargada de la derivacion en su escencia
    DJep djep;
    Node nodoFuncion;
    Node nodoDerivada;

    public Derivadas1() {
        //...
    }

    // derivada de M con respecto a y
    public void setFuncionADerivar(String funcion) {
        this.funcion = funcion;
    }

    public String getFuncionDerivada() {
        return this.funcion;
    }

    //Derivada de P con respecto a x
    public void setFuncionADerivar5(String funcion) {
        this.funcion = funcion;
    }

    public String getFuncionDerivada5() {
        return funcion;
    }
    
    //Derivada de M con respecto a z
    public void setFuncionADerivar6(String funcion) {
        this.funcion = funcion;
    }

    public String getFuncionDerivada6() {
        return this.funcion;
    }

    //Derivada de N con respexto a Z
    public void setFuncionADerivar4(String funcion) {
        this.funcion = funcion;
    }

    public String getFuncionDerivada4() {
        return this.funcion;
    }
    public Node getFuncionComp4(){
        return this.nodoDerivada;
    }

    //Derivada de N con respecto a x
    public void setFuncionADerivar2(String funcion) {
        this.funcion = funcion;
    }

    public String getFuncionDerivada2() {
        return this.funcion;
    }

    //Derivada de P con respecto a y
    public void setFuncionADerivar3(String funcion) {
        this.funcion = funcion;
    }

    public String getFuncionDerivada3() {
       
        return this.funcion;
    }
    
    public Node getFuncionComp3(){
        return this.nodoDerivada;
    }

    public void derivarX() {

        try {
            
            this.djep = new DJep();
            // agrega funciones estandares cos(x), sin(x)
            this.djep.addStandardFunctions();

            // agrega constantes estandares, pi, e, etc
            this.djep.addStandardConstants();

            // por si existe algun numero complejo
            this.djep.addComplex();

            // permite variables no declarables
            this.djep.setAllowUndeclared(true);

            this.djep.addVariable("y", "y");
            this.djep.addVariable("z", "z");
            

            // permite asignaciones
            this.djep.setAllowAssignment(true);

            // regla de multiplicacion o para sustraccion y sumas
            this.djep.setImplicitMul(true);

            // regla de multiplicacion o para sustraccion y sumas
            this.djep.addStandardDiffRules();

            // coloca el nodo con una funcion preestablecida
            this.nodoFuncion = this.djep.parse(this.funcion);

            this.djep.continueParsing();
            
            // deriva la funcion con respecto a x
            Node diff = this.djep.differentiate(nodoFuncion, "x");
            

            // Simplificamos la funcion con respecto a x
            this.nodoDerivada = this.djep.simplify(diff);
            this.djep.continueParsing();
            this.nodoDerivada =this.djep.simplify(this.nodoDerivada);
            // Convertimos el valor simplificado en un String
            this.funcion = this.djep.toString(this.nodoDerivada);

        } catch (ParseException e) {
            this.funcion = "NaN";
            System.out.println("Error: " + e.getErrorInfo());
        }

    }

    public void derivarY() {

        try {

            this.djep = new DJep();
            // agrega funciones estandares cos(x), sin(x)
            this.djep.addStandardFunctions();

            // agrega constantes estandares, pi, e, etc
            this.djep.addStandardConstants();

            // por si existe algun numero complejo
            this.djep.addComplex();

            // permite variables no declarables
            this.djep.setAllowUndeclared(true);

            this.djep.addVariable("x", "x");
            this.djep.addVariable("z", "z");
           
            // permite asignaciones
            this.djep.setAllowAssignment(true);

            // regla de multiplicacion o para sustraccion y sumas
            this.djep.setImplicitMul(true);

            // regla de multiplicacion o para sustraccion y sumas
            this.djep.addStandardDiffRules();

            // coloca el nodo con una funcion preestablecida
            this.nodoFuncion = this.djep.parse(this.funcion);

            // deriva la funcion con respecto a y
            Node diff = this.djep.differentiate(nodoFuncion, "y");

            // Simplificamos la funcion con respecto a x
            this.nodoDerivada = this.djep.simplify(diff);
            this.djep.continueParsing();
            this.nodoDerivada =this.djep.simplify(this.nodoDerivada);
            // Convertimos el valor simplificado en un String
            this.funcion = this.djep.toString(this.nodoDerivada);

        } catch (ParseException e) {
            this.funcion = "NaN";
            System.out.println("Error: " + e.getErrorInfo());
        }

    }

    public void derivarZ() {

        try {

            this.djep = new DJep();
            // agrega funciones estandares cos(x), sin(x)
            this.djep.addStandardFunctions();

            // agrega constantes estandares, pi, e, etc
            this.djep.addStandardConstants();

            // por si existe algun numero complejo
            this.djep.addComplex();

            // permite variables no declarables
            this.djep.setAllowUndeclared(true);

            this.djep.addVariable("x", "x");
            
            this.djep.addVariable("y", "y");
           
            // permite asignaciones
            this.djep.setAllowAssignment(true);

            // regla de multiplicacion o para sustraccion y sumas
            this.djep.setImplicitMul(true);

            // regla de multiplicacion o para sustraccion y sumas
            this.djep.addStandardDiffRules();

            // coloca el nodo con una funcion preestablecida
            this.nodoFuncion = this.djep.parse(this.funcion);
            
            
            // deriva la funcion con respecto a x
            Node diff = this.djep.differentiate(nodoFuncion, "z");

            // Simplificamos la funcion con respecto a x
            this.nodoDerivada = this.djep.simplify(diff);
     
            this.nodoDerivada = this.djep.simplify(this.nodoDerivada);
            // Convertimos el valor simplificado en un String
            this.funcion = this.djep.toString(this.nodoDerivada);

        } catch (ParseException e) {
            this.funcion = "NaN";
            System.out.println("Error: " + e.getErrorInfo());
        }

    }
    
   

  

}
