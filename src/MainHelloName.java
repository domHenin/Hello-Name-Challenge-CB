class UserName {

    public String getName() {
        String name = "Zelda";

        return name;
    }
}

public class MainHelloName {
    public static void main(String[] args) {
        UserName name = new UserName();

        name.getName();
        System.out.println("Hello, " +name.getName());
    }
}


//TODO:
//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//
//helloName("Bob") → "Hello Bob!"
//helloName("Alice") → "Hello Alice!"
//helloName("X") → "Hello X!"