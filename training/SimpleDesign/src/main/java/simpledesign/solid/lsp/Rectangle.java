package simpledesign.solid.lsp;

public class Rectangle {
   private long width;
   private long height;

   public long calculateArea() {
      return width*height;
   }

   public long getWidth() {
      return width;
   }

   public void setWidth(long width) {
      this.width = width;
   }

   public long getHeight() {
      return height;
   }

   public void setHeight(long height) {
      this.height = height;
   }
}
