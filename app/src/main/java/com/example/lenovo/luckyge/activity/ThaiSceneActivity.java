package com.example.lenovo.luckyge.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.lenovo.luckyge.R;

public class ThaiSceneActivity extends AppCompatActivity implements View.OnClickListener,View.OnTouchListener{

    //手指向右滑动时的最小速度
    private static final int XSPEED_MIN = 200;

    //手指向右滑动时的最小距离
    private static final int XDISTANCE_MIN = 150;

    //记录手指按下时的横坐标。
    private float xDown;

    //记录手指移动时的横坐标。
    private float xMove;

    //用于计算手指滑动的速度。
    private VelocityTracker mVelocityTracker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai_scene);
        Button btnbkk = (Button) findViewById(R.id.btn_bkk);
        btnbkk.setOnClickListener(this);
        Button btncm = (Button)findViewById(R.id.btn_cm);
        btncm.setOnClickListener(this);
        Button btnhkt = (Button) findViewById(R.id.btn_hkt);
        btnhkt.setOnClickListener(this);
        Button btnpat = (Button) findViewById(R.id.btn_pattaya);
        btnpat.setOnClickListener(this);

        LinearLayout tsllayout = (LinearLayout) findViewById(R.id.tsllayout);
        Log.i("tsllayout","taoguofengqing ke yi pao le "+tsllayout);
        tsllayout.setOnTouchListener(this);
        ((LinearLayout)findViewById(R.id.tsllayout1)).setOnTouchListener(this);
        ((LinearLayout)findViewById(R.id.tsllayout2)).setOnTouchListener(this);
    }

    @Override
    public void onClick(View btn) {
        if(btn.getId()==R.id.btn_bkk){
            Intent intent =new Intent(ThaiSceneActivity.this,ThaiBkkActivity.class);
            startActivity(intent);}
        else if(btn.getId()==R.id.btn_cm){
            Intent intent =new Intent(ThaiSceneActivity.this,ThaiCmActivity.class);
            startActivity(intent);
        }else if(btn.getId()==R.id.btn_hkt){
            Intent intent =new Intent(ThaiSceneActivity.this,ThaiHktActivity.class);
            startActivity(intent);
        }else if(btn.getId()==R.id.btn_pattaya){
            Intent intent =new Intent(ThaiSceneActivity.this,ThaiPatActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        createVelocityTracker(event);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                xDown = event.getRawX();
                break;
            case MotionEvent.ACTION_MOVE:
                xMove = event.getRawX();
                //活动的距离
                int distanceX = (int) (xMove - xDown);
                //获取顺时速度
                int xSpeed = getScrollVelocity();
                //当滑动的距离大于我们设定的最小距离且滑动的瞬间速度大于我们设定的速度时，返回到上一个activity
                if(distanceX > XDISTANCE_MIN && xSpeed > XSPEED_MIN) {
                    finish();
                }
                break;
            case MotionEvent.ACTION_UP:
                recycleVelocityTracker();
                break;
            default:
                break;
        }
        return true;
    }

    /**
     * 创建VelocityTracker对象，并将触摸content界面的滑动事件加入到VelocityTracker当中。
     *
     * @param event
     *
     */
    private void createVelocityTracker(MotionEvent event) {
        if (mVelocityTracker == null) {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(event);
    }

    /**
     * 回收VelocityTracker对象。
     */
    private void recycleVelocityTracker() {
        mVelocityTracker.recycle();
        mVelocityTracker = null;
    }

    /**
     * 获取手指在content界面滑动的速度。
     *
     * @return 滑动速度，以每秒钟移动了多少像素值为单位。
     */
    private int getScrollVelocity() {
        mVelocityTracker.computeCurrentVelocity(1000);
        int velocity = (int) mVelocityTracker.getXVelocity();
        return Math.abs(velocity);
    }
}
