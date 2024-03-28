import java.util.Scanner;

class Menu {
    public static void printMenuListagemUsuarios() {
        System.out.println("MENU DE LISTAGEM DE USUÁRIOS:");
        System.out.println("1. Listar Superusuários");
        System.out.println("2. Listar Usuários Comuns");
        System.out.println("3. Voltar");
    }
}

class Superusuario {
    private String nome;
    private String email;
    private String senha;
    private int nivelAcesso;
    private String cargo;

    public Superusuario(String nome, String email, String senha, int nivelAcesso, String cargo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
        this.cargo = cargo;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Nível de Acesso: " + nivelAcesso);
        System.out.println("Cargo: " + cargo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu.printMenuListagemUsuarios();

        Superusuario superusuario1 = new Superusuario("Admin", "admin@example.com", "admin123", 1, "Administrador");
        Superusuario superusuario2 = new Superusuario("Gerente", "gerente@example.com", "gerente456", 2, "Gerente de Projeto");
        Superusuario superusuario3 = new Superusuario("Analista", "analista@example.com", "analista789", 3, "Analista de Dados");

        System.out.println("Superusuários criados:");
        superusuario1.exibirInfo();
        superusuario2.exibirInfo();
        superusuario3.exibirInfo();

        scanner.close();
    }
}
