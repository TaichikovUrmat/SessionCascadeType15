package peaksoft.dao;

import peaksoft.entity.SocialMedia;

public interface SocialMediaDao {

    // Crud
    String saveSocialMedia(SocialMedia socialMedia);

    void deleteSocialMedia(SocialMedia socialMedia);

    void assignSocialMediaToPerson(Long personId, Long socialMediaId);

}
