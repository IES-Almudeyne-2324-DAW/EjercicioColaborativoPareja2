/*
 * Esta clase define una pareja de colaboradores
*/
public class Pareja{
    //colaborador"x" define el nombre de los colaboradores
    private String colaborador1 = "Juan Martín";
    private String colaborador2 = "Jose María Mañero";
    
    //Constructor del objeto pareja
    Pareja (String colaborador1, String colaborador2) {
        this.colaborador1 = colaborador1;
        this.colaborador2 = colaborador2;
    }

    //Cambia el valor de colaborador1
    public void setColaborador1(String colaborador){
        this.colaborador1 = colaborador;
    }
    //Devuelve el valor de colaborador1
    public String getColaborador1(String colaborador){
        return this.colaborador1;
    }
    //Dice hola
    public void sayHi() {
        System.out.println("Hola");
    }
}