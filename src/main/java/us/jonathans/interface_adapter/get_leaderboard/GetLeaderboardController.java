package us.jonathans.interface_adapter.get_leaderboard;

import us.jonathans.use_case.get_leaderboard.GetLeaderboardInputBoundary;

public class GetLeaderboardController {
    private final GetLeaderboardInputBoundary getLeaderboardInteractor;


    public GetLeaderboardController(GetLeaderboardInputBoundary getLeaderboardInteractor) {
        this.getLeaderboardInteractor = getLeaderboardInteractor;
    }

    public void execute(){
        getLeaderboardInteractor.execute();
    }
}
