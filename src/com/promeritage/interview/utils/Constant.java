package com.promeritage.interview.utils;

public class Constant {
	
	/*
	 *  
	 */
	
	public final static String IV = ShareTool.getProperty("aes.iv");
	public final static String KEY = ShareTool.getProperty("aes.key");
	public final static String IMG_ROOT = ShareTool.getProperty("img.root");
	
	/*
	 * Api URI
	 */
	
	public final static String USER_API = ShareTool.getProperty("domain") + "/MB_MAIN_SYSTEM/api/user";
	
	/*
	 * Jsp path
	 */
	
	public final static String SYSTEM_INDEX = "mainSystem/index";
	public final static String SYSTEM_VERIFY = "mainSystem/account-verify";
	public final static String SYSTEM_TRYON = "mainSystem/account-tryon";
	public final static String SYSTEM_EFFECTIVE = "mainSystem/account-effective";
	public final static String SYSTEM_INVALID = "mainSystem/account-invalid";
	public final static String SYSTEM_FAIL = "mainSystem/account-fail";
	public final static String SYSTEM_AGENT_GENERAL = "mainSystem/agent-general";
	public final static String SYSTEM_AGENT_AGENTS = "mainSystem/agent-agents";
	public final static String SYSTEM_AGENT_STORE = "mainSystem/agent-store";
	
	/*
	 * 系統狀態
	 */
	
	public enum Status { 
		ENGLISH("English", "英文"),
		CHINESE("Chinese", "中文"),
		JAPANESE("Japanese", "日文");
		
		private String code;
		private String message;
		
		private Status(String message) {
			this.message = message;
		}
		
		private Status(String code, String message) {
			this.code = code;
			this.message = message;
		}
		
		/*
		 * setter getter
		 */
		
		public String getMessage() {
			return message;
		}

		public String getCode() {
			return code;
		}
	}
}
