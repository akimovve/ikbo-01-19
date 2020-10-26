package ru.mirea.lab16.enums;

public enum DrinkType {
	BEER("alcohol"),
	WINE("alcohol"),
	VODKA("alcohol"),
	BRANDY("alcohol"),
	CHAMPAGNE("alcohol"),
	WHISKEY("alcohol"),
	TEQUILA("alcohol"),
	RUM("alcohol"),
	VERMUTH("alcohol"),
	LIQUOR("alcohol"),
	JAGERMEISTER("alcohol"),
	JUICE("alcohol"),
	COFFEE("non-alcohol"),
	GREEN_TEA("non-alcohol"),
	BLACK_TEA("non-alcohol"),
	MILK("non-alcohol"),
	WATER("non-alcohol"),
	SODA("non-alcohol");

	private final String obj;

	DrinkType(String obj) {
		this.obj = obj;
	}

	public boolean isAlcohol() {
		return obj.equals("alcohol");
	}
}
