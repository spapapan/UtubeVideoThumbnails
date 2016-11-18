# UtubeVideoThumbnails


Given a youtube video url returns a set of 4 image urls.

    String url = "www.youtube.com/...";
    UtubeThumbs imgurls = new UtubeThumbs(url);
    String geturls[] = imgurls.imgURLS;

geturls[0] is the url path of a JPEG Image, 480 × 360 pixels. This is the main thumbnail youtube uses for the video.
The other three are 120×90 pixels and are taken automatically by YouTube from three certain points in the video.

Supports all available youtube url formats, example: m.youtube.com/ , https://youtu.be/ 
