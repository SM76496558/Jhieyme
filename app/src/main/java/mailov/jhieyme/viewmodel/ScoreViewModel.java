package mailov.jhieyme.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {


    private MutableLiveData<Integer> score = new MutableLiveData<>(0);


    public void ScoreUp() {
        Integer scoreCurrent = score.getValue();
        Integer scoreNew = scoreCurrent + 10;
        score.setValue(scoreNew);
    }

    public void ScoreDown() {
        Integer scoreCurrent = score.getValue();
        if (scoreCurrent != 0){
            Integer scoreNew = scoreCurrent - 10;
            score.setValue(scoreNew);
        }

    }


    public LiveData<Integer> getScoreCurrent() {
        return score;
    }
}
