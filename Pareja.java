public class Pareja{

    private String colaborador1 = "Juan Martín";
    private String colaborador2 = "Jose María Mañero";
    
    Pareja (String colaborador1, String colaborador2) {
        this.colaborador1 = colaborador1;
        this.colaborador2 = colaborador2;
    }

    public void setColaborador1(String colaborador){
        this.colaborador1 = colaborador;
    }
    
    public String getColaborador1(String colaborador){
        return this.colaborador1;
    }

    public void sayHi() {
        System.out.println("Hola");
    }
}