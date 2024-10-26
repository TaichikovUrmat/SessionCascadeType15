package peaksoft.service.impl;

import peaksoft.dao.Impl.SocialMediaDaoImpl;
import peaksoft.dao.SocialMediaDao;
import peaksoft.entity.SocialMedia;
import peaksoft.service.SocialMediaService;

public class SocialMediaServiceImpl  implements SocialMediaService {
     private final SocialMediaDao socialMediaDao = new SocialMediaDaoImpl();
    @Override
    public String saveSocialMedia(SocialMedia socialMedia) {
        return socialMediaDao.saveSocialMedia(socialMedia);
    }

    @Override
    public void deleteSocialMedia(SocialMedia socialMedia) {
        socialMediaDao.deleteSocialMedia(socialMedia);
    }

    @Override
    public void assignSocialMediaToPerson(Long personId, Long socialMediaId) {
     socialMediaDao.assignSocialMediaToPerson(personId, socialMediaId);
    }
}
