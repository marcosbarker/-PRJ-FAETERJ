import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Pessoa {

  private String nome;
  private String email;
  private LocalDate niver;
  private int idade;

  public Pessoa() {} //redefinindo o construtor padrao

  public Pessoa(String nome, String email, int idade) { //ao definir um construtor, se perde o construtor padrao
    this.nome = nome;
    this.email = email;
    this.idade = idade;
  }

  public LocalDate getNiver() {
    return this.niver;
  }
  public void setNiver(LocalDate data) {
    this.niver = data;
  }
  public String getNome() {
    return this.nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getEmail() {
    return this.email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public int getIdade() {
    LocalDate hoje = LocalDate.now();
    Period periodo = this.niver.until(hoje);
    return periodo.getYears();
    //public int getIdade() {
        //return this.niver.until(LocalDate.now()).getYears();
    //}
  }

  public String toString() { //sobrescrita do construtor
    return this.nome + "(" + this.email + ")";
  }

  public boolean equals(Object outro) {
    if (outro instanceof Pessoa) {
      Pessoa outroComoPessoa = (Pessoa) outro;
      if (this.email.equals(outroComoPessoa.email)) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate d = LocalDate.parse("23/09/1989", formato);
    
    Pessoa p = new Pessoa();
    p.setNome("Marcos");
    p.setEmail("marcos_barker@hotmail.com");
    p.setNiver(d);

    System.out.println("Data aniversario: " + d);
    System.out.println("Idade " + p.getIdade() + " anos");
    System.out.println("Email: " + p.getEmail());
    System.out.println("p: " + p);

    Pessoa eOutra = new Pessoa("Ana", "ana@ana.com", 20);

    System.out.println("Outra pessoa: " + eOutra);

    System.out.println("p.equals(Outra): " + p.equals(eOutra));
    }
  }