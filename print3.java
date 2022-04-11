import java.util.Scanner;
public class Main//Declaração da classe
{
    public static void main(String[] args) {//Declaração do método main
        Scanner bofao = new Scanner(System.in);//Criação do Scanner
        System.out.println("Digite a primeira nota!");//Print na tela pedindo pra informar um valor
        double nota1 = bofao.nextDouble();//Criação do atributo nota1 atribuindo um valor digitado pelo usuario
        System.out.println("Digite a segunda nota!");//Print na tela pedindo pra informar um valor
        double nota2 = bofao.nextDouble();//Criação do atributo nota2 atribuindo um valor digitado pelo usuario
        System.out.println("Digite a terceira nota!");//Print na tela pedindo pra informar um valor
        double nota3 = bofao.nextDouble();//Criação do atributo nota3 atribuindo um valor digitado pelo usuario
        System.out.println("Digite a quarta nota!");//Print na tela pedindo pra informar um valor
        double nota4 = bofao.nextDouble();//Criação do atributo nota4 atribuindo um valor digitado pelo usuario
       
        //Criação do atributo média, atribuindo o valor retornado do método calcMedia
        //Enviando como parâmetro 4 atributos do tipo double
        double media = calcMedia(nota1, nota2, nota3, nota4);
        if(aprovado(media) == true){//Se o método 'aprovado', que recebe como parametro um atributo do tipo double
                                    //Retornar true
            System.out.println("O aluno foi aprovado com média "+media);//Print informando se passou, e o valor da media
        }
        else{//Senão
            System.out.println("O aluno foi reprovado com média "+media);//Print informando se passou, e o valor da media
        }
    }
    //Declaração do método calcMedia, do tipo double, informando que deve receber 4 atributos double como parâmetro
    public static double calcMedia(double a, double b, double c, double d){
        return (a+b+c+d)/4; //retorna a média dos 4 atributos
    }
    //Declaração do método aprovado, do tipo boolean, informando que deve recer 1 atributo double como parâmetro
    public static boolean aprovado(double m){
        if(m >= 7){//Se m for maior ou igual a 7
            return true;// retorna true
        }
        else{//se não
            return false;// retorna falso
        }
    }
}
