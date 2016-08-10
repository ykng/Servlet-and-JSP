package model;

public class SiteEVLogic {
	public void like(SiteEV site){
		int like = site.getLike();
		site.setLike( like + 1 );
	}

	public void dislike(SiteEV site){
		int dislike = site.getDislike();
		site.setDislike(dislike + 1);
	}
}
