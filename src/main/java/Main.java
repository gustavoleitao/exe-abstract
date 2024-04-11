public class Main {


    public static void main(String[] args) {

        var product = new Product(99, "Mouse pad");
        var user = new User("Pedro de Lara");

        System.out.println("Saving product "+product.getName() + "...");

        if (product.salvar()){
            System.out.println("Success to save "+ product.getName());
        }else{
            System.out.println("Error to save "+ product.getName());
        }

        System.out.println("Saving user "+user.getName() + "...");

        if (user.salvar()){
            System.out.println("Success to save "+ user.getName());
        }else{
            System.out.println("Error to save "+ user.getName());
        }

    }

}
