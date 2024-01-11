public class operario extends empleado{
    String id;
    double salario;

    public operario(String nombre, String direccion, int segSocialNum, String id, double salario){
        super(segSocialNum,nombre,direccion);
        this.id=id;
        this.salario=salario;
    }

    public double getSalario(){
        return this.salario; //reescribir
    }
}
