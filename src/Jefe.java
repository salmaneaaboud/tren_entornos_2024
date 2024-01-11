public class Jefe extends empleado{
    String telefono;
    double salario;

    public Jefe(String nombre, String direccion, int segSocialNum, String telefono, double salario){
        super(segSocialNum,nombre,direccion);
        this.telefono=telefono;
        this.salario=salario;
    }

    public double getSalario(){
        return this.salario;
    }
}
