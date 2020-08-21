public class Robo {
    //Atributos do robo
    private int coordX, coordY;

    //Construtor Robo
    Robo(int x, int y){
        this.coordY=setRoboNS(y);
        this.coordX=setRoboEW(x);
    }

    //Método 1) Robo anda para Norte
    void goNorth(){
        if(coordY>=-6 && coordY<=6){
            coordY++;
        }
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    //Método 2) Robo anda para Sul
    void goSouth(){
        if(coordY>=-6 && coordY<=6){
            coordY--;
        }
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    //Método 3) Robo anda para Leste
    void goEast(){
        if(coordX>=-6 && coordX<=6){
            coordX++;
        }
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    //Método 4) Robo anda para Oeste
    void goWest(){
        if(coordX>=-6 && coordX<=6){
            coordX--;
        }
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    //Método 5) Retorna a posição atual do Robo
    void getRobo(){
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    int setRoboNS(int y){
        if(y>7 || y<-7){
            if(y>0){
                return coordY=7;
            }else{
                return coordY=-7;
            }
        }else{
           return coordY=y;
        }
    }
    int setRoboEW(int x){
        if(x>7 || x<-7){
            if(x>0){
                return coordX=7;
            }else{
                return coordX=-7;
            }
        }else{
           return coordX=x;
        }
    }

    
    
}