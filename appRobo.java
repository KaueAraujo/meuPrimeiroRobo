import java.util.Scanner;

public class appRobo {
    public static void main(String[] args) {
        Robo robot1 = new Robo(3,4);
        Scanner entrada = new Scanner(System.in);
        int menu=0;

        while(menu!=6){
            System.out.printf("%nO que deseja fazer?%n1-Exibir posição do Robo%n2-Andar para o Norte%n3-Andar para o Sul%n4-Andar para o Leste%n5-Andar para o Oeste%n6-Sair%n");
            menu=entrada.nextInt();
            if(menu<1 || menu>6){
                System.out.println("Opção inválida, tente novamente.");
            }else{
                if(menu==1){
                    robot1.getRobo();
                }else{
                    if(menu==2){
                        robot1.goNorth();
                    }else{
                        if(menu==3){
                            robot1.goSouth();
                        }else{
                            if(menu==4){
                                robot1.goEast();
                            }else{
                                if(menu == 5){
                                    robot1.goWest();
                                }
                            }
                        }
                    }
                }
            }
        }



        entrada.close();
    }
}