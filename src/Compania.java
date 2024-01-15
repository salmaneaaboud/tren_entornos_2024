public class Compania {
    int codigo;
    Tren[] trenes;
    empleado[] empleados;

    public Compania(int codigo){
        this.codigo=codigo;
    }

    public Compania(int codigo, int numEmpleados, int numTrenes){
        this.codigo=codigo;
        trenes=new Tren[numTrenes];
        empleados=new empleado[numEmpleados];
    }

    public void addEmpleado(empleado empleado){
        for(int i=0; i<empleados.length; i++){
            if(empleados[i]==null){
                empleados[i]=empleado;
            }
        }
    }

    public void addTren(Tren tren){
        for(int i=0; i<trenes.length; i++){
            if(trenes[i]==null){
                trenes[i]=tren;
            }
        }
    }
}
