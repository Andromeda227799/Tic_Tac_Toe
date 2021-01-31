package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    int[] arr={0,0,0,0,0,0,0,0,0};
    int chance=1;

    Button button;

    public void checkFun_for_1(){
        if(arr[0]==1&&arr[1]==1&&arr[2]==1){
            ImageView image=findViewById(R.id.slanttop);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 1 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }else if(arr[3]==1&&arr[4]==1&&arr[5]==1){
            ImageView image=findViewById(R.id.slantmiddle);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 1 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }else if(arr[6]==1&&arr[7]==1&&arr[8]==1){
            ImageView image=findViewById(R.id.slantbottom);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 1 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }else if(arr[0]==1&&arr[3]==1&&arr[6]==1){
            ImageView image=findViewById(R.id.straightleft);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 1 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }else if(arr[1]==1&&arr[4]==1&&arr[7]==1){
            ImageView image=findViewById(R.id.straightmidddle);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 1 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }else if(arr[2]==1&&arr[5]==1&&arr[8]==1){
            ImageView image=findViewById(R.id.straightright);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 1 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }else if(arr[0]==1&&arr[4]==1&&arr[8]==1){
            ImageView image=findViewById(R.id.right);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 1 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }else if(arr[2]==1&&arr[4]==1&&arr[6]==1){
            ImageView image=findViewById(R.id.left);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 1 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }
    }

    public void checkFun_for_2(){
        if(arr[0]==2&&arr[1]==2&&arr[2]==2){
            ImageView image=findViewById(R.id.slanttop);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 2 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }else if(arr[3]==2&&arr[4]==2&&arr[5]==2){
            ImageView image=findViewById(R.id.slantmiddle);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 2 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }else if(arr[6]==2&&arr[7]==2&&arr[8]==2){
            ImageView image=findViewById(R.id.slantbottom);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 2 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }else if(arr[0]==2&&arr[3]==2&&arr[6]==2){
            ImageView image=findViewById(R.id.straightleft);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 2 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }else if(arr[1]==2&&arr[4]==2&&arr[7]==2){
            ImageView image=findViewById(R.id.straightmidddle);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 2 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }else if(arr[2]==2&&arr[5]==2&&arr[8]==2){
            ImageView image=findViewById(R.id.straightright);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 2 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }else if(arr[0]==2&&arr[4]==2&&arr[8]==2){
            ImageView image=findViewById(R.id.right);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 2 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }else if(arr[2]==2&&arr[4]==2&&arr[6]==2){
            ImageView image=findViewById(R.id.left);
            image.animate().alpha(1).setDuration(1000);
            Toast.makeText(this,"Player 2 won!! Please Restart!",Toast.LENGTH_LONG).show();
            button.setEnabled(true);

        }
    }

public void buttonClick(View view){
        ImageView image1=findViewById(R.id.first);
    ImageView image2=findViewById(R.id.second);
    ImageView image3=findViewById(R.id.third);
    ImageView image4=findViewById(R.id.fourth);
    ImageView image5=findViewById(R.id.fifth);
    ImageView image6=findViewById(R.id.sixth);
    ImageView image7=findViewById(R.id.seventh);
    ImageView image8=findViewById(R.id.eight);
    ImageView image9=findViewById(R.id.ninth);

    ImageView image10=findViewById(R.id.right);
    ImageView image11=findViewById(R.id.left);
    ImageView image12=findViewById(R.id.slantbottom);
    ImageView image13=findViewById(R.id.slantmiddle);
    ImageView image14=findViewById(R.id.slanttop);
    ImageView image15=findViewById(R.id.straightright);
    ImageView image16=findViewById(R.id.straightmidddle);
    ImageView image17=findViewById(R.id.straightleft);



    image1.animate().alpha(0).setDuration(0);
    image2.animate().alpha(0).setDuration(0);
    image3.animate().alpha(0).setDuration(0);
    image4.animate().alpha(0).setDuration(0);
    image5.animate().alpha(0).setDuration(0);
    image6.animate().alpha(0).setDuration(0);
    image7.animate().alpha(0).setDuration(0);
    image8.animate().alpha(0).setDuration(0);
    image9.animate().alpha(0).setDuration(0);

    image10.animate().alpha(0).setDuration(0);
    image11.animate().alpha(0).setDuration(0);
    image12.animate().alpha(0).setDuration(0);
    image14.animate().alpha(0).setDuration(0);
    image15.animate().alpha(0).setDuration(0);
    image16.animate().alpha(0).setDuration(0);
    image17.animate().alpha(0).setDuration(0);
    image13.animate().alpha(0).setDuration(0);

    chance=1;
    Toast.makeText(this,"GO Player 1!",Toast.LENGTH_SHORT);

    arr[0]=0;
    arr[1]=0;
    arr[2]=0;
    arr[3]=0;
    arr[4]=0;
    arr[5]=0;
    arr[6]=0;
    arr[7]=0;
    arr[8]=0;



    button.setEnabled(false);

}

    public void clickOne(View view){

        if(chance==1){
            arr[0]=1;
            ImageView image_one=findViewById(R.id.first);
            image_one.setImageResource(R.drawable.cross);
            image_one.animate().alpha(1).setDuration(1500);

            checkFun_for_1();

            chance=2;
        }else if(chance==2){
            arr[0]=2;
            ImageView image_one=findViewById(R.id.first);
            image_one.setImageResource(R.drawable.zero);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_2();
            chance=1;
        }
    }

    public void clickTwo(View view){
        if(chance==1){
            arr[1]=1;
            ImageView image_one=findViewById(R.id.second);
            image_one.setImageResource(R.drawable.cross);
            image_one.animate().alpha(1).setDuration(1500);

            checkFun_for_1();
            chance=2;
        }else if(chance==2){
            arr[1]=2;
            ImageView image_one=findViewById(R.id.second);
            image_one.setImageResource(R.drawable.zero);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_2();
            chance=1;
        }
    }
    public void clickThree(View view){
        if(chance==1){
            arr[2]=1;
            ImageView image_one=findViewById(R.id.third);
            image_one.setImageResource(R.drawable.cross);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_1();
            chance=2;
        }else if(chance==2){
            arr[2]=2;
            ImageView image_one=findViewById(R.id.third);
            image_one.setImageResource(R.drawable.zero);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_2();
            chance=1;
        }
    }
    public void clickFour(View view){
        if(chance==1){
            arr[3]=1;
            ImageView image_one=findViewById(R.id.fourth);
            image_one.setImageResource(R.drawable.cross);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_1();
            chance=2;
        }else if(chance==2){
            arr[3]=2;
            ImageView image_one=findViewById(R.id.fourth);
            image_one.setImageResource(R.drawable.zero);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_2();
            chance=1;
        }
    }
    public void clickFive(View view){
        if(chance==1){
            arr[4]=1;
            ImageView image_one=findViewById(R.id.fifth);
            image_one.setImageResource(R.drawable.cross);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_1();
            chance=2;
        }else if(chance==2){
            arr[4]=2;
            ImageView image_one=findViewById(R.id.fifth);
            image_one.setImageResource(R.drawable.zero);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_2();
            chance=1;
        }
    }
    public void clickSix(View view){
        if(chance==1){
            arr[5]=1;
            ImageView image_one=findViewById(R.id.sixth);
            image_one.setImageResource(R.drawable.cross);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_1();
            chance=2;
        }else if(chance==2){
            arr[5]=2;
            ImageView image_one=findViewById(R.id.sixth);
            image_one.setImageResource(R.drawable.zero);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_2();
            chance=1;
        }
    }
    public void clickSeven(View view){
        if(chance==1){
            arr[6]=1;
            ImageView image_one=findViewById(R.id.seventh);
            image_one.setImageResource(R.drawable.cross);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_1();
            chance=2;
        }else if(chance==2){
            arr[6]=2;
            ImageView image_one=findViewById(R.id.seventh);
            image_one.setImageResource(R.drawable.zero);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_2();
            chance=1;
        }
    }
    public void clickEight(View view){
        if(chance==1){
            arr[7]=1;
            ImageView image_one=findViewById(R.id.eight);
            image_one.setImageResource(R.drawable.cross);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_1();
            chance=2;
        }else if(chance==2){
            arr[7]=2;
            ImageView image_one=findViewById(R.id.eight);
            image_one.setImageResource(R.drawable.zero);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_2();
            chance=1;
        }
    }
    public void clickNine(View view){
        if(chance==1){
            arr[8]=1;
            ImageView image_one=findViewById(R.id.ninth);
            image_one.setImageResource(R.drawable.cross);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_1();
            chance=2;
        }else if(chance==2){
            arr[8]=2;
            ImageView image_one=findViewById(R.id.ninth);
            image_one.setImageResource(R.drawable.zero);
            image_one.animate().alpha(1).setDuration(1500);
            checkFun_for_2();
            chance=1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button4);
    }
}