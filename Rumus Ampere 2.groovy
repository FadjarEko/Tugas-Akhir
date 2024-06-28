int maxValue = 0; // store max value here
int minValue = 1024; // store min value here
uint32_t start_time = millis();	
while((millis()-start_time) < 1000) {
readValue = analogRead(sensorIn);			
if (readValue > maxValue) {
maxValue = readValue;}
if (readValue < minValue)  { 
      minValue = readValue; }
  }
result = ((maxValue - minValue) * 5.0)/1024.0; 
return result;
}
Kodingan diatas berisikan tentang rumus Ampere
