package alizarchik.alex.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by aoalizarchik.
 */

public class SoundViewModel extends BaseObservable {

    private BeatBox mBeatBox;
    private Sound mSound;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }

    @Bindable
    public String getTitle() {
        return mSound.getName();
    }

    public void onButtonClicked() {
        mBeatBox.play(mSound);
    }
}
