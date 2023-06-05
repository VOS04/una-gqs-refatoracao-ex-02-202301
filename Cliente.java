//feat: Inclusão da nova classe cliente 
public class Cliente {
  private int idade;
  private String sexo;

  public Cliente(int idade, String sexo) {
    this.idade = idade;
    this.sexo = sexo;

  }

  // feat: Criação do metodo calcularMensalidadeMasculina
  private double calcularMensalidadeMasculina() {
    if (idade <= 15) {
      return 60.0;
    } else if (idade <= 18) {
      return 75.0;
    } else if (idade <= 25) {
      return 90.0;
    } else if (idade <= 40) {
      return 85.0;
    } else {
      return 80.0; // fix: Corrigido valor de retorno 800 para 80.0
    }
  }

  // feat: Criação do metodo calcularMensalidadeFeminina
  private double calcularMensalidadeFeminina() {
    if (idade <= 15) {
      return 60.0;
    } else if (idade <= 18) {
      return 60.0;
    } else if (idade <= 30) {
      return 90.0;
    } else if (idade <= 40) {
      return 85.0;
    } else {
      return 80.0;
    }
  }

  // feat: Criação do metodo calcularMensalidade
  public double calcularMensalidade() {
    double mensalidade;

    if (sexo.equalsIgnoreCase("M")) {
      mensalidade = calcularMensalidadeMasculina();
    } else if (sexo.equalsIgnoreCase("F")) {
      mensalidade = calcularMensalidadeFeminina();
    } else {
      System.out.println("Sexo inválido.");
      mensalidade = 0.0;
    }
    // feat: inclui o retorno da mesanlidade
    return mensalidade;
  }
}