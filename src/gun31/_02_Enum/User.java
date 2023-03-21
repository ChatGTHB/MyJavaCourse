package gun31._02_Enum;

public class User {
    String username;
    Role role;
    Statu statu;

    public User(String username, Role role, Statu statu) {
        this.username = username;
        this.role = role;
        this.statu = statu;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }

    public static void userSil(User user){
        if(user.role==Role.ADMIN){
            System.out.println("\""+user.username+"\" -"
                    +" Admin silinemez.");
        }
    }
}
