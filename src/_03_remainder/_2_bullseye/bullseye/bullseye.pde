
void setup() {
 size(1000,1000);
  // set the size of your sketch
  
}

void draw() {
  int size = 625;
  
  for (int i = 0; i <= 5; i+=1) {
   if (size % 2 == 0){
    fill(#FFFFFF);
  }
  else{
   fill(#E71D36); 
  }
  ellipse(500,500,size,size);
  size -= 125;
  }
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
 
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
