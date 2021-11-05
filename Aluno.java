public class Aluno extends Pessoa{

    private String cursos;
    private Double nota1;
    private Double nota2;

    public void setCursos(String cursos){
        this.cursos=cursos;
    }
    public String getCursos(){
        return this.cursos;
    }
    public void SetNota1(Double nota1){
        this.nota1=nota1;
    }
    public Double getNota1(){
        return this.nota1;
    }
    public void SetNota2(Double nota2){
        this.nota2=nota2;
    }
    public Double getNota2(){
        return this.nota2;
    }
    public Double calculaMedia(){
        return (this.nota1 + this.nota2) / 2.0;
    } 
    public boolean verificaAprovado(){
        boolean condicao;
        if(calculaMedia() < 6){
            condicao = false;
        } else{
            condicao = true;
        }
        return condicao;
    }


}