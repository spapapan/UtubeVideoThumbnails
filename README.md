# UtubeVideoThumbnails


<b>UtubeThumbs.java:</b> Given a Υoutube video url returns a set of 4 image urls.

    String url = "www.youtube.com/...";
    UtubeThumbs imgurls = new UtubeThumbs(url);
    String geturls[] = imgurls.imgURLS;

geturls[0] is the url path of a JPEG Image, 480 × 360 pixels. This is the main thumbnail Υoutube uses for the video.
The other three are 120×90 pixels and are taken automatically by YouTube from three certain points in the video.

Supports all available Υoutube url formats, example: m.youtube.com/ , youtu.be/ 

---

<b>YoutubeChannelHeaderImage.java:</b> Given a Channel URL prints all image banner formats

Example output:

    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w1138-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj // 1138 x 188
    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w1707-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj // 1707 x 282
    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w2120-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj // 2120 x 350
    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w2276-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj // 2276 x 376
    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w2560-fcrop64=1,00005a57ffffa5a8-k-c0xffffffff-no-nd-rj // 2560 x 423
    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w320-fcrop64=1,00000000ffffffff-k-c0xffffffff-no-nd-rj // 320 x 180
    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w854-fcrop64=1,00000000ffffffff-k-c0xffffffff-no-nd-rj // 854 x 480
    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w1280-fcrop64=1,00000000ffffffff-k-c0xffffffff-no-nd-rj // 1280 x 720
    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w1920-fcrop64=1,00000000ffffffff-k-c0xffffffff-no-nd-rj // 1920 x 1080
    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w2120-fcrop64=1,00000000ffffffff-k-c0xffffffff-no-nd-rj // 2120 x 1192
    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w320-fcrop64=1,32b75a57cd48a5a8-k-c0xffffffff-no-nd-rj // 320 x 52
    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w640-fcrop64=1,32b75a57cd48a5a8-k-c0xffffffff-no-nd-rj // 640 x 105
    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w960-fcrop64=1,32b75a57cd48a5a8-k-c0xffffffff-no-nd-rj // 960 x 158
    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w1280-fcrop64=1,32b75a57cd48a5a8-k-c0xffffffff-no-nd-rj // 1280 x 211
    https://yt3.ggpht.com/2fCpG8MNmWvT8zz7MBFVlPMOA07bekDqK7FgNrdbh7ldLccLMsU1UwKlI1t3SJ5vxNJoA5pIYw=w1440-fcrop64=1,32b75a57cd48a5a8-k-c0xffffffff-no-nd-rj // 1440 x 238
    
    
---

<b>YoutubeChannelProfileImage.java:</b> Given a Channel URL prints all profile image sizes

Example output:


    https://yt3.ggpht.com/ytc/AAUvwngD4-EVeyowak2O0YVcNtlls1lEUrxs7rFb_HauFw=s88-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwngD4-EVeyowak2O0YVcNtlls1lEUrxs7rFb_HauFw=s176-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwnhALZno_6ylOb_4wFlfdANjapjlZzGvziVr_tzB=s88-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwnhALZno_6ylOb_4wFlfdANjapjlZzGvziVr_tzB=s176-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwnh3Y1wjQXIbpf99Na8Bojkl8nubHd-T9zradnQhqA=s88-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwnh3Y1wjQXIbpf99Na8Bojkl8nubHd-T9zradnQhqA=s176-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwngpc8jE-l9LhsaVZkmNW1RbbsD32ZVlMeqDR4Q_Cw=s48-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwngpc8jE-l9LhsaVZkmNW1RbbsD32ZVlMeqDR4Q_Cw=s88-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwngpc8jE-l9LhsaVZkmNW1RbbsD32ZVlMeqDR4Q_Cw=s176-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwngpc8jE-l9LhsaVZkmNW1RbbsD32ZVlMeqDR4Q_Cw=s900-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwngpc8jE-l9LhsaVZkmNW1RbbsD32ZVlMeqDR4Q_Cw=s200-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwngpc8jE-l9LhsaVZkmNW1RbbsD32ZVlMeqDR4Q_Cw=s900-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwngpc8jE-l9LhsaVZkmNW1RbbsD32ZVlMeqDR4Q_Cw=s900-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwngpc8jE-l9LhsaVZkmNW1RbbsD32ZVlMeqDR4Q_Cw=s900-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwngpc8jE-l9LhsaVZkmNW1RbbsD32ZVlMeqDR4Q_Cw=s900-c-k-c0x00ffffff-no-rj
    https://yt3.ggpht.com/ytc/AAUvwngpc8jE-l9LhsaVZkmNW1RbbsD32ZVlMeqDR4Q_Cw=s900-c-k-c0x00ffffff-no-rj
