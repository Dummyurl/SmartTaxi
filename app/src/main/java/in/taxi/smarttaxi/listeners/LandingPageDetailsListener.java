package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.LandingPageBean;

public interface LandingPageDetailsListener {

    void onLoadCompleted(LandingPageBean landingPageListBean);

    void onLoadFailed(String error);
}
