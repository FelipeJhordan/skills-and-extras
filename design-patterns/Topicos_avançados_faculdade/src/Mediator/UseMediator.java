package Mediator;

public class UseMediator {
    public static void main() {
        ConcreteMediator mediator = new ConcreteMediator();

        UserDefault userdefault = new UserDefault(mediator);
        UserVip uservip = new UserVip(mediator);

        mediator.adicionarColleague(userdefault);
        mediator.adicionarColleague(uservip);

        uservip.enviarMensagem("Olá gente, eu sou vip");
        userdefault.enviarMensagem("Olá gente, eu sou padrao");
        userdefault.enviarMensagem("Olá gente, eu sou padrao");
    }
}
