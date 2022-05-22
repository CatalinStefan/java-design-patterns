package factorymethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class ShapeFactoryTest {
  ShapeFactory factory = new ShapeFactory();
  Shape roundFood = factory.getFood("Round");
  Shape cylinderFood = factory.getFood("Cylinder");
  
  @Test
  void factoryMethodTest() {
    assertEquals("Round", roundFood.getShape());
    assertEquals("Cylinder", cylinderFood.getShape());
  }
}
