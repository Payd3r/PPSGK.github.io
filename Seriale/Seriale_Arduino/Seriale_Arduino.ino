#include <LiquidCrystal.h>
#define ptz A0
#define btn 7
// initialize the library with the numbers of the interface pins
LiquidCrystal lcd(12, 11, 5, 4, 3, 2);
char stopread=' ';
String vettore[100];
String s="";
int numel=0;

void setup() {
  lcd.begin(16, 2);
  Serial.begin(9600);
  pinMode(ptz,INPUT);
  pinMode(btn,INPUT);  
  for(int i=0;i<100;i++){
  vettore[i]="";
  }    
}
void loop() {

  if(stopread==' '){
   s=leggiFinoA(';');
    if(s!="."){
     vettore[numel]=s;
     numel++;
    }
  } 
  
  if(stopread=='.')
  {
    int pot=analogRead(ptz);    
  	int nuovoval=1024/numel;    
    int pos=pot/nuovoval;

    delay(500);
    lcd.clear();
    lcd.setCursor(0,0);
	lcd.print(vettore[pos]); 
    if(digitalRead(btn)==HIGH){
    Serial.println(vettore[pos]);
    }
  } 
  
  
}
String leggiFinoA(char terminatore)
{
  String visualizza="";
  while(true)
  {
  if(Serial.available()>0)
  {
   char c=Serial.read();
    if(c==terminatore){
      return visualizza;
    }
    else if(c=='.'){
      stopread=c;
      return ".";
    }
    else{
    visualizza+=c;
    }
  } 

  }
}

 