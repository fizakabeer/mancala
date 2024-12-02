package us.jonathans;

import us.jonathans.app.App;
import us.jonathans.app.AppBuilder;

public class Main {
    public static void main(String[] args) {
        App app = new AppBuilder()
                .addStartGameUseCase()
                .addLeaderboardUseCase()
                .addPostLeaderboardUseCase()
                .addPostLeaderboardView()
                .addMakePlayerMoveUseCase()
                .addMakeComputerMoveUseCase()
                .addCancelMatchUseCase()
                .build();
        app.run();
    }
}