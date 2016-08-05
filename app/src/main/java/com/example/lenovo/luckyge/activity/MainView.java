package com.example.lenovo.luckyge.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.lenovo.luckyge.R;
import com.example.lenovo.luckyge.adapter.myFragmentPagerAdapter;
import com.example.lenovo.luckyge.fragment.CoAdvFragment;
import com.example.lenovo.luckyge.fragment.CoInfoFragment;
import com.example.lenovo.luckyge.fragment.CoSysFragment;
import com.example.lenovo.luckyge.fragment.HomePageFragment;
import com.example.lenovo.luckyge.fragment.SerIdeaFragment;

import java.util.ArrayList;



public class MainView extends FragmentActivity{
    private ViewPager mPager;
    private RadioGroup mGroup;
    private RadioButton rbHP,rbSI,rbCI,rbCS,rbCA;
    private ArrayList<Fragment> fragmentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view);
        //初始化界面组件
        initView();
        //初始化ViewPager
        initViewPager();
    }

    private void initView(){
        mPager=(ViewPager)findViewById(R.id.viewPager);
        mGroup=(RadioGroup)findViewById(R.id.radiogroup);
        rbHP=(RadioButton)findViewById(R.id.rb_hp);
        rbSI=(RadioButton)findViewById(R.id.rb_si);
        rbCI=(RadioButton)findViewById(R.id.rb_ci);
        rbCS=(RadioButton)findViewById(R.id.rb_cs);
        rbCA=(RadioButton)findViewById(R.id.rb_ca);
        //RadioGroup选中状态改变监听
        mGroup.setOnCheckedChangeListener(new myCheckChangeListener());
    }

    private void initViewPager(){
        HomePageFragment hpFragment=new HomePageFragment();
        CoInfoFragment ciFragment=new CoInfoFragment();
        SerIdeaFragment siFragment=new SerIdeaFragment();
        CoSysFragment csFragment=new CoSysFragment();
        CoAdvFragment caFragment=new CoAdvFragment();
        fragmentList=new ArrayList<Fragment>();
        fragmentList.add(hpFragment);
        fragmentList.add(ciFragment);
        fragmentList.add(siFragment);
        fragmentList.add(csFragment);
        fragmentList.add(caFragment);
        //ViewPager设置适配器
        mPager.setAdapter(new myFragmentPagerAdapter(getSupportFragmentManager(), fragmentList));
        //ViewPager显示第一个Fragment
        mPager.setCurrentItem(0);
        //ViewPager页面切换监听
        mPager.setOnPageChangeListener(new myOnPageChangeListener());
    }

    /**
     *RadioButton切换Fragment
     */
    private class myCheckChangeListener implements RadioGroup.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId){
                case R.id.rb_hp:
                    //ViewPager显示第一个Fragment且关闭页面切换动画效果
                    mPager.setCurrentItem(0,false);
                    break;
                case R.id.rb_ci:
                    mPager.setCurrentItem(1,false);
                    break;
                case R.id.rb_si:
                    mPager.setCurrentItem(2,false);
                    break;
                case R.id.rb_cs:
                    mPager.setCurrentItem(3,false);
                    break;
                case R.id.rb_ca:
                    mPager.setCurrentItem(4,false);
            }
        }
    }

    /**
     *ViewPager切换Fragment,RadioGroup做相应变化
     */
    private class myOnPageChangeListener implements ViewPager.OnPageChangeListener{

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            switch (position){
                case 0:
                    mGroup.check(R.id.rb_hp);
                    break;
                case 1:
                    mGroup.check(R.id.rb_ci);
                    break;
                case 2:
                    mGroup.check(R.id.rb_si);
                    break;
                case 3:
                    mGroup.check(R.id.rb_cs);
                    break;
                case 4:
                    mGroup.check(R.id.rb_ca);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }
}
