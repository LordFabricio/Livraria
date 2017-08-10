package Roteiro2;

public class Livraria {

    public void menu() throws InterruptedException {
        int escolha = 0;
        do {
            System.out.println("+========================================+");
            System.out.println("|          Livraria Guanabara            |");
            System.out.println("| 1. Cadastrar novo livro                |");
            System.out.println("| 2. Remover livro do acervo             |");
            System.out.println("| 3. Listar acervo                       |");
            System.out.println("| 4. Resetar livraria                    |");
            System.out.println("| 5. Modificar livro do acervo           |");
            System.out.println("| 6. Listar capítulos de livro           |");
            System.out.println("| 9. Sair                                |");
            System.out.println("+========================================+");
            try {
                escolha = Util.leInteiro("Escolha uma opção: ");
                switch (escolha) {
                    case 1:
                        cadastrarLivro();
                        break;
                    case 2:
                        removerLivro();
                        break;
                    case 3:
                        listarAcervo();
                        break;
                    case 4:
                        resetarLivraria();
                        break;
                    case 5:
                        modificarLivroDoAcervo();
                        break;
                    case 6:
                        listarCapitulos();
                        break;
                    case 9:
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                }

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                Thread.sleep(1000);
            }
        } while (escolha != 9);

    }

    private void listarCapitulos() {
        Capitulo[] capitulos = livros.getCapitulos();
        for (int i = 0; i < capitulos.length; i++) {
            if (capitulos[i] != null) {
                System.out.printf("Capítulo %d - %s\n", i + 1, capitulos[i]);
            }
        }
    }
    
    private void cadastrarLivro() {
        
    }
    
    private void removerLivro() {
        
    }
    
    private void listarAcervo() {
        
    }
    
    private void resetarLivraria() {
        
    }
    
    private void modificarLivroDoAcervo() {
        
    }
    
}
