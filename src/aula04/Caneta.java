package aula04;

public class Caneta {

    private String modelo, cor;
    private float ponta;
    private boolean tampada;

    //Método construtor
    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.setPonta(ponta);
        this.Tampar();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
    public void Tampar(){
        this.tampada = true;
    }
    
    public void Destampar(){
        this.tampada = false;
    }

    public void status() {
        System.out.println("Atributos da caneta");
        System.out.println("");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada? " + this.tampada);
    }
}
