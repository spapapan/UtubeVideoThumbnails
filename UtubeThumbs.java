import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtubeThumbs {
	
    final static String utubeRegex = "^(https?)?(://)?(www.)?(m.)?((youtube.com)|(youtu.be))/";
    final static String[] IDRegex = { "\\?vi?=([^&]*)","watch\\?.*v=([^&]*)", "(?:embed|vi?)/([^/?]*)", "^([A-Za-z0-9\\-]*)"};
    private static String ID;
    public static String imgURLS[] = new String[4];


	public UtubeThumbs(String url) {
		
		ID = getVideoID(url);
		
		if (ID != null){
			for (int i=0; i<4; i++){
				imgURLS[i] = "http://img.youtube.com/vi/"+ ID +"/"+ i +".jpg";
			}
			
			this.imgURLS = imgURLS;
		}
		
		
  
	}
	
	private static String getVideoID(String  url){

	  String filterURL = getFilterURL(url);

	  for(String regex : IDRegex) {
		 Pattern compiledPattern = Pattern.compile(regex);
		 Matcher matcher = compiledPattern.matcher(filterURL);

		    if(matcher.find()){
		        return matcher.group(1);
		    }
	  }
	  
	return null;
	}
	

    private static String getFilterURL(String url) {
		 
      Pattern compiledPattern = Pattern.compile(utubeRegex);
      Matcher matcher = compiledPattern.matcher(url);

		 if(matcher.find()){
		     return url.replace(matcher.group(), "");
		 }
		 
	 return url;
     }



}
