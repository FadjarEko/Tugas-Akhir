if (sensorValue<sensorValue1 && climbhill==1){
climbhill=0;	
VmaxD=sensorValue1;
VeffD=VmaxD/sqrt(2);
Veff=(((VeffD-420.76)/-90.24)*-210.2)+210.2;
Serial.println(Veff);}
Kodingan diatas berisikan tentang rumus Ampere
