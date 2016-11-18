# UtubeVideoThumbnails


Given a youtube video url returns a set of 4 image urls.

    String url = "https://www.youtube.com/watch?v=0r6C3z3TEKw";
    UtubeThumbs imgurls = new UtubeThumbs(url);
    String geturls[] = imgurls.imgURLS;

geturls[0] is the url path of a JPEG Image, 480 × 360 pixels. This is the main thumbnail youtube uses for the video.
The other three are very small (120×90) and are taken automatically by YouTube from three certain points in the video.
