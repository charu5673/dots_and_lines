package com.example.dots_and_lines;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv11,tv12,tv13,tv14,tv15,tv16,tv17,tv18,tv19,tv21,tv22,tv23,tv24,tv25,tv26,tv27,tv28,tv29,tv31,tv32,tv33,tv34,tv35,tv36,tv37,tv38,tv39,tv41,tv42,tv43,tv44,tv45,tv46,tv47,tv48,tv49,tv51,tv52,tv53,tv54,tv55,tv56,tv57,tv58,tv59,tv61,tv62,tv63,tv64,tv65,tv66,tv67,tv68,tv69,tv71,tv72,tv73,tv74,tv75,tv76,tv77,tv78,tv79,tv81,tv82,tv83,tv84,tv85,tv86,tv87,tv88,tv89,tv91,tv92,tv93,tv94,tv95,tv96,tv97,tv98,tv99,sc1,sc2,dis;
    Button lh11,lh12,lh13,lh14,lh15,lh16,lh17,lh18,lh19,lh21,lh22,lh23,lh24,lh25,lh26,lh27,lh28,lh29,lh31,lh32,lh33,lh34,lh35,lh36,lh37,lh38,lh39,lh41,lh42,lh43,lh44,lh45,lh46,lh47,lh48,lh49,lh51,lh52,lh53,lh54,lh55,lh56,lh57,lh58,lh59,lh61,lh62,lh63,lh64,lh65,lh66,lh67,lh68,lh69,lh71,lh72,lh73,lh74,lh75,lh76,lh77,lh78,lh79,lh81,lh82,lh83,lh84,lh85,lh86,lh87,lh88,lh89,lh91,lh92,lh93,lh94,lh95,lh96,lh97,lh98,lh99,lh01,lh02,lh03,lh04,lh05,lh06,lh07,lh08,lh09;
    Button lv11,lv12,lv13,lv14,lv15,lv16,lv17,lv18,lv19,lv10,lv21,lv22,lv23,lv24,lv25,lv26,lv27,lv28,lv29,lv20,lv31,lv32,lv33,lv34,lv35,lv36,lv37,lv38,lv39,lv30,lv41,lv42,lv43,lv44,lv45,lv46,lv47,lv48,lv49,lv40,lv51,lv52,lv53,lv54,lv55,lv56,lv57,lv58,lv59,lv50,lv61,lv62,lv63,lv64,lv65,lv66,lv67,lv68,lv69,lv60,lv71,lv72,lv73,lv74,lv75,lv76,lv77,lv78,lv79,lv70,lv81,lv82,lv83,lv84,lv85,lv86,lv87,lv88,lv89,lv80,lv91,lv92,lv93,lv94,lv95,lv96,lv97,lv98,lv99,lv90;
    int s1=0,s2=0,w=0,t=0;
    int arv[][]=new int[10][10];
    int arh[][]=new int[10][10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reseta();
        assignbId(lh11,R.id.lh11);
        assignbId(lh12,R.id.lh12);
        assignbId(lh13,R.id.lh13);
        assignbId(lh14,R.id.lh14);
        assignbId(lh15,R.id.lh15);
        assignbId(lh16,R.id.lh16);
        assignbId(lh17,R.id.lh17);
        assignbId(lh18,R.id.lh18);
        assignbId(lh19,R.id.lh19);
        assignbId(lh21,R.id.lh21);
        assignbId(lh22,R.id.lh22);
        assignbId(lh23,R.id.lh23);
        assignbId(lh24,R.id.lh24);
        assignbId(lh25,R.id.lh25);
        assignbId(lh26,R.id.lh26);
        assignbId(lh27,R.id.lh27);
        assignbId(lh28,R.id.lh28);
        assignbId(lh29,R.id.lh29);
        assignbId(lh31,R.id.lh31);
        assignbId(lh32,R.id.lh32);
        assignbId(lh33,R.id.lh33);
        assignbId(lh34,R.id.lh34);
        assignbId(lh35,R.id.lh35);
        assignbId(lh36,R.id.lh36);
        assignbId(lh37,R.id.lh37);
        assignbId(lh38,R.id.lh38);
        assignbId(lh39,R.id.lh39);
        assignbId(lh41,R.id.lh41);
        assignbId(lh42,R.id.lh42);
        assignbId(lh43,R.id.lh43);
        assignbId(lh44,R.id.lh44);
        assignbId(lh45,R.id.lh45);
        assignbId(lh46,R.id.lh46);
        assignbId(lh47,R.id.lh47);
        assignbId(lh48,R.id.lh48);
        assignbId(lh49,R.id.lh49);
        assignbId(lh51,R.id.lh51);
        assignbId(lh52,R.id.lh52);
        assignbId(lh53,R.id.lh53);
        assignbId(lh54,R.id.lh54);
        assignbId(lh55,R.id.lh55);
        assignbId(lh56,R.id.lh56);
        assignbId(lh57,R.id.lh57);
        assignbId(lh58,R.id.lh58);
        assignbId(lh59,R.id.lh59);
        assignbId(lh61,R.id.lh61);
        assignbId(lh62,R.id.lh62);
        assignbId(lh63,R.id.lh63);
        assignbId(lh64,R.id.lh64);
        assignbId(lh65,R.id.lh65);
        assignbId(lh66,R.id.lh66);
        assignbId(lh67,R.id.lh67);
        assignbId(lh68,R.id.lh68);
        assignbId(lh69,R.id.lh69);
        assignbId(lh71,R.id.lh71);
        assignbId(lh72,R.id.lh72);
        assignbId(lh73,R.id.lh73);
        assignbId(lh74,R.id.lh74);
        assignbId(lh75,R.id.lh75);
        assignbId(lh76,R.id.lh76);
        assignbId(lh77,R.id.lh77);
        assignbId(lh78,R.id.lh78);
        assignbId(lh79,R.id.lh79);
        assignbId(lh81,R.id.lh81);
        assignbId(lh82,R.id.lh82);
        assignbId(lh83,R.id.lh83);
        assignbId(lh84,R.id.lh84);
        assignbId(lh85,R.id.lh85);
        assignbId(lh86,R.id.lh86);
        assignbId(lh87,R.id.lh87);
        assignbId(lh88,R.id.lh88);
        assignbId(lh89,R.id.lh89);
        assignbId(lh91,R.id.lh91);
        assignbId(lh92,R.id.lh92);
        assignbId(lh93,R.id.lh93);
        assignbId(lh94,R.id.lh94);
        assignbId(lh95,R.id.lh95);
        assignbId(lh96,R.id.lh96);
        assignbId(lh97,R.id.lh97);
        assignbId(lh98,R.id.lh98);
        assignbId(lh99,R.id.lh99);
        assignbId(lh01,R.id.lh01);
        assignbId(lh02,R.id.lh02);
        assignbId(lh03,R.id.lh03);
        assignbId(lh04,R.id.lh04);
        assignbId(lh05,R.id.lh05);
        assignbId(lh06,R.id.lh06);
        assignbId(lh07,R.id.lh07);
        assignbId(lh08,R.id.lh08);
        assignbId(lh09,R.id.lh09);
        assignbId(lv10,R.id.lv10);
        assignbId(lv11,R.id.lv11);
        assignbId(lv12,R.id.lv12);
        assignbId(lv13,R.id.lv13);
        assignbId(lv14,R.id.lv14);
        assignbId(lv15,R.id.lv15);
        assignbId(lv16,R.id.lv16);
        assignbId(lv17,R.id.lv17);
        assignbId(lv18,R.id.lv18);
        assignbId(lv19,R.id.lv19);
        assignbId(lv20,R.id.lv20);
        assignbId(lv21,R.id.lv21);
        assignbId(lv22,R.id.lv22);
        assignbId(lv23,R.id.lv23);
        assignbId(lv24,R.id.lv24);
        assignbId(lv25,R.id.lv25);
        assignbId(lv26,R.id.lv26);
        assignbId(lv27,R.id.lv27);
        assignbId(lv28,R.id.lv28);
        assignbId(lv29,R.id.lv29);
        assignbId(lv30,R.id.lv30);
        assignbId(lv31,R.id.lv31);
        assignbId(lv32,R.id.lv32);
        assignbId(lv33,R.id.lv33);
        assignbId(lv34,R.id.lv34);
        assignbId(lv35,R.id.lv35);
        assignbId(lv36,R.id.lv36);
        assignbId(lv37,R.id.lv37);
        assignbId(lv38,R.id.lv38);
        assignbId(lv39,R.id.lv39);
        assignbId(lv40,R.id.lv40);
        assignbId(lv41,R.id.lv41);
        assignbId(lv42,R.id.lv42);
        assignbId(lv43,R.id.lv43);
        assignbId(lv44,R.id.lv44);
        assignbId(lv45,R.id.lv45);
        assignbId(lv46,R.id.lv46);
        assignbId(lv47,R.id.lv47);
        assignbId(lv48,R.id.lv48);
        assignbId(lv49,R.id.lv49);
        assignbId(lv50,R.id.lv50);
        assignbId(lv51,R.id.lv51);
        assignbId(lv52,R.id.lv52);
        assignbId(lv53,R.id.lv53);
        assignbId(lv54,R.id.lv54);
        assignbId(lv55,R.id.lv55);
        assignbId(lv56,R.id.lv56);
        assignbId(lv57,R.id.lv57);
        assignbId(lv58,R.id.lv58);
        assignbId(lv59,R.id.lv59);
        assignbId(lv60,R.id.lv60);
        assignbId(lv61,R.id.lv61);
        assignbId(lv62,R.id.lv62);
        assignbId(lv63,R.id.lv63);
        assignbId(lv64,R.id.lv64);
        assignbId(lv65,R.id.lv65);
        assignbId(lv66,R.id.lv66);
        assignbId(lv67,R.id.lv67);
        assignbId(lv68,R.id.lv68);
        assignbId(lv69,R.id.lv69);
        assignbId(lv70,R.id.lv70);
        assignbId(lv71,R.id.lv71);
        assignbId(lv72,R.id.lv72);
        assignbId(lv73,R.id.lv73);
        assignbId(lv74,R.id.lv74);
        assignbId(lv75,R.id.lv75);
        assignbId(lv76,R.id.lv76);
        assignbId(lv77,R.id.lv77);
        assignbId(lv78,R.id.lv78);
        assignbId(lv79,R.id.lv79);
        assignbId(lv80,R.id.lv80);
        assignbId(lv81,R.id.lv81);
        assignbId(lv82,R.id.lv82);
        assignbId(lv83,R.id.lv83);
        assignbId(lv84,R.id.lv84);
        assignbId(lv85,R.id.lv85);
        assignbId(lv86,R.id.lv86);
        assignbId(lv87,R.id.lv87);
        assignbId(lv88,R.id.lv88);
        assignbId(lv89,R.id.lv89);
        assignbId(lv90,R.id.lv90);
        assignbId(lv91,R.id.lv91);
        assignbId(lv92,R.id.lv92);
        assignbId(lv93,R.id.lv93);
        assignbId(lv94,R.id.lv94);
        assignbId(lv95,R.id.lv95);
        assignbId(lv96,R.id.lv96);
        assignbId(lv97,R.id.lv97);
        assignbId(lv98,R.id.lv98);
        assignbId(lv99,R.id.lv99);
        tv11=findViewById(R.id.tv11);
        tv21=findViewById(R.id.tv21);
        tv31=findViewById(R.id.tv31);
        tv41=findViewById(R.id.tv41);
        tv51=findViewById(R.id.tv51);
        tv61=findViewById(R.id.tv61);
        tv71=findViewById(R.id.tv71);
        tv81=findViewById(R.id.tv81);
        tv91=findViewById(R.id.tv91);
        tv12=findViewById(R.id.tv12);
        tv22=findViewById(R.id.tv22);
        tv32=findViewById(R.id.tv32);
        tv42=findViewById(R.id.tv42);
        tv52=findViewById(R.id.tv52);
        tv62=findViewById(R.id.tv62);
        tv72=findViewById(R.id.tv72);
        tv82=findViewById(R.id.tv82);
        tv92=findViewById(R.id.tv92);
        tv13=findViewById(R.id.tv13);
        tv23=findViewById(R.id.tv23);
        tv33=findViewById(R.id.tv33);
        tv43=findViewById(R.id.tv43);
        tv53=findViewById(R.id.tv53);
        tv63=findViewById(R.id.tv63);
        tv73=findViewById(R.id.tv73);
        tv83=findViewById(R.id.tv83);
        tv93=findViewById(R.id.tv93);
        tv14=findViewById(R.id.tv14);
        tv24=findViewById(R.id.tv24);
        tv34=findViewById(R.id.tv34);
        tv44=findViewById(R.id.tv44);
        tv54=findViewById(R.id.tv54);
        tv64=findViewById(R.id.tv64);
        tv74=findViewById(R.id.tv74);
        tv84=findViewById(R.id.tv84);
        tv94=findViewById(R.id.tv94);
        tv15=findViewById(R.id.tv15);
        tv25=findViewById(R.id.tv25);
        tv35=findViewById(R.id.tv35);
        tv45=findViewById(R.id.tv45);
        tv55=findViewById(R.id.tv55);
        tv65=findViewById(R.id.tv65);
        tv75=findViewById(R.id.tv75);
        tv85=findViewById(R.id.tv85);
        tv95=findViewById(R.id.tv95);
        tv16=findViewById(R.id.tv16);
        tv26=findViewById(R.id.tv26);
        tv36=findViewById(R.id.tv36);
        tv46=findViewById(R.id.tv46);
        tv56=findViewById(R.id.tv56);
        tv66=findViewById(R.id.tv66);
        tv76=findViewById(R.id.tv76);
        tv86=findViewById(R.id.tv86);
        tv96=findViewById(R.id.tv96);
        tv17=findViewById(R.id.tv17);
        tv27=findViewById(R.id.tv27);
        tv37=findViewById(R.id.tv37);
        tv47=findViewById(R.id.tv47);
        tv57=findViewById(R.id.tv57);
        tv67=findViewById(R.id.tv67);
        tv77=findViewById(R.id.tv77);
        tv87=findViewById(R.id.tv87);
        tv97=findViewById(R.id.tv97);
        tv18=findViewById(R.id.tv18);
        tv28=findViewById(R.id.tv28);
        tv38=findViewById(R.id.tv38);
        tv48=findViewById(R.id.tv48);
        tv58=findViewById(R.id.tv58);
        tv68=findViewById(R.id.tv68);
        tv78=findViewById(R.id.tv78);
        tv88=findViewById(R.id.tv88);
        tv98=findViewById(R.id.tv98);
        tv19=findViewById(R.id.tv19);
        tv29=findViewById(R.id.tv29);
        tv39=findViewById(R.id.tv39);
        tv49=findViewById(R.id.tv49);
        tv59=findViewById(R.id.tv59);
        tv69=findViewById(R.id.tv69);
        tv79=findViewById(R.id.tv79);
        tv89=findViewById(R.id.tv89);
        tv99=findViewById(R.id.tv99);
        sc1=findViewById(R.id.sc1);
        sc2=findViewById(R.id.sc2);
        dis=findViewById(R.id.dis);
        sc1.setTextColor(getColor(R.color.teal_700));
        sc1.setText("\n Player 1:\n\n"+s1);
        sc2.setText("\n Player 2:\n\n"+s2);
    }

    private void reseta() {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(i!=9)
                    arv[i][j]=0;
                if(j!=9)
                    arh[i][j]=0;
            }
        }
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        Button button = (Button)v;
        String text = button.getText().toString();
        int flag=0;
        if(w==2)
        {
            sc1.setTextColor(getColor(R.color.teal_700));
            sc2.setTextColor(getColor(R.color.black));
            reseta();
            resetlh();
            resetlv();
            resettv();
            w=0;
            t=1;
            dis.setText("");
            sc1.setText("\n Player 1:\n\n");
            sc2.setText("\n Player 2:\n\n");
        }
        else {
            int x=0;
            View tmp=findViewById(getId(text));
            tmp.setBackgroundColor(getColor(R.color.black));
            if(text.charAt(1)=='v')
            {
                if(arv[Integer.parseInt(text.substring(2,3))][Integer.parseInt(text.substring(3))]!=1) {
                    arv[Integer.parseInt(text.substring(2,3))][Integer.parseInt(text.substring(3))] = 1;
                    x=check(text, 1);
                }
                else if(arv[Integer.parseInt(text.substring(2,3))][Integer.parseInt(text.substring(3))]==1)
                    flag=1;
            }
            else
            {
                if(arh[Integer.parseInt(text.substring(2,3))][Integer.parseInt(text.substring(3))]!=1) {
                    arh[Integer.parseInt(text.substring(2,3))][Integer.parseInt(text.substring(3))]=1;
                    x=check(text, 0);
                }
                else if(arh[Integer.parseInt(text.substring(2,3))][Integer.parseInt(text.substring(3))]==1)
                    flag=1;
            }
            if(flag==0)
            {
            if(x==1)
                x=0;
            else {
                if (t == 2)
                    t = 1;
                else
                    t = 2;
            }
            }
            if(s1+s2==81)
                {
                    if(s1>s2)
                    {
                        sc1.setText(sc1.getText()+"\nPlayer 1 Wins!");
                        dis.setText("\n\n\nClick on any line to reset the game.");
                    }
                    else if(s2>s1)
                    {
                        sc2.setText(sc2.getText()+"\nPlayer 2 Wins!");
                        dis.setText("\n\n\nClick on any line to reset the game.");
                    }
                    else
                    {
                        dis.setText("\n\n\nTie!\nClick on any line to reset the game.");
                    }
                    s1=0;
                    s2=0;
                    t=0;
                    w=2;
                }
        }
        if(t==1) {
            sc1.setTextColor(getColor(R.color.teal_700));
            sc2.setTextColor(getColor(R.color.black));
        }
        else {
            sc2.setTextColor(getColor(R.color.teal_700));
            sc1.setTextColor(getColor(R.color.black));
        }
    }

    private int check(String text,int i) {
        text=text.substring(2);
        int x,y,z,q=0;
        int i1,j1,i2,j2,tmpj,tmpi;
        i1=Integer.parseInt(text.substring(0,1));
        j1=Integer.parseInt(text.substring(1));
        i2=((text.charAt(0)=='9')?0:i1+1);
        j2=((text.charAt(1)=='9')?0:j1+1);
        String s="tv"+text.charAt(0)+text.charAt(1);
        tmpj=(Integer.parseInt(text.substring(1)))-1;
        tmpi=(Integer.parseInt(text.substring(0,1)))-1;
        if(i==1)
        {
            if(text.charAt(1)=='0')
            {
                x=arh[i1][9];
                y=arh[i2][9];
                z=arv[i1][9];
                if(x==1&&y==1&&z==1)
                {
                    q=1;
                    setup("tv"+text.charAt(0)+"9");
                }
            }
            else if(text.charAt(1)=='1')
            {
                x=arh[i1][1];
                y=arh[i2][1];
                z=arv[i1][2];
                if(x==1&&y==1&&z==1)
                {
                    q=1;
                    setup(s);
                }
            }
            else {
                x=arh[i1][j1];
                y=arh[i2][j1];
                z=arv[i1][j2];
                if(x==1&&y==1&&z==1)
                {
                    q=1;
                    setup(s);
                }
                x=arh[i1][j1-1];
                y=arh[i2][j1-1];
                z=arv[i1][j1-1];
                if(x==1&&y==1&&z==1)
                {
                    q=1;
                    setup("tv"+text.charAt(0)+tmpj);
                }
            }
        }
        else {
            if(text.charAt(0)=='0')
            {
                x=arv[9][j1];
                y=arv[9][j2];
                z=arh[9][j1];
                if(x==1&&y==1&&z==1)
                {
                    q=1;
                    setup("tv"+"9"+text.charAt(1));
                }
            }
            else if(text.charAt(0)=='1')
            {
                x=arv[1][j1];
                y=arv[1][j2];
                z=arh[2][j1];
                if(x==1&&y==1&&z==1)
                {
                    q=1;
                    setup(s);
                }
            }
            else {
                x=arv[i1][j1];
                y=arv[i1][j2];
                z=arh[i2][j1];
                if(x==1&&y==1&&z==1)
                {
                    q=1;
                    setup(s);
                }
                x=arv[(i1)-1][j1];
                y=arv[(i1)-1][j2];
                z=arh[(i1)-1][j1];
                if(x==1&&y==1&&z==1)
                {
                    q=1;
                    setup("tv"+tmpi+text.charAt(1));
                }
            }

        }
        return(q);
    }

    private void setup(String text) {
        TextView tv;
        tv=findViewById(getId(text));
        tv.setText(String.valueOf(t));
        if(t==1)
            s1++;
        else
            s2++;
        sc1.setText("\n Player 1:\n\n"+s1);
        sc2.setText("\n Player 2:\n\n"+s2);
    }

    private void resettv() {
        TextView tmp;
        int i=0,j=0;
        for(i=1;i<=9;i++)
        {
            for(j=1;j<=9;j++)
            {
                tmp=findViewById(getId("tv"+i+j));
                tmp.setText("");
            }
        }
    }

    private void resetlv() {
        View tmp;
        int i=0,j=0;
        for(i=1;i<=9;i++)
        {
            for(j=0;j<=9;j++)
            {
                tmp=findViewById(getId("lv"+i+j));
                tmp.setBackgroundColor(getColor(R.color.DADADA));
            }
        }
    }

    private void resetlh() {
        View tmp;
        int i=0,j=0;
        for(i=0;i<=9;i++)
        {
            for(j=1;j<=9;j++)
            {
                tmp=findViewById(getId("lh"+i+j));
                tmp.setBackgroundColor(getColor(R.color.DADADA));
            }
        }
    }

    void assignbId(Button btn, int id) {
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }
    int getId(String str)
    {
        str="R.id."+str;
        return(getResources().getIdentifier(str.replace("R.id.", ""), "id", getPackageName()));
    }
}