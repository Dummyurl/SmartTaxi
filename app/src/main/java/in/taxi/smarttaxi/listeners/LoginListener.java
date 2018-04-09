package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.AuthBean;

public interface LoginListener {

    void onLoadCompleted(AuthBean authBean);

    void onLoadFailed(String error);
}
