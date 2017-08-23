/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;

import java.time.LocalDate;

/**
 *
 * @author LordFabricio
 */
public class Livraria {

    private Livros[] livros;
    private int tadd = 0;

    public Livraria() throws InterruptedException, Exception {
        livros = new Livros[100];
        menu();
    }

    private void menu() throws InterruptedException, Exception {
        int op = 0;
        do {
            System.out.println("+===============================+");
            System.out.println("|        Livraria Senac         |");
            System.out.println("+-------------------------------+");
            System.out.println("| 1. Cadastrar Novo Livro       |");
            System.out.println("| 2. Listar Acervo              |");
            System.out.println("| 3. Remover Livro do acervo    |");
            System.out.println("| 4. Resetar Livraria           |");
            System.out.println("| 5. Modificar Livro do Acervo  |");
            System.out.println("| 6. Listar Capítulos do Livro  |");
            System.out.println("| 7. Sair                       |");
            System.out.println("+-------------------------------+");
            try {
                op = Util.enti("Escolha uma opção: ");
                switch (op) {
                    case 1:
                        addl();
                        break;
                    case 2:
                        if (tadd == 1) {
                            listAcervo();
                        } else {
                            System.out.println("Cadastre um Livro Antes");
                        }
                        break;
                    case 3:
                        if (tadd == 1) {
                            remLivro();
                        } else {
                            System.out.println("Cadastre um Livro Antes");
                        }
                        break;
                    case 4:
                        if (tadd == 1) {
                            resetL();
                        } else {
                            System.out.println("Cadastre um Livro Antes");
                        }
                        break;
                    case 5:
                        if (tadd == 1) {
                            modA();
                        } else {
                            System.out.println("Cadastre um Livro Antes");
                        }
                        break;
                    case 6:
                        if (tadd == 1) {
                            listCap();
                        } else {
                            System.out.println("Cadastre um Livro Antes");
                        }
                        break;
                    case 7:
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } while (op != 7);
    }

    private int addl() throws Exception {
        String titulo = "";
        String isbn = "";
        int nAutor = 0;
        int nCap = 0;
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                do {
                    titulo = Util.ents("Digite o Título do livro: ");
                    if (titulo.equals("")) {
                        System.out.println("Preencha o Campo Titulo");
                        continue;
                    } else {
                        break;
                    }
                } while (true);
                do {
                    isbn = Util.ents("Digite o ISBN: ");
                    if (isbn.equals("")) {
                        System.out.println("Preencha o Codigo ISBN");
                        continue;
                    } else {
                        break;
                    }
                } while (true);
                Livros livro = new Livros(titulo, isbn);
                System.out.println("+-------------------------------+");
                do {
                    nAutor = Util.enti("Número de Autores: ");
                    if (nAutor < 1) {
                        System.out.println("O Livro deve Possuir Pelo Menos 1 Autor");
                        continue;
                    } else {
                        break;
                    }
                } while (true);
                cadAutores(livro, nAutor);
                do {
                    nCap = Util.enti("Número de Capítulos: ");
                    if (nCap < 1) {
                        System.out.println("O Livro deve Possuir Pelo Menos 1 Capitulo");
                        continue;
                    } else {
                        break;
                    }
                } while (true);
                cadCap(livro, nCap);
                livros[i] = livro;
                tadd = 1;
                return i;
            }
        }
        return -1;
    }

    private void cadAutores(Livros livro, int nAutor) throws Exception {
        for (int i = 0; i < nAutor; i++) {
            System.out.println("Cadastro de Autor (" + (i + 1) + "/" + (nAutor) + ")");
            String nome = Util.ents("Nome do Autor: ");
            Autor autor = new Autor(nome);
            LocalDate data = Util.entd("Data de Nascimento do Autor: ");
            autor.setDatan(data);
            livro.addA(autor);
        }
        System.out.println("+-------------------------------+");
    }

    private void cadCap(Livros livro, int nCap) throws Exception {
        for (int i = 0; i < nCap; i++) {
            System.out.println("Cadastro de Capítulos (" + (i + 1) + "/" + (nCap) + ")");
            String titulo = Util.ents("Digite o Título do Capítulo: ");
            String texto = Util.ents("Digite o Texto do Capítulo: ");
            livro.addCap(titulo, texto);
        }
        System.out.println("+-------------------------------+");
        System.out.println("Cadastro Realizado com Sucesso!!!");
    }

    private void listAcervo() {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                System.out.printf("[%d] %s", i, livros[i] + "\n");
            }
        }
    }

    private void remLivro() throws Exception {
        listAcervo();
        int ID = Util.enti("Digite o ID do Livro.: ");
        try {
            livros[ID] = null;
        } catch (Exception ex) {
            throw new Exception("Não foi Possivel Remover este Livro");
        }
    }

    private void resetL() {
        for (int i = 0; i < livros.length; i++) {
            livros[i] = null;
        }
        tadd = 0;
    }

    private void modA() throws Exception {
        listAcervo();
        int ID = Util.enti("Digite o ID do Livro.: ");
        System.out.println("+=============================+");
        System.out.println("|        Livraria Senac       |");
        System.out.println("|-----------------------------|");
        System.out.println("| Inserir Novo Autor....: (1) |");
        System.out.println("| Inserir Novo Capitulo.: (2) |");
        System.out.println("|=============================|");
        int op = Util.enti("Escolha a Opção.: ");
        switch (op) {
            case 1:
                addAutL(livros[ID]);
                break;
            case 2:
                addCapL(livros[ID]);
                break;
            default:
                System.out.println("Opção Invalida!");
        }
    }

    private void addAutL(Livros livro) throws Exception {
        Autor autor = new Autor(Util.ents("Nome do Autor.: "));
        autor.setDatan(Util.entd("Data de Nascimento.: (DD/MM/AAAA) "));
        livro.addA(autor);
    }

    private void addCapL(Livros livro) throws Exception {
        livro.addCap(Util.ents("Capitulo do Livro.: "),
                Util.ents("Conteúdo do Capitulo.: "));
    }

    private void listCap() throws Exception {
        listAcervo();
        int IDL = Util.enti("Digite o ID do Livro, para ver os Capitulos.: ");
        listCap(livros[IDL]);
    }

    private void listCap(Livros livro) {
        Capitulo[] cap = livro.getCapitulo();
        for (int i = 0; i < cap.length; i++) {
            if (cap[i] != null) {
                System.out.printf("Capitulo %d - %s\n", i + 1, cap[i]);
            }
        }
    }

}
