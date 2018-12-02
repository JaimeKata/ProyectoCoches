
package AlquileresJaime;

/**
 *
 * @author Jaime Catalán Mateos
 */
public class CocheLujo extends Coche{
    
    private Integer codigo = 10001;
    
    public CocheLujo(){
        super();
    }
    public CocheLujo(String matricula, String marca, String modelo, Fecha fechaFabricacion, Integer precioDiario){
        super(matricula, marca, modelo, fechaFabricacion, precioDiario);
        this.codigo = codigo;
        this.codigo ++;
    }
    
     @Override
    public void alquilar() {
       
    }

    @Override
    public Integer devolver(Integer diasAlquilado) {
        Integer dineroApagar = 0;
        dineroApagar = diasAlquilado * 60;
        return dineroApagar;
    }

    @Override
    public String toString() {
        return super.toString() + "Coche  de Lujo[" + "codigo:" + codigo + ']';
    }
    
}
