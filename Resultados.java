 
/**
     * Clase que recoge los resultados de un piloto en un circuito
     */
    public class Resultados {
        double tiempo;
        double puntos;   
        
        /**
         * Metodo que devuelve el tiempo en un circuito
         */
        public double getTiempo(){
        return tiempo;
        }
        
        /**
         * Metodo que devuelve los puntos en un circuito
         */
        public double getPuntos(){
        return puntos;
        }
        
        /**
         * Metodo que asigna el tiempo en un circuito
         */
        public void setTiempo(double tiempo){
        this.tiempo = tiempo;
        }
        
        /**
         * Metodo que asigna los puntos en un circuito
         */
        public void setPuntos(double puntos){
        this.puntos = puntos;
        }
    }
    