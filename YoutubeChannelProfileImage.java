public class YoutubeChannelProfileImage {
  
    public final static String YOUTUBE_PROFILE_IMAGE_START_URL = "yt3.ggpht.com/ytc/";
    public final static String YOUTUBE_PROFILE_IMAGE_END_URL = "-c-k-c0x00ffffff-no-rj";
 
    public static void getYoutubeChannelProfileImage(String channelUrl) throws IOException
    {
        Document document = Jsoup.connect(channelUrl).userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:40.0) Gecko/20100101 Firefox/40.1").get();
    
        String html = document.toString();
        Pattern pattern = Pattern.compile(YOUTUBE_PROFILE_IMAGE_START_URL + "(.*?)" + YOUTUBE_PROFILE_IMAGE_END_URL, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(html); 
        while (matcher.find()) { 
            String imgUrl = matcher.group(1); 
            if (imgUrl.length()<500) 
                System.out.println("https://" + YOUTUBE_PROFILE_IMAGE_START_URL+imgUrl+YOUTUBE_PROFILE_IMAGE_END_URL); 
        }  
    }
 
}
