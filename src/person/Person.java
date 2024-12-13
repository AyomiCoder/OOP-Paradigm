package person;

public class Person {
		private String name;
		private int age;
		private double height;
		private String eyeColor;
		
		Person(){
			age = 1;
		}
		
		public void shout() {
			System.out.println(name + " " + "Sing!");
		}
		
		public String getName() {
			return name;
		}
		
		public double getHeight() {
			return height;
		}
		
		public int getAge() {
			return age;
		}
		
		public String getEyeColor() {
			return eyeColor;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		public void setEyeColor(String eyeColor) {
			this.eyeColor = eyeColor;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public void setName(String name) {
			this.name = name;
		}
}
