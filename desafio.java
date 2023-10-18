public class Singleton {
    private static Singleton instance;

    // Construtor privado para evitar a criação de instâncias diretas
    private Singleton() {
    }

    // Método estático para obter a instância única
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Exemplo de Singleton");
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Verifica se as duas instâncias são iguais
        if (singleton1 == singleton2) {
            System.out.println("As duas instâncias são iguais. Isso confirma o padrão Singleton.");
        }

        // Chama um método da instância única
        singleton1.showMessage();
    }
}
