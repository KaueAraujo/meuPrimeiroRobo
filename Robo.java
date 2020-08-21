public class Robo {
    //Atributos do robo
    private int coordX, coordY;

    //Construtor Robo
    public Robo(int x, int y){
        this.coordY=setRoboNS(y);
        this.coordX=setRoboEW(x);
    }

    //Método 1) Robo anda para Norte
    public void goNorth(){
        if(coordY>=-6 && coordY<=6){
            coordY++;
        }
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    //Método 2) Robo anda para Sul
    public void goSouth(){
        if(coordY>=-6 && coordY<=6){
            coordY--;
        }
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    //Método 3) Robo anda para Leste
    public void goEast(){
        if(coordX>=-6 && coordX<=6){
            coordX++;
        }
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    //Método 4) Robo anda para Oeste
    public void goWest(){
        if(coordX>=-6 && coordX<=6){
            coordX--;
        }
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    //Método 5) Retorna a posição atual do Robo
    public void getRobo(){
        System.out.println("Posição do robo: ("+coordX+","+coordY+").");
    }

    public int setRoboNS(int y){
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
    public int setRoboEW(int x){
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