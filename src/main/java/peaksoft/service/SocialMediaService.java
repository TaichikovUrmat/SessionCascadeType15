package peaksoft.service;

import peaksoft.entity.Person;
import peaksoft.entity.SocialMedia;

public interface SocialMediaService {

    // Crud
    String saveSocialMedia(SocialMedia socialMedia);

    void deleteSocialMedia(SocialMedia socialMedia);

    void assignSocialMediaToPerson(Long personId, Long socialMediaId);


}
