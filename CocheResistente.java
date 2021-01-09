import java.io.*;
/**
 * Write a description of class CocheResistente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CocheResistente extends CocheAbstract
{
    private double reserva = 100;
    
    /**
     * Constructor for objects of class CocheResistente
     */
    public CocheResistente(String nombre, Velocidad velocidad, Combustible combustible)
    {
        super(nombre,velocidad,combustible);
    }

  
    public double getReserva(){
        return reserva;
    }
    
    public void setReserva(double reserva){
        this.reserva = reserva;
    }
    
    
    @Override
    public double combustibleRestante(Combustible combustible, double tiempoEnTerminar) throws IOException{
       double cr = 0.0;
       double comb = combustible.getValor();
       double reserva = getReserva();
       
       if (reserva != 0 && tiempoEnTerminar > comb){
           comb = comb + reserva;
           reserva = 0;
           print("+++ El"+ getNombre() +"tiene que recurrir al depósito de reserva para poder correr +++");
        }
        cr = comb - tiempoEnTerminar;
        super.setCombustibleActual(cr);
        setReserva(reserva);
       return cr;
    }
    
    @Override
    public String getTipo(){
        return getClass().getName();
    }
    
     @Override
     public String toString(){
        return "<coche:" +getNombre() + "> <tipo:" + getTipo() + "> <vel_teó:" +  getVelocidad() +
         "(" + getValorVelocidad() + ")> <comb: "+ getCombustible() + "(" + getValorCombustible() + ") (actual:" + getCombustibleActual() +
         ")> > <reserva: " + getReserva() + ">";
     }
    }
