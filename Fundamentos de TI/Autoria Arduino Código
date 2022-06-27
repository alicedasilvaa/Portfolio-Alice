int led=10;        
int botao=12;    
int var=0;        
int var2=0;      
int estado=0;     
void setup()
{
  pinMode(led,OUTPUT);
  pinMode(botao,INPUT);
}

void loop()
{
  // Ler o valor enviado pelo botão: "HIGH" ou "LOW"
  var=digitalRead(botao);
   if ((var == HIGH) && (var2 == LOW)) {
     estado = 1 - estado;
     delay(20);
   }
 
  var2=var;
 
  if (estado == 1) {
     digitalWrite(led, HIGH); 
   }
   else {
     digitalWrite(led, LOW);
     }
}
