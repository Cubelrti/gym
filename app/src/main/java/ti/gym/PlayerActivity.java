package ti.gym;

import android.os.Bundle;


import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.view.View;

import com.dou361.ijkplayer.listener.OnPlayerBackListener;
import com.dou361.ijkplayer.widget.PlayStateParams;
import com.dou361.ijkplayer.widget.PlayerView;

public class PlayerActivity extends Activity {

    private PlayerView player;
    private Context mContext;
    private View rootView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mContext = this;
        rootView = getLayoutInflater().from(this).inflate(R.layout.simple_player_view_player, null);
        setContentView(rootView);
        String url = "http://183.6.245.249/v.cctv.com/flash/mp4video6/TMS/2011/01/05/cf752b1c12ce452b3040cab2f90bc265_h264818000nero_aac32-1.mp4";
        player = new PlayerView(this, rootView)
                .setTitle("什么")
                .setScaleType(PlayStateParams.fitparent)
                .forbidTouch(false)
                .hideMenu(true)
                .setPlaySource(url)
                .setPlayerBackListener(new OnPlayerBackListener() {
                    @Override
                    public void onPlayerBack() {
                        //这里可以简单播放器点击返回键
                        finish();
                    }
                })
                .startPlay();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (player != null) {
            player.onPause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (player != null) {
            player.onResume();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (player != null) {
            player.onDestroy();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (player != null) {
            player.onConfigurationChanged(newConfig);
        }
    }

    @Override
    public void onBackPressed() {
        if (player != null && player.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

}