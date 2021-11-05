public class Professor extends Pessoa{

      private String departamento:
      private String nomeCurso;
      private Double salario;

      public void setDepartamento(String departamento){
          this.departamento=departamento;
      }
      public String grtDepartamento(){
          this.departamento;
      }
      public void setNomeCurso(String nomeCurso){
          this.nomeCurso=nomeCurso;
      }
      public String getNomeCurso(){
          this.nomeCurso;
      }
      public void setSalario(double salario){
          this.salario=salario;
      }
      public double getSalario(){
          this.salario;
      }
      public double calculaSalarioLiquido(){
          return this.salario - (0.15*this.salario);
      }

}