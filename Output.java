Serial.println(AmpsRMS);
lcd.setCursor(0,0);
lcd.print("Ampere = ");
lcd.print(AmpsRMS);
lcd.setCursor(0,1);
lcd.print("Volt = ");
lcd.print(Veff);
watt = Veff*AmpsRMS;
lcd.setCursor(0,2); 
lcd.print("Watt = ");
lcd.print(watt);
pemakaian =  0+watt;
 lcd.setCursor(0,3);
 lcd.print("Pemakaian ");
  lcd.print(pemakaian);
  delay(1000);}
Float getVPP(){
Float result;
Int readValue;//value read from the sensor
Kodingan diatas untuk menginstruksikan LCD20x4 untuk menampilkan outputan
