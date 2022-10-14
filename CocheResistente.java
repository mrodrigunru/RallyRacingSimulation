import java.io.*;
/**
 * Write a description of class CocheResistente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CocheResistente extends CocheNormal
{
    private double reserva = 100;
    
    /**
     * Constructor for objects of class CocheResistente
     * 
     * @param String nombre: nombre del coche
     * @param Velocidad velocidad: valor de la velocidad teorica del coche
     * @param Combustible combustible: valor del combustible inicial del coche
     */
    public CocheResistente(String nombre, Velocidad velocidad, Combustible combustible)
    {
        super(nombre,velocidad,combustible);
    }

  
    /**
     * Metodo que devuelve el valor de la reserva del coche
     * 
     * @return double reserva
     */
    public double getReserva(){
        return reserva;
    }
    
    /**
     * Metodo que actualiza el valor de la reserva
     * 
     * @param double reserva  nuevo valor de la reserva
     */
    public void setReserva(double reserva){
        this.reserva = reserva;
    }
    
    /**
     * Metodo que calcula el combustible restante el coche
     * 
     * @param double combustible combustible actual del coche
     * @param double tiempo en terminar tiempo que tarda en terminar la carrera
     * 
     * @return double cr combustible restante del coche
     * 
     * @throws IOException
     */
    @Override
    public double combustibleRestante(double combustible, double tiempoEnTerminar) throws IOException{
       
       double comb = combustible;
       double reserva = getReserva();
       
       if (reserva > 0 && tiempoEnTerminar > comb){
           comb = comb + reserva;
           reserva = 0;
           print("+++ El"+ getNombre() +"tiene que recurrir al depósito de reserva para poder correr +++");
        }
       double cr = comb - tiempoEnTerminar;
       cr = Math.round((cr)*100d) / 100d;
        //super.setCombustibleActual(cr);
        setReserva(reserva);
       return cr;
    }
    
    /**
     * Metodo que devuelve el tipo de coche
     */
    @Override
    public String getTipo(){
        return getClass().getName();
    }
    
    /**
     * Metodo que imprime las caracteristicas del coche
     */
     @Override
     public String toString(){
        return "<coche:" +getNombre() + "> <tipo:" + getTipo() + "> <vel_teó:" +  getVelocidad() +
         "(" + getValorVelocidad() + ")> <comb: "+ getCombustible() + "(" + getValorCombustible() + ") (actual:" + getCombustibleActual() +
         ")> > <reserva: " + getReserva() + ">";
     }
    }
