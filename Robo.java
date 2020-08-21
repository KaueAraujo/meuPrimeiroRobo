public class Robo {
    //Atributos do robo
    private int coordX, coordY;

    //Construtor Robo
    Robo(int x, int y){
        this.coordX=setRoboNS(x);
        this.coordY=setRoboEW(y);
    }

    //Método 1) Robo anda para Norte
    void goNorth(int y){
        if(y>=-6 && y<=6){
            coordY++;
        }
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    //Método 2) Robo anda para Sul
    void goSouth(int y){
        if(y>=-6 && y<=6){
            coordY--;
        }
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    //Método 3) Robo anda para Leste
    void goEast(int x){
        if(x>=-6 && x<=6){
            coordX++;
        }
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    //Método 4) Robo anda para Oeste
    void goWest(int x){
        if(x>=-6 && x<=6){
            coordX--;
        }
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    //Método 5) Retorna a posição atual do Robo
    void getRobo(){
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    }
    int setRoboNS(int y){
        if(y>7 || y<-7){
            return coordY=0;
        }else{
           return coordY=y;
        }
    }
    int setRoboEW(int x){
        if(x>7 || x<-7){
            return coordX=0;
        }else{
           return coordX=x;
        }
    }

    
    
}