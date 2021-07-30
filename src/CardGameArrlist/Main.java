package CardGameArrlist;



public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        game.initGame();
        game.startGame();

        //есть проблема и не одна геймстартер при снятии получает снова ход, а также иногда выдает карту на выбор которая ниже по рангу атакующей карты (когда атакуют козырем)
        // реализация гавно !!! походу где-то можно битса младшей картой, надо подумать как исключить !!!

    }
}
