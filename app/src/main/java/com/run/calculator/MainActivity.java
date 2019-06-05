package com.run.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int answer = 0;  //計算結果
    public int number = 0; //入力された数字
    public int operation = 0;// 計算方法を管理

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView.setText("0");//textView に0を表示
    }

    public void zero(View v) {

        number = number * 10 + 0; //0が押されたとき、今までの数字に１０をかけて、0を加える
        textView.setText(String.valueOf(number));//int型numberをString型で表示

    }

    public void one(View v) {

        number = number * 10 + 1; //0が押されたとき、今までの数字に１０をかけて、1を加える
        textView.setText(String.valueOf(number));//int型numberをString型で表示

    }

    public void two(View v) {

        number = number * 10 + 2; //0が押されたとき、今までの数字に１０をかけて、2を加える
        textView.setText(String.valueOf(number));//int型numberをString型で表示

    }

    public void three(View v) {

        number = number * 10 + 3; //0が押されたとき、今までの数字に１０をかけて、3を加える
        textView.setText(String.valueOf(number));//int型numberをString型で表示

    }

    public void four(View v) {

        number = number * 10 + 4; //0が押されたとき、今までの数字に１０をかけて、4を加える
        textView.setText(String.valueOf(number));//int型numberをString型で表示

    }

    public void five(View v) {

        number = number * 10 + 5; //0が押されたとき、今までの数字に１０をかけて、5を加える
        textView.setText(String.valueOf(number));//int型numberをString型で表示

    }

    public void six(View v){

        number = number * 10 + 6; //0が押されたとき、今までの数字に１０をかけて、6を加える
        textView.setText(String.valueOf(number));//int型numberをString型で表示

    }

    public void seven(View v){

        number = number * 10 + 7; //0が押されたとき、今までの数字に１０をかけて、7を加える
        textView.setText(String.valueOf(number));//int型numberをString型で表示

    }

    public void eight(View v){

        number = number * 10 + 8; //0が押されたとき、今までの数字に１０をかけて、8を加える
        textView.setText(String.valueOf(number));//int型numberをString型で表示

    }

    public void nine(View v){

        number = number * 10 + 9; //0が押されたとき、今までの数字に１０をかけて、9を加える
        textView.setText(String.valueOf(number));//int型numberをString型で表示

    }

    public void calculate(){
        switch(operation){
            //はじめ
            case 0:
                answer = number;
                break;

            case 1:
                answer = answer + number;
                break;

            case 2:
                answer = answer - number;
                break;

            case 3:
                answer = answer * number;
                break;

            case 4:
                answer = answer / number;
                break;
        }

        number = 0; //計算が終わるごとに、case0に戻して、振出に戻る
    }

    public void plus(View v){
        calculate(); //calculate()でcalculateメソッドの呼び出し
        operation = 1;//1の足す処理を行わせる
        textView.setText("+");
    }

    public void minus(View v){
        calculate();
        operation = 2;
        textView.setText("-");
    }

    public void multiplication(View v){
        calculate();
        operation = 3;
        textView.setText("×");
    }

    public void division(View v){
        calculate();
        operation = 4;
        textView.setText("÷");
    }

    public void equal(View v){
        calculate();
        textView.setText(String.valueOf(answer));
        allClear();
    }

    public void  clear(View v){

        allClear();
        textView.setText(String.valueOf(answer));

    }

    public void allClear(){
        answer = 0;
        number = 0;
        operation  =0;
    }




}
