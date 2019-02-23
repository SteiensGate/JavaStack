package designpattern.state;

/**
 * 已预订状态
 * */
public class BookedState implements State{
    @Override
    public void handle() {
        System.out.println("房间已预定！别人不能定！");
    }
}
