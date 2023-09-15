public interface SocialMedia {

    //support WhatsApp, Facebook, Instagram
    void chatWithFriends();

    //support Facebook, Instagram
    void publishPost(Object post);

    //support WhatsApp, Facebook, Instagram
    void sendPhotosAndVideos();

    //support WhatsApp, Facebook
    void groupVideoCall(String... users);

}
