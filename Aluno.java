public class Aluno {
     private String nome;
    private String RA;
    private String cpf;
    private String email;
    private String telefone;
    private String curso;
    private String periodo;

    public Aluno (String nome, String RA, String cpf, String email, String telefone, String curso, String periodo) {
        this.nome = nome;
        this.RA = RA;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }

    public String getCurso () {
        return curso;
    }

    public void setCurso (String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo (String periodo) {
        this.periodo = periodo;
    }

    public void exibirInformacoes() {
        System.out.printf("%s,%s,%s,%s,%s,%s,%s", nome, RA, cpf, email, telefone, curso, periodo);
    }
}

