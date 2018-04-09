package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.LandingPageBean;

public interface LandingPageListener {

    void onLoadFailed(String error);

    void onLoadCompleted(LandingPageBean landingPageBean);

}
