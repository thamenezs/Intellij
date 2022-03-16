package tipos;
public class atividade3_dio {
    public static void Main(String[] args){

    }

    public static void area(double baseMaior, double baseMenor,double altura) {
        System.out.println("Área do trapézio " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void area(double lado){
        System.out.println("Área do quadrado " + lado * lado);
    }

    public static void area(double baseRetangulo, double alturaRetangulo){
        System.out.println("Área do retângulo " + baseRetangulo * alturaRetangulo);
    }
}


