package Card; /**
 *    // Class Card
 */

/**
 * @author Pranav
 *
 */
public class Card {
	
		String type;
		String Color;
		String Symbol;
		String Shade;
		int Number;


	public Card (String details)
	{
		String[] splited = details.split("\\s+");
		setColor(splited[0]);
		this.type=splited[1];
		setSymbol(type);
		setShade(type);
		setNumber(type);
	}
		private void setColor(String color)
		{
			this.Color = color;
		}
		
		private void setSymbol(String symbol){
			char c = symbol.charAt(0);
			if(c=='a' || c=='@' || c=='A')
				this.Symbol="A";
			else if(c=='s' || c=='$' || c=='S')
				this.Symbol="S";
			else
				this.Symbol="H";
		}
		
		private void setShade(String symbol){
			if(Character.isUpperCase(symbol.charAt(0)))
				this.Shade= "UC";
			else if(Character.isLowerCase(symbol.charAt(0)))
				this.Shade= "LC";
			else
				this.Shade= "SC";
		}

		private void setNumber(String symbol){
			this.Number = symbol.length();
		}

	public String toString()
	{
		return this.Color + " " + this.type;
	}

	
		

	

	/*//------------Test Code-------------//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Card c= new Card("yellow AA");
		System.out.println(c.Color +" "+ c.Shade +" "+ c.Symbol +" "+ c.Number);
	
	}*/
	//------------Test Code-------------//

}
