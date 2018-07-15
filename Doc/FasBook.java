package Doc;

public class FasBook {
    Doc1 d1;
    Doc2 d2;
    Doc3 d3;
    Doc4 d4;
    Doc5 d5;
    Doc6 d6;
    Doc7 d7;
    Doc8 d8;
    Doc9 d9;
    Doc10 d10;
    public void bookdoc(int option)
    {
        if(option==1){
            d1=new Doc1();
            d1.book();}
        else if(option==2){
            d2=new Doc2();
            d2.book();}
        else if(option==3){
        d3=new Doc3();
            d3.book();}
        else if(option==4){
        d4=new Doc4();
            d4.book();}
        else if(option==5){
        d5=new Doc5();
            d5.book();}
        else if(option==6){
        d6=new Doc6();
            d6.book();}
        else if(option==7){
        d7=new Doc7();
            d7.book();}
        else if(option==8){
        d8=new Doc8();
            d8.book();}
        else if(option==9){
        d9=new Doc9();
            d9.book();}
        else if(option==10){
        d10=new Doc10();
            d10.book();}

    }

}
