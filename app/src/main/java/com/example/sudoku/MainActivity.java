package com.example.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int mat[][] = new int[9][9];
    EditText m00,m01,m02,m03,m04,m05,m06,m07,m08,m10,m11,m12,m13,m14,m15,m16,m17,m18,m20,m21,m22,m23,m24,m25,m26,m27,m28,m30,m31,m32,m33,m34,m35,m36,m37,m38,m40,m41,m42,m43,m44,m45,m46,m47,m48,m50,m51,m52,m53,m54,m55,m56,m57,m58,m60,m61,m62,m63,m64,m65,m66,m67,m68,m70,m71,m72,m73,m74,m75,m76,m77,m78,m80,m81,m82,m83,m84,m85,m86,m87,m88;

    Boolean isRowSafe(int row,int num){
        for(int i=0;i<9;i++){
            if(mat[row][i]==num){
                return false;
            }
        }
        return true;
    }
    Boolean isColSafe(int col,int num){
        for(int i=0;i<9;i++){
            if(mat[i][col]==num){
                return false;
            }
        }
        return true;
    }
    Boolean isBoxSafe(int row,int col,int num){
        int rowStart = row-row%3;
        int colStart= col-col%3;
        for(int i=rowStart;i<rowStart+3;i++){
            for(int j=colStart;j<colStart+3;j++){
                if(mat[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }

    Boolean canPlaceNum(int row,int col,int num){
        if(!isRowSafe(row,num)){
            //cout<<"\nrow unsafe  "<<row<<" "<<col<<" "<<num;
            return false;
        }
        if(!isColSafe(col,num)){
            //cout<<"\ncol unsafe  "<<row<<" "<<col<<" "<<num;
            return false;
        }
        if(!isBoxSafe(row,col,num)){
            //	cout<<"\nbox unsafe  "<<row<<" "<<col<<" "<<num;
            return false;
        }
        return true;
    }



    Boolean sudokuSolver(){
        int row=-1;
        int col=-1;
        Boolean isEmpty=false;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(mat[i][j]==0){
                    isEmpty=true;
                    row=i;
                    col=j;
                    //	cout<<"\n"<<row<<" "<<col;
                    break;
                }

            }
            if(isEmpty)break;
        }
        if(!isEmpty){
            return true;
        }
        for(int num=1;num<=9;num++){
            if(canPlaceNum(row,col,num)){
                //	cout<<"\ncanPlace  "<<row<<" "<<col<<" "<<num;
                mat[row][col]=num;
///////////////////////////////////////////////////
			/*	 	cout<<"\n";
	    for(int i=0;i<9;i++){
	        for(int j=0;j<9;j++){
	            cout<<mat[i][j]<<" ";
	        }
	        cout<<"\n";
	    }	*/
///////////////////////////////////////////////////////////
                if(sudokuSolver()){
                    return true;
                }
                mat[row][col]=0;
            }
        }
        return false;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        Button clear = findViewById(R.id.clear);
        m00 = findViewById(R.id.m00);
        m01 = findViewById(R.id.m01);
        m02 = findViewById(R.id.m02);
        m03 = findViewById(R.id.m03);
        m04 = findViewById(R.id.m04);
        m05 = findViewById(R.id.m05);
        m06 = findViewById(R.id.m06);
        m07 = findViewById(R.id.m07);
        m08 = findViewById(R.id.m08);


        m10 = findViewById(R.id.m10);
        m11 = findViewById(R.id.m11);
        m12 = findViewById(R.id.m12);
        m13 = findViewById(R.id.m13);
        m14 = findViewById(R.id.m14);
        m15 = findViewById(R.id.m15);
        m16 = findViewById(R.id.m16);
        m17 = findViewById(R.id.m17);
        m18 = findViewById(R.id.m18);

        m20 = findViewById(R.id.m20);
        m21 = findViewById(R.id.m21);
        m22 = findViewById(R.id.m22);
        m23 = findViewById(R.id.m23);
        m24 = findViewById(R.id.m24);
        m25 = findViewById(R.id.m25);
        m26 = findViewById(R.id.m26);
        m27 = findViewById(R.id.m27);
        m28 = findViewById(R.id.m28);

        m30 = findViewById(R.id.m30);
        m31 = findViewById(R.id.m31);
        m32 = findViewById(R.id.m32);
        m33 = findViewById(R.id.m33);
        m34 = findViewById(R.id.m34);
        m35 = findViewById(R.id.m35);
        m36 = findViewById(R.id.m36);
        m37 = findViewById(R.id.m37);
        m38 = findViewById(R.id.m38);

        m40 = findViewById(R.id.m40);
        m41 = findViewById(R.id.m41);
        m42 = findViewById(R.id.m42);
        m43 = findViewById(R.id.m43);
        m44 = findViewById(R.id.m44);
        m45 = findViewById(R.id.m45);
        m46 = findViewById(R.id.m46);
        m47 = findViewById(R.id.m47);
        m48 = findViewById(R.id.m48);

        m50 = findViewById(R.id.m50);
        m51 = findViewById(R.id.m51);
        m52 = findViewById(R.id.m52);
        m53 = findViewById(R.id.m53);
        m54 = findViewById(R.id.m54);
        m55 = findViewById(R.id.m55);
        m56 = findViewById(R.id.m56);
        m57 = findViewById(R.id.m57);
        m58 = findViewById(R.id.m58);

        m60 = findViewById(R.id.m60);
        m61 = findViewById(R.id.m61);
        m62 = findViewById(R.id.m62);
        m63 = findViewById(R.id.m63);
        m64 = findViewById(R.id.m64);
        m65 = findViewById(R.id.m65);
        m66 = findViewById(R.id.m66);
        m67 = findViewById(R.id.m67);
        m68 = findViewById(R.id.m68);

        m70 = findViewById(R.id.m70);
        m71 = findViewById(R.id.m71);
        m72 = findViewById(R.id.m72);
        m73 = findViewById(R.id.m73);
        m74 = findViewById(R.id.m74);
        m75 = findViewById(R.id.m75);
        m76 = findViewById(R.id.m76);
        m77 = findViewById(R.id.m77);
        m78 = findViewById(R.id.m78);

        m80 = findViewById(R.id.m80);
        m81 = findViewById(R.id.m81);
        m82 = findViewById(R.id.m82);
        m83 = findViewById(R.id.m83);
        m84 = findViewById(R.id.m84);
        m85 = findViewById(R.id.m85);
        m86 = findViewById(R.id.m86);
        m87 = findViewById(R.id.m87);
        m88 = findViewById(R.id.m88);


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m00.setText("");
                m01.setText("");
                m02.setText("");
                m03.setText("");
                m04.setText("");
                m05.setText("");
                m06.setText("");
                m07.setText("");
                m08.setText("");

                m10.setText("");
                m11.setText("");
                m12.setText("");
                m13.setText("");
                m14.setText("");
                m15.setText("");
                m16.setText("");
                m17.setText("");
                m18.setText("");

                m20.setText("");
                m21.setText("");
                m22.setText("");
                m23.setText("");
                m24.setText("");
                m25.setText("");
                m26.setText("");
                m27.setText("");
                m28.setText("");

                m30.setText("");
                m31.setText("");
                m32.setText("");
                m33.setText("");
                m34.setText("");
                m35.setText("");
                m36.setText("");
                m37.setText("");
                m38.setText("");

                m40.setText("");
                m41.setText("");
                m42.setText("");
                m43.setText("");
                m44.setText("");
                m45.setText("");
                m46.setText("");
                m47.setText("");
                m48.setText("");

                m50.setText("");
                m51.setText("");
                m52.setText("");
                m53.setText("");
                m54.setText("");
                m55.setText("");
                m56.setText("");
                m57.setText("");
                m58.setText("");

                m60.setText("");
                m61.setText("");
                m62.setText("");
                m63.setText("");
                m64.setText("");
                m65.setText("");
                m66.setText("");
                m67.setText("");
                m68.setText("");

                m70.setText("");
                m71.setText("");
                m72.setText("");
                m73.setText("");
                m74.setText("");
                m75.setText("");
                m76.setText("");
                m77.setText("");
                m78.setText("");

                m80.setText("");
                m81.setText("");
                m82.setText("");
                m83.setText("");
                m84.setText("");
                m85.setText("");
                m86.setText("");
                m87.setText("");
                m88.setText("");

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = m00.getText().toString();
                if(str.equals("")){mat[0][0]=0;}else
                {mat[0][0] = Integer.parseInt(str);}

                str = m01.getText().toString();
                if(str.equals("")){mat[0][1]=0;}else
                    mat[0][1] = Integer.parseInt(str);

                str = m02.getText().toString();
                if(str.equals("")){mat[0][2]=0;}else
                    mat[0][2] = Integer.parseInt(str);

                str = m03.getText().toString();
                if(str.equals("")){mat[0][3]=0;}else
                    mat[0][3] = Integer.parseInt(str);

                str = m04.getText().toString();
                if(str.equals("")){mat[0][4]=0;}else
                    mat[0][4] = Integer.parseInt(str);

                str = m05.getText().toString();
                if(str.equals("")){mat[0][5]=0;}else
                    mat[0][5] = Integer.parseInt(str);

                str = m06.getText().toString();
                if(str.equals("")){mat[0][6]=0;}else
                    mat[0][6] = Integer.parseInt(str);

                str = m07.getText().toString();
                if(str.equals("")){mat[0][7]=0;}else
                    mat[0][7] = Integer.parseInt(str);

                str = m08.getText().toString();
                if(str.equals("")){mat[0][8]=0;}else
                    mat[0][8] = Integer.parseInt(str);


                str = m10.getText().toString();
                if(str.equals("")){mat[1][0]=0;}else
                {mat[1][0] = Integer.parseInt(str);}

                str = m11.getText().toString();
                if(str.equals("")){mat[1][1]=0;}else
                    mat[1][1] = Integer.parseInt(str);

                str = m12.getText().toString();
                if(str.equals("")){mat[1][2]=0;}else
                    mat[1][2] = Integer.parseInt(str);

                str = m13.getText().toString();
                if(str.equals("")){mat[1][3]=0;}else
                    mat[1][3] = Integer.parseInt(str);

                str = m14.getText().toString();
                if(str.equals("")){mat[1][4]=0;}else
                    mat[1][4] = Integer.parseInt(str);

                str = m15.getText().toString();
                if(str.equals("")){mat[1][5]=0;}else
                    mat[1][5] = Integer.parseInt(str);

                str = m06.getText().toString();
                if(str.equals("")){mat[1][6]=0;}else
                    mat[1][6] = Integer.parseInt(str);

                str = m17.getText().toString();
                if(str.equals("")){mat[1][7]=0;}else
                    mat[1][7] = Integer.parseInt(str);

                str = m18.getText().toString();
                if(str.equals("")){mat[1][8]=0;}else
                    mat[1][8] = Integer.parseInt(str);


                str = m20.getText().toString();
                if(str.equals("")){mat[2][0]=0;}else
                {mat[2][0] = Integer.parseInt(str);}

                str = m21.getText().toString();
                if(str.equals("")){mat[2][1]=0;}else
                    mat[2][1] = Integer.parseInt(str);

                str = m22.getText().toString();
                if(str.equals("")){mat[2][2]=0;}else
                    mat[2][2] = Integer.parseInt(str);

                str = m23.getText().toString();
                if(str.equals("")){mat[2][3]=0;}else
                    mat[2][3] = Integer.parseInt(str);

                str = m24.getText().toString();
                if(str.equals("")){mat[2][4]=0;}else
                    mat[2][4] = Integer.parseInt(str);

                str = m25.getText().toString();
                if(str.equals("")){mat[2][5]=0;}else
                    mat[2][5] = Integer.parseInt(str);

                str = m26.getText().toString();
                if(str.equals("")){mat[2][6]=0;}else
                    mat[2][6] = Integer.parseInt(str);

                str = m27.getText().toString();
                if(str.equals("")){mat[2][7]=0;}else
                    mat[2][7] = Integer.parseInt(str);

                str = m28.getText().toString();
                if(str.equals("")){mat[2][8]=0;}else
                    mat[2][8] = Integer.parseInt(str);


                str = m30.getText().toString();
                if(str.equals("")){mat[3][0]=0;}else
                {mat[3][0] = Integer.parseInt(str);}

                str = m31.getText().toString();
                if(str.equals("")){mat[3][1]=0;}else
                    mat[3][1] = Integer.parseInt(str);

                str = m32.getText().toString();
                if(str.equals("")){mat[3][2]=0;}else
                    mat[3][2] = Integer.parseInt(str);

                str = m33.getText().toString();
                if(str.equals("")){mat[3][3]=0;}else
                    mat[3][3] = Integer.parseInt(str);

                str = m34.getText().toString();
                if(str.equals("")){mat[3][4]=0;}else
                    mat[3][4] = Integer.parseInt(str);

                str = m35.getText().toString();
                if(str.equals("")){mat[3][5]=0;}else
                    mat[3][5] = Integer.parseInt(str);

                str = m36.getText().toString();
                if(str.equals("")){mat[3][6]=0;}else
                    mat[3][6] = Integer.parseInt(str);

                str = m37.getText().toString();
                if(str.equals("")){mat[3][7]=0;}else
                    mat[3][7] = Integer.parseInt(str);

                str = m38.getText().toString();
                if(str.equals("")){mat[3][8]=0;}else
                    mat[3][8] = Integer.parseInt(str);


                str = m40.getText().toString();
                if(str.equals("")){mat[4][0]=0;}else
                {mat[4][0] = Integer.parseInt(str);}

                str = m41.getText().toString();
                if(str.equals("")){mat[4][1]=0;}else
                    mat[4][1] = Integer.parseInt(str);

                str = m42.getText().toString();
                if(str.equals("")){mat[4][2]=0;}else
                    mat[4][2] = Integer.parseInt(str);

                str = m43.getText().toString();
                if(str.equals("")){mat[4][3]=0;}else
                    mat[4][3] = Integer.parseInt(str);

                str = m44.getText().toString();
                if(str.equals("")){mat[4][4]=0;}else
                    mat[4][4] = Integer.parseInt(str);

                str = m45.getText().toString();
                if(str.equals("")){mat[4][5]=0;}else
                    mat[4][5] = Integer.parseInt(str);

                str = m46.getText().toString();
                if(str.equals("")){mat[4][6]=0;}else
                    mat[4][6] = Integer.parseInt(str);

                str = m47.getText().toString();
                if(str.equals("")){mat[4][7]=0;}else
                    mat[4][7] = Integer.parseInt(str);

                str = m48.getText().toString();
                if(str.equals("")){mat[4][8]=0;}else
                    mat[4][8] = Integer.parseInt(str);


                str = m50.getText().toString();
                if(str.equals("")){mat[5][0]=0;}else
                {mat[5][0] = Integer.parseInt(str);}

                str = m51.getText().toString();
                if(str.equals("")){mat[5][1]=0;}else
                    mat[5][1] = Integer.parseInt(str);

                str = m52.getText().toString();
                if(str.equals("")){mat[5][2]=0;}else
                    mat[5][2] = Integer.parseInt(str);

                str = m53.getText().toString();
                if(str.equals("")){mat[5][3]=0;}else
                    mat[5][3] = Integer.parseInt(str);

                str = m54.getText().toString();
                if(str.equals("")){mat[5][4]=0;}else
                    mat[5][4] = Integer.parseInt(str);

                str = m55.getText().toString();
                if(str.equals("")){mat[5][5]=0;}else
                    mat[5][5] = Integer.parseInt(str);

                str = m56.getText().toString();
                if(str.equals("")){mat[5][6]=0;}else
                    mat[5][6] = Integer.parseInt(str);

                str = m57.getText().toString();
                if(str.equals("")){mat[5][7]=0;}else
                    mat[5][7] = Integer.parseInt(str);

                str = m58.getText().toString();
                if(str.equals("")){mat[5][8]=0;}else
                    mat[5][8] = Integer.parseInt(str);


                str = m60.getText().toString();
                if(str.equals("")){mat[6][0]=0;}else
                {mat[6][0] = Integer.parseInt(str);}

                str = m61.getText().toString();
                if(str.equals("")){mat[6][1]=0;}else
                    mat[6][1] = Integer.parseInt(str);

                str = m62.getText().toString();
                if(str.equals("")){mat[6][2]=0;}else
                    mat[6][2] = Integer.parseInt(str);

                str = m63.getText().toString();
                if(str.equals("")){mat[6][3]=0;}else
                    mat[6][3] = Integer.parseInt(str);

                str = m64.getText().toString();
                if(str.equals("")){mat[6][4]=0;}else
                    mat[6][4] = Integer.parseInt(str);

                str = m65.getText().toString();
                if(str.equals("")){mat[6][5]=0;}else
                    mat[6][5] = Integer.parseInt(str);

                str = m66.getText().toString();
                if(str.equals("")){mat[6][6]=0;}else
                    mat[6][6] = Integer.parseInt(str);

                str = m67.getText().toString();
                if(str.equals("")){mat[6][7]=0;}else
                    mat[6][7] = Integer.parseInt(str);

                str = m68.getText().toString();
                if(str.equals("")){mat[6][8]=0;}else
                    mat[6][8] = Integer.parseInt(str);


                str = m70.getText().toString();
                if(str.equals("")){mat[7][0]=0;}else
                {mat[7][0] = Integer.parseInt(str);}

                str = m71.getText().toString();
                if(str.equals("")){mat[7][1]=0;}else
                    mat[7][1] = Integer.parseInt(str);

                str = m72.getText().toString();
                if(str.equals("")){mat[7][2]=0;}else
                    mat[7][2] = Integer.parseInt(str);

                str = m73.getText().toString();
                if(str.equals("")){mat[7][3]=0;}else
                    mat[7][3] = Integer.parseInt(str);

                str = m74.getText().toString();
                if(str.equals("")){mat[7][4]=0;}else
                    mat[7][4] = Integer.parseInt(str);

                str = m75.getText().toString();
                if(str.equals("")){mat[7][5]=0;}else
                    mat[7][5] = Integer.parseInt(str);

                str = m76.getText().toString();
                if(str.equals("")){mat[7][6]=0;}else
                    mat[7][6] = Integer.parseInt(str);

                str = m77.getText().toString();
                if(str.equals("")){mat[7][7]=0;}else
                    mat[7][7] = Integer.parseInt(str);

                str = m78.getText().toString();
                if(str.equals("")){mat[7][8]=0;}else
                    mat[7][8] = Integer.parseInt(str);


                str = m80.getText().toString();
                if(str.equals("")){mat[8][0]=0;}else
                {mat[8][0] = Integer.parseInt(str);}

                str = m81.getText().toString();
                if(str.equals("")){mat[8][1]=0;}else
                    mat[8][1] = Integer.parseInt(str);

                str = m82.getText().toString();
                if(str.equals("")){mat[8][2]=0;}else
                    mat[8][2] = Integer.parseInt(str);

                str = m83.getText().toString();
                if(str.equals("")){mat[8][3]=0;}else
                    mat[8][3] = Integer.parseInt(str);

                str = m84.getText().toString();
                if(str.equals("")){mat[8][4]=0;}else
                    mat[8][4] = Integer.parseInt(str);

                str = m85.getText().toString();
                if(str.equals("")){mat[8][5]=0;}else
                    mat[8][5] = Integer.parseInt(str);

                str = m86.getText().toString();
                if(str.equals("")){mat[8][6]=0;}else
                    mat[8][6] = Integer.parseInt(str);

                str = m87.getText().toString();
                if(str.equals("")){mat[8][7]=0;}else
                    mat[8][7] = Integer.parseInt(str);

                str = m88.getText().toString();
                if(str.equals("")){mat[8][8]=0;}else
                    mat[8][8] = Integer.parseInt(str);


                sudokuSolver();

                m00.setText(String.valueOf(mat[0][0]));
                m01.setText(String.valueOf(mat[0][1]));
                m02.setText(String.valueOf(mat[0][2]));
                m03.setText(String.valueOf(mat[0][3]));
                m04.setText(String.valueOf(mat[0][4]));
                m05.setText(String.valueOf(mat[0][5]));
                m06.setText(String.valueOf(mat[0][6]));
                m07.setText(String.valueOf(mat[0][7]));
                m08.setText(String.valueOf(mat[0][8]));

                m10.setText(String.valueOf(mat[1][0]));
                m11.setText(String.valueOf(mat[1][1]));
                m12.setText(String.valueOf(mat[1][2]));
                m13.setText(String.valueOf(mat[1][3]));
                m14.setText(String.valueOf(mat[1][4]));
                m15.setText(String.valueOf(mat[1][5]));
                m16.setText(String.valueOf(mat[1][6]));
                m17.setText(String.valueOf(mat[1][7]));
                m18.setText(String.valueOf(mat[1][8]));

                m20.setText(String.valueOf(mat[2][0]));
                m21.setText(String.valueOf(mat[2][1]));
                m22.setText(String.valueOf(mat[2][2]));
                m23.setText(String.valueOf(mat[2][3]));
                m24.setText(String.valueOf(mat[2][4]));
                m25.setText(String.valueOf(mat[2][5]));
                m26.setText(String.valueOf(mat[2][6]));
                m27.setText(String.valueOf(mat[2][7]));
                m28.setText(String.valueOf(mat[2][8]));

                m30.setText(String.valueOf(mat[3][0]));
                m31.setText(String.valueOf(mat[3][1]));
                m32.setText(String.valueOf(mat[3][2]));
                m33.setText(String.valueOf(mat[3][3]));
                m34.setText(String.valueOf(mat[3][4]));
                m35.setText(String.valueOf(mat[3][5]));
                m36.setText(String.valueOf(mat[3][6]));
                m37.setText(String.valueOf(mat[3][7]));
                m38.setText(String.valueOf(mat[3][8]));

                m40.setText(String.valueOf(mat[4][0]));
                m41.setText(String.valueOf(mat[4][1]));
                m42.setText(String.valueOf(mat[4][2]));
                m43.setText(String.valueOf(mat[4][3]));
                m44.setText(String.valueOf(mat[4][4]));
                m45.setText(String.valueOf(mat[4][5]));
                m46.setText(String.valueOf(mat[4][6]));
                m47.setText(String.valueOf(mat[4][7]));
                m48.setText(String.valueOf(mat[4][8]));

                m50.setText(String.valueOf(mat[5][0]));
                m51.setText(String.valueOf(mat[5][1]));
                m52.setText(String.valueOf(mat[5][2]));
                m53.setText(String.valueOf(mat[5][3]));
                m54.setText(String.valueOf(mat[5][4]));
                m55.setText(String.valueOf(mat[5][5]));
                m56.setText(String.valueOf(mat[5][6]));
                m57.setText(String.valueOf(mat[5][7]));
                m58.setText(String.valueOf(mat[5][8]));

                m60.setText(String.valueOf(mat[6][0]));
                m61.setText(String.valueOf(mat[6][1]));
                m62.setText(String.valueOf(mat[6][2]));
                m63.setText(String.valueOf(mat[6][3]));
                m64.setText(String.valueOf(mat[6][4]));
                m65.setText(String.valueOf(mat[6][5]));
                m66.setText(String.valueOf(mat[6][6]));
                m67.setText(String.valueOf(mat[6][7]));
                m68.setText(String.valueOf(mat[6][8]));

                m70.setText(String.valueOf(mat[7][0]));
                m71.setText(String.valueOf(mat[7][1]));
                m72.setText(String.valueOf(mat[7][2]));
                m73.setText(String.valueOf(mat[7][3]));
                m74.setText(String.valueOf(mat[7][4]));
                m75.setText(String.valueOf(mat[7][5]));
                m76.setText(String.valueOf(mat[7][6]));
                m77.setText(String.valueOf(mat[7][7]));
                m78.setText(String.valueOf(mat[7][8]));

                m80.setText(String.valueOf(mat[8][0]));
                m81.setText(String.valueOf(mat[8][1]));
                m82.setText(String.valueOf(mat[8][2]));
                m83.setText(String.valueOf(mat[8][3]));
                m84.setText(String.valueOf(mat[8][4]));
                m85.setText(String.valueOf(mat[8][5]));
                m86.setText(String.valueOf(mat[8][6]));
                m87.setText(String.valueOf(mat[8][7]));
                m88.setText(String.valueOf(mat[8][8]));



            }
        });
    }
}
