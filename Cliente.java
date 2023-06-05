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
      return 800.0;
    }
  }

}