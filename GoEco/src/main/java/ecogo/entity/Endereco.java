
package Prototipo;

public class Endereco {
    private String Rua;
    private String Bairro;
    private String numero;
    private String CEP;
    private String Complemento;

    public Endereco() {
    }

    public Endereco(String Rua, String Bairro, String numero, String CEP, String Complemento) {
        this.Rua = Rua;
        this.Bairro = Bairro;
        this.numero = numero;
        this.CEP = CEP;
        this.Complemento = Complemento;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }
    
     public String imprimirEndereco(){
        String msg = "Rua " + getRua() + ", " + getNumero() + " - " + getBairro() + " - CEP: " + getCEP();
        return msg;
    }
    
    
    
    
    
}
