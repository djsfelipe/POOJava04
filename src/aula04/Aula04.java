package aula04;

public class Aula04 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);

        /*c1.setModelo("BIC Cristal");
        c1.setPonta(0.5f);*/

        /*Modelo e ponta são atributos privados, sendo necessário o uso dos métodos acessores e modificadores
        c1.modelo = "BIC Cristal";
        c1.ponta = 0.5f;*/
        c1.status();
    }

}
