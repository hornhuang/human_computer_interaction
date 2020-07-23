package com.example.wxandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.wxandroidapp.file.ShareFileActivity;
import com.example.wxandroidapp.game.GameActivity;
import com.example.wxandroidapp.music.activity.ShareMusicActivity;
import com.example.wxandroidapp.picture.SharePictureActivity;
import com.example.wxandroidapp.qingming.QingmingActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView mPictureImage;
    private ImageView mMusicImage;
    private ImageView mFileImage;
    private ImageView mQingMingImage;
    private ImageView mGameImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        mPictureImage = findViewById(R.id.share_pics);
        mMusicImage = findViewById(R.id.share_musics);
        mFileImage = findViewById(R.id.share_fliles);
        mQingMingImage = findViewById(R.id.share_qingming);
        mGameImage = findViewById(R.id.share_games);

        Glide.with(this).load(getDrawable(R.drawable.picture_introduce)).into(mPictureImage);
        Glide.with(this).load(getDrawable(R.drawable.music_introduce)).into(mMusicImage);
        Glide.with(this).load(getDrawable(R.drawable.files_introduce)).into(mFileImage);
        Glide.with(this).load(getDrawable(R.drawable.qingming_introduce)).into(mQingMingImage);
        Glide.with(this).load(getDrawable(R.drawable.game_introduce)).into(mGameImage);
    }


    public void jumpPicture(View view) {
        SharePictureActivity.actionStart(this);
    }

    public void jumpMusic(View view) {
        ShareMusicActivity.actionStart(this);
    }

    public void jumpFile(View view) {
        ShareFileActivity.actionStart(this);
    }

    public void jumpQingming(View view) {
        QingmingActivity.actionStart(this);
    }

    public void jumpGame(View view) {
        GameActivity.actionStart(this);
    }
}
