
package AlquileresJaime;

/**
 *
 * @author Jaime Catalán Mateos
 */
public class CocheNormal extends Coche {

    private String aparcamiento;

    public CocheNormal() {
        super();
    }

    public CocheNormal(String matricula, String marca, String modelo, Fecha fechaFabricacion, Integer precioDiario, String aparcamiento) {
        super(matricula, marca, modelo, fechaFabricacion, precioDiario);
        this.aparcamiento = aparcamiento;
    }

    public String getAparcamiento() {
        return aparcamiento;
    }

    public void setAparcamiento(String aparcamiento) {
        this.aparcamiento = aparcamiento;
    }

    @Override
    public void alquilar() {

    }

    @Override
    public Integer devolver(Integer diasAlquilado) {
        Integer dineroApagar = 0;
        dineroApagar = diasAlquilado * 20;
        return dineroApagar;
    }

    @Override
    public String toString() {
        return super.toString() + "Coche  Normal[" + "aparcamiento:" + aparcamiento + ']';
    }
    
}
