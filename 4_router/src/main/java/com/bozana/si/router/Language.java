package com.bozana.si.router;

public enum Language {
		ENGLISH("ENGLISH"),
		GERMAN("GERMAN"),
		SERBIAN("SERBIAN");
		
		private String value;
		
		Language(String value){
			this.value = value;
		}
		public String value(){
			return value;
		}
}
