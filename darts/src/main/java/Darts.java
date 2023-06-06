import java.lang.Math;

class Darts {
    int score(double xOfDart, double yOfDart) {
        double puntos;
        puntos=Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));
        
        if(puntos<=1){
           return 10;
        }else if(puntos<=5){
           return 5; 
        }else if(puntos<=10){
            return 1;
        }else{
           return 0; 
        }
        
    }
}
