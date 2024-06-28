void setup() {	
Serial.begin(9600);
lcd.begin(20,4);}
void loop() {
Voltage = getVPP();	
VRMS = (Voltage/2.0) *0.707;
 AmpsRMS = (VRMS * 1000)/mVperAmp;	
sensorValue1=sensorValue;
sensorValue = analogRead(A0);
if (sensorValue>sensorValue1 && sensorValue>511){
climbhill=1;	
VmaxD=sensorValue;}
Kodingan diatas berisikan tentang rumus Voltage dan akan masuk melalui port A0 oada Arduino UNO