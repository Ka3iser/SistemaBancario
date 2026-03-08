import com.entity.Pessoa;

import java.awt.*;
import java.util.Scanner;

public class Main {

    private static Pessoa[] entidade;
    public static int contador = 0;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        MenuConta();

    }

    public static void MenuConta(){
        int opcao = 0;

        System.out.println("Seja bem-vindo!");
        do {
            System.out.println("Escolha uma das opções para iniciar");
            System.out.println();
            System.out.println("1-Cadastrar uma nova conta");
            System.out.println("2-Ja possuo uma conta");
            opcao = input.nextInt();
        }while(opcao > 2 || opcao < 1);

        switch (opcao) {
            case 1:
                System.out.println("Você gostaria de criar uma conta para sua empresa ou para você?");
                System.out.println("1- Para mim mesmo");
                System.out.println("2- Para a minha empresa");
                opcao = input.nextInt();
                if(opcao == 1){
                    CadastroPessoa();
                }
                else if(opcao == 2){
                    CadastroEmpresa();
                }
                else{
                    System.out.println("opção invalida!");
                    return;
                }
            case 2:
                ProcurarCadastro();
        }
    }
    public static void CadastroPessoa(){

        String nome, estado, email, endereco, complemento;
        int cpf, rg, telefone;

        System.out.println("Digite seu nome: ");
        nome = input.next();
        System.out.println("Digite seu CPF(sem ponto, espaços e traços): ");
        cpf = input.nextInt();
        System.out.println("Digite seu RG(sem ponto e espaços): ");
        rg = input.nextInt();
        System.out.println("Digite seu telefone(sem empaços e traços): ");
        telefone = input.nextInt();
        System.out.println("Digite seu e-mail: ");
        email = input.next();
        System.out.println("Digite seu endereço: ");
        endereco = input.next();
        System.out.println("Digite o complemento (caso não tenha, deixe em branco): ");
        complemento = input.next();

        Pessoa pessoa = new Pessoa(nome, cpf, rg, telefone, email, endereco);
        entidade[contador] = pessoa;

        Menuprincipal();
    }
    public static void CadastroEmpresa(){

    }
    public static void ProcurarCadastro(){

        Scanner input = new Scanner(System.in);
        String CPF_CNPJ;
        String senha;

        System.out.println("Digite seu CPF/CNPJ: ");
        CPF_CNPJ = input.next();
        System.out.println("Digite sua senha: ");
        senha = input.next();
    }
    public static void Menuprincipal(){
        int opcao;

        System.out.println("Bem-vindo, " + entidade[contador].getNome());
        System.out.println("O que deseja fazer?");
        System.out.println("1- Ver saldo");
        System.out.println("2 - Ver a fatura");
        System.out.println("3- Ver cofrinho");
        System.out.println("4- Pix");
        opcao = input.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Saldo: " + entidade[contador].getSaldo());
                return;
            case 2:
                System.out.println("Fatura: " + entidade[contador].getFatura());
                return;
            case 3:

            case 4:
                System.out.println("1- cadastrar nova chave pix");
                System.out.println("2- enviar pix");
                opcao = input.nextInt();
                switch(opcao){
                 case 1:
                     CadastroPix();
                     case 2:
                         System.out.println("Digite a chave pix da pessoa que você deseja enviar o pix");
                         String pixPessoa = input.next();
                }
        }
    }
    public static void CadastroPix(){

    }
}