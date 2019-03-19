public  class CarElementVisitor {
	
     void visitBody(Body element){
	     element.getBody();
     }
		 
     void visitEngine(Engine element){
	     element.getEngine();
     }
     
     void visitWheel(Wheel element){
	     element.getWheel();
     }
     
     void visitCar(Car element){
	     element.getCar();
     }

     void tranverse(){}
	
}
