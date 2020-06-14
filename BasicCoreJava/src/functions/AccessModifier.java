package functions;

public class AccessModifier {

	public static void main(String[] args) {
		AccessModifier obj= new AccessModifier();
		
		obj.publicFunction();
		obj.protectedfunction();
		obj.privatfunction();
		obj.noAccessModFunction();
		
		// TODO Auto-generated method stub
	}
		
		public void publicFunction()
		{
			System.out.println("public function");
		}
		
		protected void protectedfunction()
		{
			System.out.println("protected function");
		}
		
		private void privatfunction()
		{
			System.out.println("private function");
		}
		
		void noAccessModFunction()
		{
			System.out.println("no access modifiers function");
		}

	}


